<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
		//this will help to use for checkbox 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
<%@ include file ="header.jsp" %>
</head>
<body>
	<div>

		<form action="update_user" method="post">
			<div>
				<label>Id</label> <input type="text" name="id" readonly value="${user.id}")>
			</div>
			<div>
				<label>User Name</label> <input type="text" name="username" value="${user.username}">
			</div>
			<div>
				<label>Password</label> <input type="password" name="password" value="${user.password}">
			</div>
			<div>
				<label>dob</label> <input type="date" name="dob" value="${user.dob}">
			</div>
			<div>
				<label>Email</label> <input type="email" name="email" value="${user.email}">
			</div>
			<div>
				<label>Mobile No</label> <input type="number" name="mobileNo" value="${user.mobileNo}">
			</div>
			<div>
				<label>Address</label> <input type="text" name="address" value="${user.address}">
			</div>
			<div>
				<label>Gender</label>
				 <input type="radio" name="gender" value="Male"${user.gender=='Male'?'checked':'' }>Male
				<input type="radio" name="gender" value="Female"${user.gender=='Female'?'checked':'' }>Female
			</div>
			<div>
				<label>Hobbies</label> 
				<input type="checkbox" name="hobbies" value="Reading"
				<c:if test="${fn:contains(user.hobbies,'Reading')}">checked</c:if>
				>Reading
				
				<input type="checkbox" name="hobbies" value="Writing"
				<c:if test="${fn:contains(user.hobbies,'Writing')}">checked</c:if>
				>Writing
				<input type="checkbox" name="hobbies" value="Swimming"
				<c:if test="${fn:contains(user.hobbies,'Swimming')}">checked</c:if>
				>Swimming
				<input type="checkbox" name="hobbies" value="Drawing"
				<c:if test="${fn:contains(user.hobbies,'Drawing')}">checked</c:if>
				>Drawing
				<input type="checkbox" name="hobbies" value="Fighting"
				<c:if test="${fn:contains(user.hobbies,'Fighting')}">checked</c:if>
				>Fighting
				<input type="checkbox" name="hobbies" value="Acting"
				<c:if test="${fn:contains(user.hobbies,'Acting')}">checked</c:if>
				>Acting
			</div>
			<div>
				<label>Nationality</label> 
				<select name="Nationality">
				<option value="Nepalese"${user.nationality=='Nepalese'?'selected':'' }>Nepalese</option>
				<option value="Chinese"${user.nationality=='Chinese'?'selected':'' }>Chinese</option>
				<option value="Korean"${user.nationality=='Korean'?'selected':'' }>Korean</option>
				<option value="American"${user.nationality=='American'?'selected':'' }>American</option>
				<option value="Indian"${user.nationality=='Indian'?'selected':'' }>Indian</option>
				<option value="NepaleseAmerican"${user.nationality=='NepaleseAmerican'?'selected':'' }>NepaleseAmerican</option>
				<option value="IndianAmerican"${user.nationality=='IndianAmerican'?'selected':'' }>IndianAmerican</option>
				<option value="Vietnamese"${user.nationality=='Vietnamese'?'selected':'' }>Vietnamese</option>
				</select>
			</div>
			<div>
			<label>Comments</label>
			<textarea rows="6" cols="20" name="comments">${user.comments}</textarea>
			</div>
			<div>
				<input type="submit" value="Submit">
			</div>


		</form>
	</div>
</body>
</html>