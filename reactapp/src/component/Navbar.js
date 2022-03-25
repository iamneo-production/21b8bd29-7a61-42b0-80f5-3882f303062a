import React from 'react'
import PropTypes from 'prop-types'
import { Link } from 'react-router-dom';

export default function Navbar(props) {
    return (
        <nav id="userNavbar" className={`navbar navbar-expand-lg navbar`}>
            <div className="container-fluid">
                <Link className="navbar-brand" to="/home">{props.title}</Link>
                
                <div className="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                        <li className="nav-item">
                            <Link id="furnitureHomeButton" className="nav-link" aria-current="page" to="/home">Home</Link>
                        </li>
                        <li className="nav-item">
                            <Link id="furnitureCartButton" className="nav-link" to="/cart">{props.aboutText1}</Link>
                        </li>
                        <li className="nav-item">
                            <Link id="furnitureOrderButton" className="nav-link" to="/orders">{props.aboutText2}</Link>
                        </li>
                    </ul>
                    
                </div>

                <Link id="logoutButton"className="navbar-brand" to="/">{props.aboutText3}</Link>
            </div>
        </nav>
    )
}

Navbar.propTypes = {
    title: PropTypes.string.isRequired,
    aboutText: PropTypes.string.isRequired
}

// Navbar.defaultProps = {
//     title: 'Set title here',
//     aboutText: 'Home'
//   };