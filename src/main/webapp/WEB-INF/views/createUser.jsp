<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
<%@ include file ="header.jsp" %>
</head>
<body>
	<div>

		<form action="save_user" method="post">
			<div>
				<label>User Name</label> <input type="text" name="username">
			</div>
			<div>
				<label>Password</label> <input type="password" name="password">
			</div>
			<div>
				<label>dob</label> <input type="date" name="dob">
			</div>
			<div>
				<label>Email</label> <input type="email" name="email">
			</div>
			<div>
				<label>Mobile No</label> <input type="number" name="mobileNo">
			</div>
			<div>
				<label>Address</label> <input type="text" name="address">
			</div>
			<div>
				<label>Gender</label>
				 <input type="radio" name="gender" value="Male">Male
				<input type="radio" name="gender" value="Female">Female
			</div>
			<div>
				<label>Hobbies</label> 
				<input type="checkbox" name="hobbies" value="Reading">Reading
				<input type="checkbox" name="hobbies" value="Writing">Writing
				<input type="checkbox" name="hobbies" value="Swimming">Swimming
				<input type="checkbox" name="hobbies" value="Drawing">Drawing
				<input type="checkbox" name="hobbies" value="Fighting">Fighting
				<input type="checkbox" name="hobbies" value="Acting">Acting
			</div>
			<div>
				<label>Nationality</label> 
				<select name="Nationality">
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
			<div>
			<label>Comments</label>
			<textarea rows="6" cols="20" name="comments"></textarea>
			</div>
			<div>
				<input type="submit" value="Submit">
			</div>


		</form>
	</div>
</body>
</html>