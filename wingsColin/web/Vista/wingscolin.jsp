<%-- 
    Document   : wingscolin
    Created on : 03-mar-2020, 16:24:03
    Author     : lenovo
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="Modelo.Querys"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
   <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    
            <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
 
        <link href="../CSS/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="../CSS/cssUsuario.css" rel="stylesheet" type="text/css"/>
        
        
        <title>Menú</title>
    </head>
        
   <body>
     <div id="nombre" style="border: 2px solid transparent;font-size:40px;">
         
         <img src="../Imagenes/photo.png" id="logo" /> <center>Wings Colin</center>
         </div>
        
   <center>
       <header>
             <section id="menu">
             <ul>
	         <a href="usuarios.jsp">Usuarios</a>
                 <a href="empleados.jsp">Empleados</a>
                 <a href="productos.jsp">Productos</a>
		<a href="compras.jsp">Compras</a>
		<a href="detallecompra.jsp">Detalle de Compras</a>
	        <a href="ventas.jsp">Ventas</a>
                <a href="detalleventa.jsp">Detalle de Ventas</a>
                <a href="proveedores.jsp">Proveedores</a>
                <a href="direcciones.jsp">Direcciones</a>
                <a href="sucursal.jsp">Sucursal</a>
                <a href="reportes.jsp">Reportes</a>
		     
            </ul>
                 </section>
             
     </header>
	 </center>
  

       	     
        <div id="partecentral">

                                <!-- Button trigger modal -->
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                     Agregar Usuario
                    </button>

                    <!-- Modal -->
                    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                      <div class="modal-dialog" role="document">
                        <div class="modal-content">
                          <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Usuarios</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                              <span aria-hidden="true">&times;</span>
                            </button>
                          </div>
                          <div class="modal-body">
                              
                <form>

                   <div class="form-group">
                        <label for="userName">User Name</label>
                        <input type="text" class="form-control" id="userName" name="UserName"  placeholder="Ingrese Usuario">
                       
                   </div>

                   <div class="form-group">
                        <label for="password">Password</label>
                        <input type="password" class="form-control" id="password" name="Password" placeholder="Password">
                   </div>
                    
                   <div class="form-group">
                        <label for="empleado">Empleado</label>
                        <select class="form-control form-control-sm" id="empleado" name="Empleado">
                        
                        <option>Seleccione Empleado</option>
                     </select>
                    
                   </div>
                    
                    
                   

                </form>
                              
                          </div>
                          <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <button type="button" class="btn btn-primary">Save changes</button>
                          </div>
                        </div>
                      </div>
                    </div>
                    
                    
                    <div class="tableUsuario">
                        
                        <table class="table table-bordered table table-lg">
  <thead>
    <tr class="table-active">
      <th scope="col">Nombre Empleado</th>
      <th scope="col">Apellido Paterno</th>
      <th scope="col">Apellido Materno</th>
      <th scope="col">Edad</th>
      <th scope="col">Sexo</th>
      <th scope="col">User Name</th>
      <th scope="col">Cargo</th>
      <th scope="col">Acción</th>
      
    </tr>
  </thead>
  <tbody>
        <%
     
        try{
               ResultSet resUsuarios=null;
        Querys consultaUsuario=new Querys();
         resUsuarios=consultaUsuario.mostrarUsuarios2();
        while(resUsuarios.next()){
        %>
      <tr>
    
      <th scope="row"><%=resUsuarios.getString(2)%></th>
      <th scope="row"><%=resUsuarios.getString(3)%></th>
      <th scope="row"><%=resUsuarios.getString(4)%></th>
      <th scope="row"><%=resUsuarios.getString(5)%></th>
      <th scope="row"><%=resUsuarios.getString(6)%></th>
      <th scope="row"><%=resUsuarios.getString(7)%></th>
      <th scope="row"><%=resUsuarios.getString(8)%></th>
      <th scope="row">
          
          <button class="btn btn-secondary" id="editarUsuario" value="<%=resUsuarios.getString(1)%>">Editar</button>
          <button class="btn btn-danger" id="eliminarUsuario" value="<%=resUsuarios.getString(1)%>">Eliminar</button>
          
      </th>
      
    </tr>
        <%
              }
          }catch(SQLException e){
System.out.println("error "+e.getMessage());
}
          %>
      
  </tbody>
</table>
                        
                        
                    </div>
            
            
            
	 </div>
	 
	 <div id="partebajo">
             
             <n>Pie de pagina</n>
	 </div>
           
               
                   
       
     
 



  </body>
</html>


