<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<form action="/Guestbook3/insert" method="get">
		<table border="1" width="540px">
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
				<td>비밀번호</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td colspan="4"><textarea cols="72" rows="5" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="4"><button type="submit">등록(확인)</button></td>
			</tr>
		</table>
	</form>
	<br>


	<c:forEach items="${requestScope.personList}" var="personVo">
	<table border="1" width="540px">
			<tr>
				<td>${personVo.personId}</td>
				<td>${personVo.name}</td>
				<td>${personVo.regDate}</td>
				<td><a href="/Guestbook3/deleteForm?personId=${personVo.personId}">삭제</a></td>
			</tr>
		<tr>
			<td colspan="4">${personVo.content}</td>
		</tr>
	</table>
	</c:forEach>
	<br>

	<br>
</body>
</html>