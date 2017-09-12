<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台首页</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="res/assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="res/assets/css/font-awesome.min.css" />
<link rel="stylesheet" href="res/assets/css/ace.min.css" />
<link rel="stylesheet" href="res/assets/css/ace-rtl.min.css" />
<link rel="stylesheet" href="res/assets/css/ace-skins.min.css" />
<script src="res/assets/js/ace-extra.min.js"></script>
<script src="res/assets/jquery.min.js"></script>
</head>
<body>

欢迎你:${user.userName }

</body>
</html>