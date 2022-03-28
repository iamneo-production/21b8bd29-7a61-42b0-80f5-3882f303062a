import Products from "./components/Products";
import AddProduct from "./components/Products/AddProduct";
import ProductEdit from "./components/Products/ProductEdit";
import Home from "./components/Home";
import Cart from "./components/Cart";
import MyOrder from "./components/Order";
import SignUp from "./components/Auth/SignUp";
import Login from "./components/Auth/Login";
import {
  BrowserRouter as Router, 
  Routes, 
  Route
} from 'react-router-dom';


const App = () => {
  return (<>
  <Router>
  <Routes>
    <Route exact path="/signup" element={<SignUp />} />
    <Route exact path="/login" element={<Login />} />
    <Route exact path="/" element={<Home />} />
    <Route exact path="/Cart" element={<Cart />} />
    <Route exact path="/MyOrder" element={<MyOrder />} />
    <Route exact path="/products" element={<Products />} />
    <Route exact path="/addProduct" element={<AddProduct />} />
    <Route exact path="/productEdit" element={<ProductEdit />} />
  </Routes>
  </Router> 
  </>)
}

export default App;