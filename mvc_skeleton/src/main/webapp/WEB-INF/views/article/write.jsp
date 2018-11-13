<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
  <title>Write</title>
</head>
<body>
<form:form modelAttribute="article">
  content: <form:input path="content"/><br/>
  <input type="submit" value="Write"/>
</form:form>
</body>
</html>