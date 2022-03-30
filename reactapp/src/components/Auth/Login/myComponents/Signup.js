import React from "react";
import { useState, useEffect } from "react";

function Signup() {
  const initialValues = { username: "", email: "", mobileNumber: "",password: "",confirmPassword: ""};
  const [formValues, setFormValues] = useState(initialValues);
  const [formErrors, setFormErrors] = useState({});
  const [isSubmit, setIsSubmit] = useState(false);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormValues({ ...formValues, [name]: value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    setFormErrors(validate(formValues));
    setIsSubmit(true);
  };

  useEffect(() => {
    console.log(formErrors);
    if (Object.keys(formErrors).length === 0 && isSubmit) {
      console.log(formValues);
    }
  }, [formErrors]);
  const validate = (values) => {
    const errors = {};
    const regex = /^[^\s@]+@[^\s@]+\.[^\s@]{2,}$/i;
    if (!values.username) {
      errors.username = "Username is required!";
    }
    if (!values.email) {
      errors.email = "Email is required!";
    } else if (!regex.test(values.email)) {
      errors.email = "This is not a valid email format!";
    }
    if(values.mobileNumber.length!=10)
    errors.mobileNumber="It should of 10 digits";
    if (!values.password) {
      errors.password = "Password is required";
    } else if (values.password.length < 4) {
      errors.password = "Password must be more than 4 characters";
    } else if (values.password.length > 10) {
      errors.password = "Password cannot exceed more than 10 characters";
    }
    let pl=values.password.length;
    let cpl=values.confirmPassword.length;
    if (!values.confirmPassword) {
      errors.confirmPassword = "Password is required";
    } else if (values.confirmPassword.length < 4) {
      errors.confirmPassword = "Password must be more than 4 characters";
    } else if (values.confirmPassword.length > 10) {
      errors.confirmPassword = "Password cannot exceed more than 10 characters";
    }else if(values.password!=values.confirmPassword)
  errors.confirmPassword = "Passwords should match"


    return errors;
  };

  return (
    <div className="container">
      {Object.keys(formErrors).length === 0 && isSubmit ? (
        <div className="ui message success">Signed in successfully</div>
      ) : (
        <p>.</p>
        //<pre>{JSON.stringify(formValues, undefined, 2)}</pre>
      )}

      <form onSubmit={handleSubmit}>
        <h1 align="center">Sign Up</h1>
        <div className="ui divider"></div>
        <div className="ui form">
        <div className="field">
            <label>Email</label>
            <input
              type="text"
              name="email"
              placeholder="Email"
              value={formValues.email}
              onChange={handleChange}
            />
          </div>
          <p>{formErrors.email}</p>
          <div className="field">
            <label>Username</label>
            <input
              type="text"
              name="username"
              placeholder="Username"
              value={formValues.username}
              onChange={handleChange}
            />
          </div>
          <p>{formErrors.username}</p>
          <div className="field">
            <label>Mobile Number</label>
            <input
              type="text"
              name="mobilenumber"
              placeholder="enter mobile number"
              value={formValues.mobileNumber}
              onChange={handleChange}
            />
          </div>
          <p>{formErrors.mobileNumber}</p>
          <div className="field">
            <label>Password</label>
            <input
              type="text"
              name="password"
              placeholder="Password"
              value={formValues.password}
              onChange={handleChange}
            />
          </div>
          <p>{formErrors.password}</p>
          <div className="field">
            <label>Confirm Password</label>
            <input
              type="confirmPassword"
              name="confirmPassword"
              placeholder="confirmPassword"
              value={formValues.confirmPassword}
              onChange={handleChange}
            />
          </div>
          <p>{formErrors.confirmPassword}</p>
          <button className="fluid ui button blue">Submit</button>
         
        </div>
      </form>
    </div>
  );
}

export default Signup;
 