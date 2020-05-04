<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HOME</title>
</head>
<body>
	<form action="sendMail" method="post">
		<table>

			<tr>
				<td>To:</td>
				<td><input type="text" name="toMailId" placeholder="text1"></td>
			</tr>
			<tr>
				<td>Subject:</td>
				<td><input type="text" name="subject" placeholder="text2"></td>
			</tr>
			<tr>
				<td>Body:</td>
				<td><textarea row="5" name="body"></textarea></td>
			</tr>

		</table>

		<input type="submit" name="submit">
	</form>
</body>
</html>