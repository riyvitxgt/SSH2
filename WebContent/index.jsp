<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath }/user_findById?id=1">测试</a>
	<form action="user_add" method="post">
		<label>姓名：</label>
		<input type="text" name="name" /><br>
		<label>年龄：</label>
		<input type="text" name="age" /><br>
		<input type="submit" value="提交" />
	</form>
</body>
</html>