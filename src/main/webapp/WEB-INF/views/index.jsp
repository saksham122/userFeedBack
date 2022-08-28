<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Feedback</title>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box;
}

input[type=text], select, textarea {
	width: 100%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	margin-top: 6px;
	margin-bottom: 16px;
	resize: vertical;
}

input[type=email], select, textarea {
	width: 100%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	margin-top: 6px;
	margin-bottom: 16px;
	resize: vertical;
}

input[type=submit] {
	background-color: #42032C;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}

.container {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}
</style>
</head>
<body>

	<h3 align="center">Feedback Form</h3>

	<div class="container">
		<form action="formhandeler" method="post">
			<label for="fname">First Name</label> <input type="text"
				id="firstname" name="firstname" placeholder="Your name.."> <label
				for="lname">Last Name</label> <input type="text" id="lastname"
				name="lastname" placeholder="Your last name.."> <label
				for="lname">Email</label> <input type="email" id="email"
				name="email" placeholder="Your email.."><label for="subject">Suggestion</label>
			<textarea id="subject" name="subject" placeholder="Write something.."
				style="height: 200px"></textarea>

			<input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>