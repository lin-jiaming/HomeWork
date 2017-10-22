<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>添加学生</h2>
	<s:if test="res==1">
		<div style="color:green">添加成功</div>
	</s:if>
	<s:if test="res==-1">
		<div style="color:red">添加失败</div>
	</s:if>
	<s:form action="stuAction_doAddTbStu" method="post">
		学生姓名:<s:textfield name="stu.sname"/><br />
		学生年龄:<s:textfield name="stu.sage"/><br />
		学生性别:<s:radio list="#{1:'男',0:'女'}" name="stu.ssex" value="#{1:'男'}" /><br />
		入学时间:<s:textfield name="stu.sintime"/><br />
		班级:<s:select list="#request.clsList" listKey="cno" listValue="cname" headerKey="" headerValue="请选择班级" name="stu.cls.cno"/><br />
	<s:submit value="添加"/>
	</s:form>
	<a href="${pageContext.request.contextPath }/index.jsp">返回</a>
</body>
</html>