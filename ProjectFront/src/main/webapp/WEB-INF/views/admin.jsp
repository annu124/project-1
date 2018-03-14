<%@include file="header.jsp"%>
<div class="container"><br/>
	<table class="table table-bordered text-center">
		<tr>
			<td colspan="2"><h2><b>Admin Home</b></h2></td>
		</tr>
		<tr>
			<td><a href="${e}addCategory" class=" btn  btn-info" style="font-size: 20px">Add
					Category</a></td>
			<td><a href="${e}viewCategory" class=" btn  btn-info" style="font-size: 20px">View
					Category</a></td>
		</tr>
		<tr>
			<td><a href="${e}addSupplier" class=" btn  btn-info" style="font-size: 20px">Add
					Supplier</a></td>
			<td><a href="${e}viewSupplier" class=" btn  btn-info" style="font-size: 20px">
					View Supplier</a></td>
		</tr>
		<tr>
			<td><a href="${e}addProduct" class=" btn  btn-info" style="font-size: 20px">Add
					Product</a></td>
			<td><a href="${e}viewProduct" class=" btn  btn-info" style="font-size: 20px">View
					Product</a></td>
		</tr>
	</table>

</div>
<%@include file="footer.jsp"%>