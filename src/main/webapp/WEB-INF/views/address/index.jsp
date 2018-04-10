<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="ot" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<ot:mainLayout title="地址列表">
	<div>
		<p>地址列表</p>
		<p>
			<a href="${pageContext.request.contextPath}/my/address/create">添加</a>
		</p>
		<ul>
			<c:forEach items="${addresses }" var="address">
				<li>
					${address.sendeeName } ${address.sendeeTel }<br/>
					${address.addressProvince }${address.addressCity }${address.addressArea }${address.address }
					<a href="${pageContext.request.contextPath}/my/address/${address.id}/update">修改</a>
				</li>
			
			</c:forEach>
		</ul>
		
	</div>
</ot:mainLayout>