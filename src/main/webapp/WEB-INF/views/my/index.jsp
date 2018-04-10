<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="ot" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<ot:mainLayout title="个人中心">
	<div>
		<ul>
			<li><a href="${pageContext.request.contextPath}/my/address">我的地址</a></li>
		</ul>
		<ul>
			<li><a href="${pageContext.request.contextPath}/logout">退出</a></li>
		</ul>
	</div>
</ot:mainLayout>








