/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abel_
 */
public class conectaBD {
   private Connection conexion=null;
   
    public Connection conexionBD(){
   
       try {
           Class.forName("com.mysql.jdbc.Driver");
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(conectaBD.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/wingsColin","root","");
       } catch (SQLException ex) {
           Logger.getLogger(conectaBD.class.getName()).log(Level.SEVERE, null, ex);
       }   
    return conexion;
    }

  
    
}
