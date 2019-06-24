<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Perfil de sucursal</title>
<link href="resources/css/perfilstyle.css" rel = "stylesheet">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

</head>
<body>
<div class="container">
      <div class="row">
      <div class="col-md-5  toppad  pull-right col-md-offset-3 ">

      </div>
        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad" >
   
   
          <div class="panel panel-info">
            <div class="panel-heading">
              <h3 class="panel-title">Agregar nueva sucursal</h3>
            </div>
            <div class="panel-body">
              <div class="row">
                <div class="col-md-3 col-lg-3 " align="center">  </div>
                
                <div class=" col-md-9 col-lg-9 "> 
                  <form:form action="${pageContext.request.contextPath}/guardar" method="POST" modelAttribute="sucursal">
						<label>Ingrese el nombre de la sucursal: </label>
						<form:input type='text' path='sNombre' value='${sucursal.sNombre}'/><br>
						<form:errors path='sNombre' cssStyle="color:#E81505"/><br>
						<label>Ingrese la ubicacion de la sucursal: </label>
						<form:input type='text' path='ubicacion' value='${sucursal.ubicacion}'/><br>
						<form:errors path='ubicacion' cssStyle="color:#E81505"/><br>
						<label>Ingrese el horario de apertura: </label>
						<form:input type='text' path='horarioa' value='${sucursal.horarioa}'/><br>
						<form:errors path='horarioa' cssStyle="color:#E81505"/><br>
						<label>Ingrese el horario de cierre: </label>
						<form:input type='text' path='horarioc' value='${sucursal.horarioc}'/><br>
						<form:errors path='horarioc' cssStyle="color:#E81505"/><br>
						<label>Ingrese el numero de mesas de la sucursal: </label>
						<form:input type='text' path='nmesas' value='${sucursal.nmesas}'/><br>
						<form:errors path='nmesas' cssStyle="color:#E81505"/><br>
						<label>Ingrese el nombre del gerente de la sucursal: </label>
						<form:input type='text' path='gerente' value='${sucursal.gerente}'/><br>
					<form:errors path='gerente' cssStyle="color:#E81505"/><br>
					
				</form:form>
                  
                  
                  <button type="button" onclick="window.location.href = '${pageContext.request.contextPath}/guardar'" class="btn btn-primary" style="width:140px">Guardar sucursal</button>
                </div>
              </div>
            </div>
                
            
          </div>
        </div>
      </div>
    </div>
</body>
</html>