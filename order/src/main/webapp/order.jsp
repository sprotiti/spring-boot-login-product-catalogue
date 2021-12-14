<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style>
table, th, td {
  border: 1px solid white;
  border-collapse: collapse;
}
th, td {
  background-color: #96D4D4;
}
</style>
</head>
<body>
	<h2>Order details</h2>

	<c:if test="${not empty prodlist}">

		<table WIDTH=70%>
       		
			<c:forEach var="listVar" items="${prodlist}">
			<tr>	
					<td>${listVar.productId}</td>
					<td>${listVar.name}</td>
					<td>${listVar.description}</td>
					<td>${listVar.measurementUnit}</td>
					<td>${listVar.price}</td>
					<td>${listVar.available}</td>
			</tr>
					
			</c:forEach>
			 </table>

	</c:if>
</body>
</html>