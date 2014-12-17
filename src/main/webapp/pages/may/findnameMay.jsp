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
<title>May - FindByName</title>
<link rel="stylesheet" href="css/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="css/custom.css">
</head>
<body>
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<form class="form-signin" action="SearchMay" method="get">
					<s:textfield cssClass="form-control" placeholder="Search"
						name="search" id="search" />
					<div class="row">
						<div class="col-xs-12">
							<button class="btn btn-md btn-primary btn-block"
								onclick="search()">Search</button>
						</div>
					</div>
				</form>
				<br> <a href="initMain">Main Menu</a> | <a href="InitAddMay">Add
					New</a>
			</div>
			<center>
				<br>
				<form class="form-signin" action="Search" method="get">
					<s:iterator value="mays">
						<s:property value="name" />
						<s:property value="email" />
						<s:property value="age" />
						<s:property value="may" />
						<a href="UpdateMay?id=<s:property value="id" />">Edit</a> | <a
							href="DeleteMay?id=<s:property value="id" />">Delete</a>
					</s:iterator>
				</form>
			</center>
		</div>
	</div>
	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="css/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>