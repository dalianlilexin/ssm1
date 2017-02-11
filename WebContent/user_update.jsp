<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>更新用户</title>
</head>
<body>                                        
	<form action="updateUser" method="post" onsubmit="return confirm('确认修改信息吗?');">
		<table>
			<tr>
				<td>ID</td>
				<td>${param.id } <input name="id" type="hidden" value="${param.id}"></td>
			</tr>
			<tr>
				<td>用户名</td>
				<td><input name="user_name" type="text" value="${param.user_name }"></td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><input name="age" type="text" value="${param.age }"></td>
			</tr>
			<tr>
				<td>地址</td>
				<td><input type="text" name="remark" value="${param.remark}"></td>
			</tr>

			<tr>
				<td><input type="submit" value="更新"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>