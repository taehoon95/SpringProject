<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="https://unpkg.com/mvp.css">
</head>
<body style=" text-align: center; ">
	<h1>등록완료</h1>
	
	<table>
		<tr>
			<th>이름</th>
			<th>나이</th>	
		</tr>
		<c:forEach var="i" items="${ pList }">	
		<tr>
			<td>${i.name}</td>
			<td>${i.age}</td>					
		</tr>
		</c:forEach>	
	</table>
</body>
</html>