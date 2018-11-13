<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Article list</title>
  <style>
    table, tr, td {
      border: 1px solid black;
      text-align:center;
    }
  </style>
</head>
<body>
<a href="/article/write">글쓰기</a>
<br/>
<table>
  <thead>
  <tr>
    <td>ID</td>
    <td>내용</td>
    <td>작성자</td>
    <td>조회수</td>
    <td>생성날짜</td>
    <td></td>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="a" items="${articles}">
    <tr>
      <td>${a.id}</td>
      <td>${a.content}</td>
      <td>${a.author}</td>
      <td>${a.hit}</td>
      <td>${a.createdAt}</td>
      <td>
        <a href="/article/edit?id=${a.id}">수정</a><br/>
        <a href="/article/delete?id=${a.id}">삭제</a>
      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>

</body>
</html>
