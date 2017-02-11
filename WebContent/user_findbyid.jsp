<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>精确查询</title>
</head>
<body>
	
	<form method="post">
		<table>
			<tr>
				<td>ID</td>
				<td><input name="id" type="text" id="user_id"/></td>
			</tr>
			<tr>
				<td><input type="button" value="查询" onclick="findByIdUser()"></td>
			</tr>
		</table>
	</form>
	<a href="user_main.jsp">回首页</a>
	
	<div id="box"></div>
	
<script type="text/javascript">
	var id = document.getElementById("user_id");
	
	
	function findByIdUser(){
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
	
		xmlHttp.open("get", "findByIdUser?id="+id.value, true);
		xmlHttp.send();
	}
	

</script>	
</body>
</html>






