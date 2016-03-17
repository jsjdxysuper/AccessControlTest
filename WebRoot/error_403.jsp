<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<base href="<%=basePath%>">
	<title>错误 - 403</title>
</head>
<body class="notfound">
<section>
  <div class="notfoundpanel">
    <h1>403!</h1>
    <h3>操作权限不足！</h3>
	<h4>Sorry, you don't have the authorty required!</h4>
	<s:property value="exception.message"/>
	<hr/>
	<div class="space"></div>
	<div class="center">
		<a href="javascript:history.back(-1)" class="btn btn-primary"><i class="fa fa-reply"></i> 返回  </a>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="sgepm/tsk/desktop!init.so" class="btn btn-primary"><i class="fa fa-home"></i> 返回主页 </a>
	</div>
  </div>
</section>
</body>
</html>