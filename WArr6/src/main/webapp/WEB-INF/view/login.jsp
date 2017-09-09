<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>
<body>

<form:form modelAttribute="user" method="post">

		<div>
			<form:label path="email">Email</form:label>
			<form:input type="email" path="email" />
			<form:errors path="email" />
		</div>
		<div>
			<form:label path="password">Password</form:label>
			<form:input type="password" path="password" />
			<form:errors path="password" />
		</div>

		<input type="submit"></input>
	</form:form>



</body>
</html>