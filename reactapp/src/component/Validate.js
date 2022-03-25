function Validate(values) {
    const errors = {};
    const regex = /^[^\s@]+@[^\s@]+\.[^\s@]{2,}$/i;

    // const handleUpClick = (msg)=>{
    //         props.showAlert("Error", );msg
    // }
    if (!values.email) {
        errors.email = "Email is required!";
        // handleUpClick(errors.email);
    } 

    else if (!regex.test(values.email)) {
        errors.email = "This is not a valid email format!";
    }

    

    if (!values.username) {
        errors.username = "Username is required";
    }

    if (!values.mobilenumber) {
        errors.mobilenumber = "Mobile Number  is required";
    }

    else if(values.mobilenumber.length!==10)
    {
        errors.mobilenumber="Mobile Number should be 10 characters";
    }

    if (!values.password) {
        errors.password = "Password is required";
    }

    else if (values.password.length <= 4) {
        console.log(values.passsword);
        errors.password = "Password must be more than 4 characters";
    }
    
    else if (values.password.length > 10) {
        errors.password = "Password cannot exceed more than 10 characters";
    }

    if (!values.confirmpassword) {
        errors.confirmpassword = "Enter the Password To Match";
    }

    else if (values.confirmpassword.length <= 4) {
        errors.confirmpassword = "Confirm Password must be more than 4 characters";
    }
    
    else if (values.confirmpassword.length > 10) {
        errors.confirmpassword = "Connfirm Password cannot exceed more than 10 characters";
    }
    

    else if(values.passsword!==values.confirmpassword)
    {
        console.log(values.passsword);
        console.log(values.confirmpassword);
        errors.password = "Password Doesnot Match";
        errors.confirmpassword = "Password Doesnot Match";
    }

    return errors;
}

export default Validate;