import axios from 'axios'

const USERS_REST_API_URL = 'https://8080-ebaadaebdaebdbdebcfdcceffaadfba.examlyiopb.examly.io/admin';

class UserService {

    getProducts(){
        return axios.get(USERS_REST_API_URL);
    }
    addProduct(product){
        return axios.post(USERS_REST_API_URL + '/addProduct' , product);
    }

    getProduct(productId){
        return axios.get(USERS_REST_API_URL + '/productEdit/' + productId);
    }

    updateProduct(product, productId){
        return axios.post(USERS_REST_API_URL + '/productEdit/' + productId, product);
    }

    productDelete(productId){
        return axios.delete(USERS_REST_API_URL + '/delete/' + productId);
    }

    getCartProducts(){
        return axios.get("https://8080-ebaadaebdaebdbdebcfdcceffaadfba.examlyiopb.examly.io/Cart");
    }
    deleteCartProduct(productId){
        return axios.delete("https://8080-ebaadaebdaebdbdebcfdcceffaadfba.examlyiopb.examly.io/Cart/delete/"+productId)
    }
    addToCart(product){
        return axios.post("https://8080-ebaadaebdaebdbdebcfdcceffaadfba.examlyiopb.examly.io/",product);
    }
}

export default new UserService();