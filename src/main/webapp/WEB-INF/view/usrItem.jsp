<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
</head>
<body>
	<h2>User Item List Add Page</h2>
	<table border=1>
		<c:forEach var="itms" items="${HSE_HOLD_ITMS}">
			<tr>
				<td><c:out value="${itms.itemName}" /></td>
				<td><c:out value="${itms.price}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>