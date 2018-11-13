<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<form:form modelAttribute="article">
    <form:hidden path="id"/>
    content: <form:input path="content"/><br/>

    <input type="submit" value="Edit"/>
</form:form>
</body>
</html>