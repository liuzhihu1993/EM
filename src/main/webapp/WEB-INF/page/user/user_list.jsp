<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="pg" uri="http://jsptags.com/tags/navigation/pager"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户查询</title>
<link rel="stylesheet" href="res/css/bootstrap.css">
<script type="text/javascript" src="res/js/jquery.min.js"></script>
<script type="text/javascript" src="res/js/bootstrap.min.js"></script>

<script type="text/javascript">
	
</script>

</head>
<body>
	<div style="padding: 0px; margin: 0px;">
		<ul class="breadcrumb" style="margin: 0px; padding-left: 20px;">
			<li>系统管理</li>
			<li>用户管理</li>
			<li>查询用户</li>
		</ul>
	</div>
	<form action="user/list.do" method="post" id="f1" class="form-inline">
		<div class="row" style="padding: 15px;">
			<table class="table table-striped table-bordered ">
				<tr>
					<th><input type="checkbox" onclick="checkboxfun(this)" /></th>
					<th>编号</th>
					<th>姓名</th>
					<th>性别</th>
					<th>年龄</th>
					<th>账号</th>
					<th>薪资</th>
					<th>角色</th>
					<th>查看</th>
				</tr>
				<c:forEach items="${list }" var="user">
					<tr>
						<td><input type="checkbox" id="ids" name="userId" value="${user.userId }" /></td>
						<td>${user.userId }</td>
						<td>${user.userName }</td>
						<td>${user.userSex }</td>
						<td>${user.userAge }</td>
						<td>${user.userAccount }</td>
						<td>￥${user.userSalary }</td>
						<td>${user.roleName }</td>
						<td><a href="user/showuser.do?userId=${user.userId }">查看</a> 
						<a href="user/deleteById.do?userId=${user.userId }">删除</a></td>
					</tr>
				</c:forEach>

			</table>

		</div>
	</form>
</body>
</html>