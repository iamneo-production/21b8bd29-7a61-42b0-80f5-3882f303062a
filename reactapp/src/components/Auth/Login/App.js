import logo from './logo.svg';
import './App.css';
import Loginpage from "./myComponents/Loginpage";
import Signup from "./myComponents/Signup";
import Login from "./myComponents/Login";
import {BrowserRouter as Router, Switch, Route,Link} from "react-router-dom";
import "./myComponents/menustyles.css";


function App() {
  return (
    <Router>
      <Loginpage/>
    <nav className='navstyle'>
      <ul>
     <li> <Link to="/">Signup</Link></li>
     <p style={{color: "white"}}>If you have already signed in then click here</p>
     <li> <Link to="/login">Login</Link></li>
      </ul>
    </nav>
    <Switch>
         <Route exact path="/" component={Signup} />
          <Route exact path="/login" component={Login} />
    </Switch>
  </Router>
  );
}
export default App;