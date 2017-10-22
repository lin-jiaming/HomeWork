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
	<h2>学生列表</h2>
	<s:if test="res==1">
		<div style="color:green">操作成功</div>
	</s:if>
	<s:if test="res==-1">
		<div style="color:red">操作失败</div>
	</s:if>
	<table border="1">
		<tr>
			<td>编号</td><td>班级名称</td>
			<td>姓名</td><td>年龄</td>
			<td>性别</td><td>入学时间</td>
			<td>操作</td>
		</tr>
		<s:iterator var="stu" value="#request.stuList" status="ids">
			<tr>
			<td>${ids.count }</td><td>${stu[1].cname }</td>
			<td>${stu[0].sname }</td><td>${stu[0].sage }</td>
			<td>${stu[0].ssex==1?'男':'女'}</td><td>${stu[0].sintime}</td>
			<td><a href="stuAction_toUpdateTbStu?stu.sno=${stu[0].sno }">修改</a>|<a href="stuAction_doDeleteTbStu?stu.sno=${stu[0].sno }">删除</a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>