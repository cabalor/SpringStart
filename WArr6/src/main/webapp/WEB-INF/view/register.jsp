<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>hellloooooooo<p]>

<form:form method="post" modelAttribute="user"/>
<form:errors path="*"></form:errors>
<p><form:label path="username">username</form:label>
<form:input path="username" id="username"/>
<form:errors path="username"/></p>
<p><form:label path="password">password</form:label>
<form:input type="password" path="password" id="password"/>
<form:errors path="password"/></p>
<p><form:label path="email">email</form:label>
<form:input type="email" path="email" id="email"/>
<form:errors path="email"/></p>
<input type="submit" value="wyslij"></input>
<input type="reset" value="resetuj"></input>
</body>
</html>