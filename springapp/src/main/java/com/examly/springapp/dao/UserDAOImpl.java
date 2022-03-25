package com.examly.springapp.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.examly.springapp.model.LoginModel;
import com.examly.springapp.model.UserModel;

@Repository
public class UserDAOImpl implements UserDAO{
	
	private EntityManager entityManager;
	
	@Autowired
	public UserDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public boolean create(UserModel user) {
		Session session = entityManager.unwrap(Session.class);
		Transaction t = session.beginTransaction();
		boolean check = true;
		try {
			session.save(user);
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
	public UserModel getUser(int userId) {
		Session session = entityManager.unwrap(Session.class);
		UserModel user = session.get(UserModel.class, userId);
		return user;
	}
	
	public boolean checkUser(LoginModel loginData) {
		Session session = entityManager.unwrap(Session.class);
		String hql = "from UserModel u where u.email = '"+loginData.getEmail()+
				"' and u.password = '"+loginData.getPassword()+"'"; 
		Query<?>query = session.createQuery(hql);
		UserModel user = (UserModel) query.uniqueResult();
		System.out.println(user);
		if(user==null) {
			return false;
		}
		else {
			return true;
		}
	}
	
}
