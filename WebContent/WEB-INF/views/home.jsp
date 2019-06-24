<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/styles.css" rel = "stylesheet">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<title>Home</title>
</head>
<body>
<div class="container">
    <div class="row col-md-6 col-md-offset-2 custyle">
    <table class="table table-striped custab">
    <thead>
    <button class="btn btn-primary btn-xs pull-right" type="button" onclick="window.location.href = '${pageContext.request.contextPath}/agregar'"><b>+</b>Agregar nueva sucursal</button>
       <tr>
     
            <th>Nombre </th>
            <th>Ubicacion de la sucursal</th>
            <th class="text-center">Action</th>
        </tr>
    </thead>
    <c:forEach items="${sucursales}" var="sucursales">
            <tr>
                <td>${sucursales.sNombre}</td>
                <td>${sucursales.ubicacion}</td>
                <td class="text-center"><button type="button" class="btn btn-info btn-xs" onclick="window.location.href = '${pageContext.request.contextPath}/perfil?id=${sucursales.sCodigo}'"><span class="glyphicon glyphicon-edit"></span> Ver perfil</button> 
               	<button type="button" class="btn btn-danger btn-xs" onclick="window.location.href = '${pageContext.request.contextPath}/delete?id=${sucursales.sCodigo}'"> <span class="glyphicon glyphicon-remove" ></span> Del</button></td>
            </tr>
    </c:forEach>
    </table>
    </div>
</div>
	
</body>
</html>