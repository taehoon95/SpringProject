<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title>메인 페이지</title>
<link rel="stylesheet" href="https://unpkg.com/mvp.css">
</head>
<body style=" text-align: center; ">
	<h1>등록</h1>
	<form action="login" method="post" style=" margin: auto; ">
		<div>
			<input type="text" name="name" value="asd" required="required"><br>
			<input type="text" name="age" value="11" required="required"><br>
			<input type="submit" value="등록" style=" cursor: pointer">
		</div>
	</form>
</body>