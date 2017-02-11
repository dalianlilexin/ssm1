<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>模糊查询</title>
</head>
<body>
	<form method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td><input name="user_name" type="text" id="un"/></td>
			</tr>
			<tr>
				<td><input type="button" value="查询" onclick="findByNameUser()"></td>
			</tr>
		</table>
	</form>
	
	<div id="box"></div>
	
	<script type="text/javascript">
	var un = document.getElementById("un");
	
	
	function findByNameUser(){
		var xmlHttp = null;
		
		if(window.XMLHttpRequest){
			xmlHttp = new XMLHttpRequest();
		}else{
			xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		
		xmlHttp.onreadystatechange = function(){
			if(xmlHttp.status == 200 && xmlHttp.readyState == 4){
				var box = document.getElementById("box");
				box.innerHTML = xmlHttp.responseText;
			}
		}
	
		xmlHttp.open("get", "findByNameUser?name="+un.value, true);
		xmlHttp.send();
	}
	

</script>	
</body>
</html>