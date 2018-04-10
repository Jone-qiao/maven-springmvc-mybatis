<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="ot" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<ot:mainLayout title="首页">
	<div>
		<p>商品列表</p>
		<form action="${pageContext.request.contextPath }/" method="POST">
			<table style="width: 100%" border="1">
				<tr>
					<td>商品名称：<input name="productsCustom.name"
						value="${productsCustom.name}"></td>
					<td><input type="submit" value="查询"></td>
				</tr>
			</table>
		</form>
		<table style="width: 100%" border="1">
			<tr>
				<td>商品id</td>
				<td>商品图片</td>
				<td>商品名称</td>
				<td>商品价格</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${products }" var="product">
				<tr>
					<td>${product.id }</td>
					<td><img src="${pageContext.request.contextPath }/img/${product.sm_img }"></td>
					<td>${product.name }</td>
					<td>${product.price }</td>
					<td>
						<a href="${pageContext.request.contextPath }/product/${product.id}">查看</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</ot:mainLayout>








