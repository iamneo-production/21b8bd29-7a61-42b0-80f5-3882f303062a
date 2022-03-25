import "./App.css";
import Navbar from './component/Navbar';
import Login from './component/Login';
import Sign_Up from './component/Sign_Up';
import Alert from './component/Alert';
import Cart from './component/cart_page';
import Order from './component/order_page';
import { useState} from "react";

import Home from './component/home_page';

import {
  BrowserRouter as Router,
  Switch,
  Route
} from "react-router-dom";

function App() {
  
        const [alert, setAlert] = useState(null);
        
        const showAlert = (message, type)=>{
            setAlert({
              msg: message,
              type: type
            })
            setTimeout(() => {
                setAlert(null);
            }, 1500);
        }

        // showAlert("Light mode has been enabled", "success");

        return (
          <>
              <Router>
              {/* <Navbar title="E-Furniture" aboutText1="Cart" aboutText2="My order" aboutText3="Logout"/> */}

                <Alert alert={alert}/>

                <div className={"main container"}>
                    <Switch>
                    
                        <Route exact path="/">
                          
                          <Login showAlert={showAlert} />
                        </Route>
                        <Route path="/login">
                          <Login />
                        </Route>
                        <Route path="/signup">
                          <Sign_Up />
                        </Route>

                        <Route  path="/home">
                        <Navbar title="E-Furniture" aboutText1="Cart" aboutText2="My order" aboutText3="Logout"/>
                          <Home heading="WELCOME HOME"/>
                        </Route>

                        <Route path="/cart">
                        <Navbar title="E-Furniture" aboutText1="Cart" aboutText2="My order" aboutText3="Logout"/>
                          <Cart heading="WELCOME TO CART"/>
                        </Route>

                        <Route path="/orders">
                        <Navbar title="E-Furniture" aboutText1="Cart" aboutText2="My order" aboutText3="Logout"/>
                          <Order heading="WELCOME TO MY ORDERS"/>
                        </Route>
                    
                    </Switch>
                </div>
              </Router>

          </>
        );
}


export default App;
