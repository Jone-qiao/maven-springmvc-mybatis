<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="ot" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<ot:mainLayout title="地址添加">
	<div>
		<p>地址添加</p>
		<c:if test="${allErrors != null }">
			<ul>
				<c:forEach items="${allErrors }" var="error">
					<li>${error.defaultMessage }</li>
				</c:forEach>
			</ul>
		</c:if>
		<form action="${pageContext.request.contextPath}/my/address"
			method="POST">
			<table border="1">
				<tr>
					<td>收货人姓名</td>
					<td><input type="text" name="sendeeName" value="${address.sendeeName }" /></td>
				</tr>
				<tr>
					<td>收货人电话</td>
					<td><input type="text" name="sendeeTel" value="${address.sendeeTel }" /></td>
				</tr>
				<tr>
					<td>省份</td>
					<td><input type="text" name="addressProvince" value="${address.addressProvince }" /></td>
				</tr>
				<tr>
					<td>城市</td>
					<td><input type="text" name="addressCity" value="${address.addressCity }" /></td>
				</tr>
				<tr>
					<td>区域</td>
					<td><input type="text" name="addressArea" value="${address.addressArea }" /></td>
				</tr>
				<tr>
					<td>详细地址</td>
					<td><input type="text" name="address" value="${address.address }" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="提交"></td>
				</tr>
			</table>
		</form>
	</div>
</ot:mainLayout>