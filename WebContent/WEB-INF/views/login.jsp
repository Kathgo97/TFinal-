<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link href="resources/css/styles.css" rel = "stylesheet">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<title>Login</title>
</head>
<body>
<div class = "container">
	<div class="wrapper" >
		<form method="post" name="Login_Form"  action="${pageContext.request.contextPath}/validate" class="form-signin">       
		    <h3 class="form-signin-heading">Welcome! Please Sign In</h3>
			  <hr class="colorgraph"><br>
			  
			  <input type="text" class="form-control" id=username name="Username"  required="" autofocus="" />
			  <input type="password" class="form-control" id=password name="Password" required=""/>     		  
			 
			  <button class="btn btn-lg btn-primary btn-block"  name="Submit" value="Login" type="Submit">Login</button>  			
		</form>			
	</div>
</div>
</body>
</html>