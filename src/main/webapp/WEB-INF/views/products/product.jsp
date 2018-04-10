<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="ot" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<ot:mainLayout title="${product.name }">
	<div>
		<p><img src="${pageContext.request.contextPath}/img/${product.sm_img}">
		<p>${product.name }</p>
		<p>${product.price }</p>
		<p>购买数量<input type="number" id="num" value="1" min="1"></p>
		<p>
			<button onclick="buy()">立即购买</button>
		</p>
	</div>
	<script type="text/javascript">
		function buy() {
			var id = ${product.id};
			var num = $('#num').val();
			
			$.post({
				url : '${pageContext.request.contextPath}/product/buy',
				data : {id:id,num:num},
				success:function(result){
					if (result === 'success') {
						window.location.href="${pageContext.request.contextPath}/order";
					} else {
						alert(result)
					}
				},
				error:function(){
					alert('error');
				}
				
			})
			
		}
	
	</script>
</ot:mainLayout>
