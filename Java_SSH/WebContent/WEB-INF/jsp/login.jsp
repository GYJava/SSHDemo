<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆页面</title>
</head>
<body>
<div align="center" id="">
<form action="/Java_SSH/login1" method="post">
<table border="1" bgcolor="pink">
<tr align="center">
	<td colspan="2">
		<input type="radio" value="0" name="loginFlag" checked />宠物主人
		<input type="radio" value="1" name="loginFlag"/>宠物商店
	</td>
</tr>
<tr>
	<td>用户名</td>
	<td><input type="text" name="name" /></td>
</tr>
<tr>
	<td>密码</td>
	<td><input type="password" name="pwd"/></td>
</tr>
<tr align="center">
	<td colspan="2">
		<input type="submit" value="登陆"/>
		<input type="reset" value="重置"/>
	</td>
</table>
</form>
</div>
</body>
</html>