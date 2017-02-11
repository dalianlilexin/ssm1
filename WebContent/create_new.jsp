<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加用户</title>
</head>
<body>
	<form action="saveUser" method="post">
		<table>
			<tr>
				<td>ID</td>
				<td><input name="id" type="text" /></td>
			</tr>
			<tr>
				<td>用户名</td>
				<td><input name="user_name" type="text" /></td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><input type="text" name="age"/></td>
			</tr>
			<tr>
				<td>地址</td>
				<td><input name="remark" type="text"/></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="添加"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>