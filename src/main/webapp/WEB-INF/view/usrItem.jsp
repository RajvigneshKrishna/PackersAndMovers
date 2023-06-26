<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
</head>
<body>
	<h2>User Item List Add Page</h2>
	<table border=1>
		<tr>
			<td style="display: none;">Item ID</td>
			<td>House Hold Item Name</td>
			<td>Cost</td>
			<td>Count</td>
			<td>Total Cost</td>
		</tr>
		<c:forEach var="itms" items="${HSE_HOLD_ITMS}">
			<tr class="trCn">
				<td style="display: none;"><c:out value="${itms.hsHldItmId}" /></td>
				<td id="itemName"><c:out value="${itms.itemName}" /></td>
				<td id="price"><c:out value="${itms.price}" /></td>
				<td><select class="optData">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
				</select></td>
				<td><input type="text" id="totalCost" readonly /></td>
			</tr>
		</c:forEach>
	</table>
	<span id="total_sum_value">0</span>
</body>
</html>
<script>
$(document).ready(function() {

	$(".optData").change(function() {
		var count = $(this).closest('td').find(':selected').val();
		var price = $(this).closest('tr').find('#price').html();
		console.log(count);
		console.log(price);
		$(this).closest('tr').find('#totalCost').val(count*price);
	});

});
</script>