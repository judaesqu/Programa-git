    <%-- 
    Document   : Principal
    Created on : 30/05/2023, 04:58:46 PM
    Author     : EspinosaBeltran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-info">
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home</a>
      </li>
      <li class="nav-item">
          <a style="margin-left: 10px; border:none" class="btn btn-outline-light" href="Controlador?accion=Catalogo" target="myFrame">Catalogo</a>
      </li>
      <li class="nav-item">
        <a style="margin-left: 10px; border:none" class="btn btn-outline-light" href="Controlador?accion=Empleados" target="myFrame">Empleados</a>
      </li>
      <li class="nav-item">
        <a style="margin-left: 10px; border:none" class="btn btn-outline-light" href="Controlador?accion=Clientes" target="myFrame">Clientes</a>
      </li>
      <li class="nav-item">
        <a style="margin-left: 10px; border:none" class="btn btn-outline-light" href="Controlador?accion=Ventas" target="myFrame">Ventas</a>
      </li>
    </ul> 
  </div>
            <div class="dropdown">
                <button style="border:none" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    ${usuario.getnombre_completo()}
  </button>
  <div class="dropdown-menu text-center">
    <a class="dropdown-item" href="#">
        <img src="img/user.png" alt="60" width="60"/>
    </a>
    <a class="dropdown-item" href="#">${usuario.getUser()}</a>
    <a class="dropdown-item" href="#">usuario@gmail.com</a>
    <div class="dropdown-divider"></div>
    <form action="validar" method="POST">
    <button name="accion" value="Salir" class="dropdown-item" href="#">Salir</button>
    </form>
  </div>
</div>
</nav>
    <div class="m-4" style="height:550px">
        <iframe name="myFrame" style="height:100%; width:100%"></iframe>
    </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
