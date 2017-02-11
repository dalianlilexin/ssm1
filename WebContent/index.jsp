<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
</head>
<body>
	<form action="loginUser" method="post">
		<table>
			<tr>
				<td>ID</td>
				<td><input name="id" type="text" value="1"/></td>
			</tr>
			<tr>
				<td>用户名</td>
				<td><input name="user_name" type="text" value="tony"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="登录"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
	<a href="create_new.jsp">新用户注册</a>
</body>
</html>