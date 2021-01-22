<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%-- */<% %><style type="text/css">
#form-design  this is calling by id, give this name to div 
{
By id
border:1px solid black;
 width:500px; 
 height:500px;
 margin:10px 0px 0px 200px this means( Top Right Bottom Left
 }
once u do this effect will not shows , for that we have call by id or class or tag
There is css Box -Margin Border Padding Content
By tag
input{
padding:10px;
this is for content
}


label{
font-family: serif;
font-size: large;;
font-weight: bold;
this is for lable
}
By class
.btn{
background-color: gray;
width:200px;
height:100px;
this is for submit button
}


</style>*/
 --%>

<head>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>

<%@ include file="header.jsp"%>

<!-- to get css file or make a connection and still not make connection so we have to go in spring-servlet.xml to add -->
<!-- We will not use this link once we got bootstrap and js
<link rel="stylesheet" href="resources/css/custom.css"> -->

<!-- <link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="resources/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
(this all contains is copied to header.jsp) and this is comment out
 -->
</head>
<body>
	<%-- <%--css- cascading style sheets --%> 
	<!-- <div id="form-design" we are using a bootstrap in here > -->
		<div class="container">
		<div class="panel">
		<div class="panel default">
		<div class="rows ">
		<div class=col-md-2></div>
		<div class ="col-md-8 jumbotron">
		<form action="save_user" method="post" class="form-horizontal">
		<fieldset>
		<legend>User Registration Form</legend>
			<div class="form-group">
				<label>User Name</label> <input type="text" name="username" class="form-control">
			</div>
			<div class="form-group">
				<label>Password</label> <input type="password" name="password" class="form-control">
			</div>
			<div class="form-group">
				<label>DOB</label> <input type="date" name="dob" class="form-control">
			</div>
			<div class="form-group">
				<label>Email</label> <input type="email" name="email" class="form-control">
			</div>
			<div class="form-group">
				<label>Mobile No</label> <input type="number" name="mobileNo" class="form-control">
			</div>
			<div class="form-group">
				<label>Address</label> <input type="text" name="address" class="form-control">
			</div>
			<div class="form-group">
				<label>Gender</label> <input type="radio" name="gender" value="Male">Male
				<input type="radio" name="gender" value="Female">Female
			</div>
			<div class="form-group">
				<label>Hobbies</label> 
					<input type="checkbox" name="hobbies" value="Reading" class="form-check">Reading 
					<input type="checkbox"	name="hobbies" value="Writing" class="form-check">Writing
					 <input type="checkbox" name="hobbies" value="Swimming" class="form-check">Swimming
					  <input type="checkbox" name="hobbies" value="Drawing" class="form-check">Drawing 
					  <input type="checkbox" name="hobbies" value="Fighting" class="form-check">Fighting 
					  <input type="checkbox" name="hobbies" value="Acting" class="form-check">Acting
			</div>
			<div class="form-group">
				<label>Nationality</label> <select name="Nationality" class="form-control">
					<option value="Nepalese">Nepalese</option>
					<option value="Chinese">Chinese</option>
					<option value="Korean">Korean</option>
					<option value="American">American</option>
					<option value="Indian">Indian</option>
					<option value="NepaleseAmerican">NepaleseAmerican</option>
					<option value="IndianAmerican">IndianAmerican</option>
					<option value="Vietnamese">Vietnamese</option>
				</select>
			</div>
			<div class="form-group">
				<label>Comments</label>
				<textarea rows="6" cols="20" name="comments" class="form-control"></textarea>
			</div>
			<div class="form-group">
				<input type="submit" value="Submit"  class="btn btn-success">
			</div>

		</fieldset>
		</form>
	</div>
	<div class=col-md-2></div>
	</div>
	</div>
	</div>
	</div>
</body>
</html>