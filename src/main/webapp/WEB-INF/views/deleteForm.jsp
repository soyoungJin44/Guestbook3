<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/Guestbook3/delete" method="get">   
		<table>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password"></td>
				<td><button type="submit">삭제</button></td>
				
			</tr>
		</table>
		<input type="text" name="personId" value="${param.personId}">
	</form>
	
	<br><br>
	<a href="/Guestbook3/list">메인으로 돌아가기</a>
</body>
</html>