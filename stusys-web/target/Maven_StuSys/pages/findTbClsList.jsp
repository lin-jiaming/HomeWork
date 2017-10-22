<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>班级列表</h2>
	<table border="1">
		<tr>
			<td>编号</td><td>班级名称</td>
		</tr>
		<s:iterator var="cls" value="#request.clsList" status="ids">
			<tr>
			<td>${ids.count }</td><td>${cls.cname }</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>