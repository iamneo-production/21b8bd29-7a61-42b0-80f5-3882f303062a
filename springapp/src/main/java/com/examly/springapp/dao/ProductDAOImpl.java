package com.examly.springapp.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.examly.springapp.model.ProductModel;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
private EntityManager entityManager;
	
	@Autowired
	public ProductDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<ProductModel> getProduct() {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery("from ProductModel");
		List<ProductModel> products = query.getResultList();
		session.close();
		return products;
	}

	@Override
	public boolean saveProduct(ProductModel product) {
		Session session = entityManager.unwrap(Session.class);
		Transaction t = session.beginTransaction();
		boolean check = true;
		try {
			session.save(product);
			t.commit();
		}
		catch(Exception e) {
			check = false;
			t.rollback();
		}
		finally {
			session.close();
		}
		return check;
	}

	@Override
	@Transactional
	public ProductModel getProduct(int id) {
		Session session = entityManager.unwrap(Session.class);
		ProductModel product = session.find(ProductModel.class, id);
		return product;
	}

	@Override
	public boolean updateProduct(ProductModel product) {
		Session session = entityManager.unwrap(Session.class);
		Transaction t = session.beginTransaction();
		boolean check = true;
		try {
			session.update(product);
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
			check = false;
		}
		finally {
			session.close();
		}
		return check;
	}

}
