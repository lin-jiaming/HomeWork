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
	<h2>添加班级</h2>
	<s:if test="#parameters.res[0]==1">
		<div style="color:green">添加成功</div>
	</s:if>
	<s:if test="#parameters.res[0]==-1">
		<div style="color:red">添加失败</div>
	</s:if>
	<s:form action="clsAction_addTbCls" method="post">
		班级名称:<s:textfield name="cls.cname"/><br />
		<s:submit value="添加"/>
	</s:form>
	<a href="${pageContext.request.contextPath }/index.jsp">返回</a>
</body>
</html>