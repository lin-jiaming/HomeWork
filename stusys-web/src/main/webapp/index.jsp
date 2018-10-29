<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>学生管理系统</h2>
	<h3>班级管理</h3>
	<a href="${pageContext.request.contextPath }/pages/addTbCls.jsp">添加班级</a>
	<a href="clsAction_findTbClsList">班级列表</a>
	<hr>
	<h3>学生管理</h3>
	<a href="stuAction_toAddTbStu">添加学生</a>
	<a href="stuAction_findTbStuList">学生列表</a>
	<!--  测试Git -->
</body>
</html>