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
              <h3 class="panel-title">Perfil de la sucursal</h3>
            </div>
            <div class="panel-body">
              <div class="row">
                <div class="col-md-3 col-lg-3 " align="center">  </div>
                
                <div class=" col-md-9 col-lg-9 "> 
                  <table class="table table-user-information">
                    <tbody>
                      <tr>
                        <td> <b>Informacion de la surcursal: </b></td>
                        <td></td>
                      </tr>
                      <tr>
                        <td>Nombre de la sucursal:</td>
                        <td> ${sucursales.sNombre}</td>
                      </tr>
                      <tr>
                        <td>Ubicacion de la sucursal:</td>
                        <td>${sucursales.ubicacion}</td>
                      </tr>
                   
                         <tr>
                             <tr>
                        <td>Horario de apertura:</td>
                        <td> ${sucursales.horarioa}</td>
                      </tr>
                        <tr>
                        <td>Horario de cierre:</td>
                        <td>${sucursales.horarioc}</td>
                      </tr>
                      <tr>
                        <td>Numero de mesas:</td>
                        <td>${sucursales.nmesas}</td>
                      </tr>
                        <td>Gerente de sucursal:</td>
                        <td> ${sucursales.gerente} </td>
                           
                      </tr>
                     
                      </tr>
                        <td> <b > Lista de empleados:</b></td>
                        <td> </td>
                           
                      </tr>
                      
					<c:forEach items="${empleados}" var="empleados">
                      </tr>
                        <td>Nombre del empleado:</td>
                        <td> ${empleados.eNombre} </td>
                           
                      </tr>
                     
                     
                      </tr>
                        <td>Edad</td>
                         <td> ${empleados.edad} </td>
                           
                      </tr>
                     
                       </tr>
                        <td>Genero</td>
                         <td> ${empleados.genero} </td>
                           
                      </tr>
                     
                     </tr>
                        <td>Estado</td>
                         <td> ${empleados.estadoDelegate} </td>
                           
                      </tr>
                      
                     </c:forEach>
                    </tbody>
                  </table>
                  
                  
                  <button type="button" onclick="window.location.href = '${pageContext.request.contextPath}/editar?id=${sucursales.sCodigo}'" class="btn btn-primary" style="width:140px">Editar</button>
                </div>
              </div>
            </div>
                
            
          </div>
        </div>
      </div>
    </div>
</body>
</html>