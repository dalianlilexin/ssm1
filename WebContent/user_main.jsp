<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户管理</title>
</head>
<body>
	<h3>程序主页面</h3>
	<table border="1">
		<tr>
			<td>id</td>
			<td>user_name</td>
			<td>age</td>
			<td>remark</td>
		</tr>

		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.user_name }</td>
				<td>${user.age }</td>
				<td>${user.remark}</td>
				<td><a href="deleteUser?id=${user.id}"
					onClick="return confirm('确定删除?');">删除</a> <a
					href="user_update.jsp?id=${user.id}&user_name=${user.user_name }&age=${user.age }&remark=${user.remark }">更新</a>
				</td>
			</tr>
		</c:forEach>

	</table>
	<br>
	<br>
	<a href="create_new.jsp">创建新用户</a>
	<br>
	<br>
	<a href="user_findbyid.jsp">精确查询</a>
	<br>
	<br>
	<a href="user_findbyname.jsp">模糊查询</a>
	<br>
	<br>

</body>
</html>