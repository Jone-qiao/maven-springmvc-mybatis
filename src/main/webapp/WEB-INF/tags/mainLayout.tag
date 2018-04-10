<%@tag pageEncoding="UTF-8"%>
<%@tag trimDirectiveWhitespaces="true"%>
<%@tag body-content="scriptless"%>
<%@ attribute name="title" required="true" type="java.lang.String"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
<title>Flash Fox -- ${ title}</title>
</head>

<body>
	<div class="body">
		<div class="header">
			
		</div>
		<div class="main">
			<jsp:doBody></jsp:doBody>
		</div>
		<div class="footer" style="margin-top:100px">
			<a href="${pageContext.request.contextPath}/my">个人中心</a>
			<a href="${pageContext.request.contextPath}">首页</a>
			<a href="#">联系客服</a>
		</div>
	</div>
</body>
</html>