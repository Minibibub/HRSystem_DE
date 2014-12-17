<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Department - Add</title>
<link rel="stylesheet" href="css/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="css/custom.css">
<script type="text/javascript">
	function add() {
		document.forms[0].action = "AddDepartment";
		document.forms[0].submit();
	}
</script>
</head>
<body>
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<s:if test="hasActionErrors()">
					<div class="alert alert-danger">
						<s:actionerror />
					</div>
				</s:if>
				<form class="form-signin" action="AddDepartmentmay" method="post">
					<s:textfield cssClass="form-control" placeholder="DepartmentName"
						name="department.name" id="namede" />
					<div class="row">
						<div class="col-xs-6">
							<button class="btn btn-md btn-primary" onclick="add()">Add</button>
							<button class="btn btn-md btn-primary" type="reset">Clear</button>
						</div>
					</div>
				</form>
				<a href="initMain">Main Menu</a>
			</div>
		</div>
	</div>
	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="css/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>