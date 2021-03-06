<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Flash Fox -- 登录</title>
</head>
<body>
	<h1>用户登录</h1>
	<!-- 错误信息 -->
	<c:if test="${authErrors != null }">
		<c:forEach items="${authErrors }" var="error">
			${error}<br />
		</c:forEach>
	</c:if>
	<form action="${pageContext.request.contextPath}/login?next=${next}"
		method="post">
		<table border="1">
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="loginName"
					value="${member.loginName}" /></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="passwd" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="登录"> <a
					href="${pageContext.request.contextPath}/register?next=${next}">注册</a></td>
			</tr>
		</table>
	</form>
</body>
</html>