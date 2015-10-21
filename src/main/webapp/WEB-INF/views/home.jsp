<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<spring:url value="/" var="loginForm" />
	<form:form action="${loginForm}" method="post" modelAttribute="user">
		User
		<form:input path="username" />
		Password
		<form:input path="password" />
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>