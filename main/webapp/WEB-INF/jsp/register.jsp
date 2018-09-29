<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;
}


/* Full-width input fields */
input[type=text],input[type=password],input[type=email],textarea{
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
}

input[type=text]:focus,input[type=password]:focus,input[type=email]:focus,textarea:focus{
    background-color: #ddd;
    outline: none;
}

hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
    border-color: red;
    
}

/* Set a style for all buttons */
.resetbtn, .signupbtn {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    border: none;
    cursor: pointer;
    opacity: 0.9;
}

.resetbtn:hover, .signupbtn:hover {
    opacity:1;
}

/* Extra styles for the cancel button */
.resetbtn {
    padding: 14px 20px;
    background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.resetbtn, .signupbtn {
  float: left;
  width: 50%;
  height: 50px;
}

/* Add padding to container elements */
.container {
    padding: 16px;
}
 .container1{
   padding: 16px;
   background-color:white;
   width: 400px;
   margin-top: 40px;
   border: thick solid black;
   
 }

/* Clear floats */
.clearfix::after {
    content: "";
    clear: both;
    display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
    .cancelbtn, .signupbtn {
       width: 100%;
    }
}
</style>
<body  background="images/register.jpg">
<script src="https://code.jquery.com/jquery-1.9.1.min.js"></script>
    <script>
   $( document ).ready(function() {  
	   var msg = '${msg}';
	   if(msg!="")
    		alert(msg);

   });
    </script>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body>
<div class="w3-container  w3-animate-bottom">
 <center>
 <div class="container1">

<form action="signup" method="post" commandName="user" style="border:1px solid #ccc">
  <div class="container">
    <h1>Registration</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
   
    <i class="fa fa-user icon"></i>
     <label for="Name"><b>Name</b></label>
     <input type="text" placeholder="Enter Name" name="name" pattern="[a-z][A-Z]{1-15}"
        title="firstname should only contain letters. e.g. John" required>
     
     <i class="fa fa-home icon"></i>
     <label for="Address"><b>Address</b></label>
   <textarea rows="3" cols="43" placeholder="Enter Address" name="address" required>
   </textarea><br><br>
        
        <label for="Gender"><b>Gender</b></label>
        <input type="radio" name="gender" value="male" checked> Male
  <input type="radio" name="gender" value="female"> Female<br><br>
  
    <i class="fa fa-key icon"></i>
	 <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8-16}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required>
    
    <i class="fa fa-envelope icon"></i>
    <label for="email"><b>Email id</b></label>
    <input type="email" placeholder="Enter Email" name="emailId" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required>
    
    <i class="fa fa-phone icon"></i>
       <label for="phoneNo"><b>Phone No</b></label>
    <input type="text" placeholder="Enter Phone No" name="phoneNo" pattern="[7-9]{1}[0-9]{9}" title="Phone number with 7-9 and remaing 9 digit with 0-9" required>
    
    <div>
    <p style="color:green;">${error}</p>
    	
    </div>

    <div class="clearfix">
      <input type="reset" class="resetbtn" value="Reset"/>
     <a href="/success"> <input type="submit" class="signupbtn" value="Submit"/></a>
      <script>
</script>
    </div>
  </div>
</form>

</div>
</body>
</html>
