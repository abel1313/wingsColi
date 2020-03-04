/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abel_
 */
public class Querys {

    PreparedStatement ps = null;
    ResultSet rs = null;
    conectaBD cone = new conectaBD();
    private Connection con = cone.conexionBD();

    public ArrayList<Usuario> mostrarUsuarios() {
        ArrayList<Usuario> usuarioView = new ArrayList<>();
        String sQL = "CALL selectUsuarios()";
        try {
            ps = con.prepareStatement(sQL);
            rs = ps.executeQuery();
            Usuario usua = new Usuario();
            while (rs.next()) {
                usua.setClave_Usuario(rs.getInt("clvusuario"));
                usua.setNombre_Usuario(rs.getString("username"));
                usua.setPass_Usuario(rs.getString("password"));
                usua.setClave_Empleado(rs.getString("clvempleado"));
                usuarioView.add(usua);
            }
        } catch (SQLException ex) {

            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                con.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return usuarioView;
    }

    public boolean addUsuario(Usuario usr) {

        try {
            String sQL = "CALL addUsuario(?,?,?)";
            ps = (PreparedStatement) con.prepareStatement(sQL);

            ps.setString(1, usr.getNombre_Usuario());
            ps.setString(2, usr.getPass_Usuario());
            ps.setString(3, usr.getClave_Empleado());

            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            System.out.println("err " + ex.getMessage());
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    public boolean updateUsuario(Usuario us) {
        try {
            String sQL = "CALL updateUsuario(?,?,?,?)";
            ps = con.prepareStatement(sQL);
            ps.setString(1, us.getNombre_Usuario());
            ps.setString(2, us.getPass_Usuario());
            ps.setString(3, us.getClave_Empleado());
            ps.setInt(4, us.getClave_Usuario());
            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public boolean delUsuario(Usuario uus) {
        try {
            String sQL = "CALL delUsuario(?)";
            ps = con.prepareStatement(sQL);
            ps.setInt(1, uus.getClave_Usuario());
            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.out.println("e" + ex.getMessage());
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public boolean addDetalleVenta(Detalle_Venta dtlle){
    
               try {
            String sQL = "CALL addDetalleVenta(?,?,?,?)";
            ps = (PreparedStatement) con.prepareStatement(sQL);

            ps.setString(1, dtlle.getClave_Venta());
            ps.setString(2, dtlle.getClave_Producto());
            ps.setDouble(3, dtlle.getCantidad_Producto());
            ps.setDouble(4, dtlle.getSubTotalDetalleVenta());

            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            System.out.println("err " + ex.getMessage());
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public boolean updateDetalleVenta(Detalle_Venta dtlleVe) {
        try {
            String sQL = "CALL updateDetalleVenta(?,?,?,?,?)";
            ps = con.prepareStatement(sQL);
            ps.setString(1, dtlleVe.getClave_Venta());
            ps.setString(2, dtlleVe.getClave_Producto());
            ps.setDouble(3, dtlleVe.getCantidad_Producto());
            ps.setDouble(4, dtlleVe.getSubTotalDetalleVenta());
            ps.setInt(5, dtlleVe.getClave_DetalleVenta());
            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

        public boolean delDetalleVenta(Detalle_Venta dtVenta) {
        try {
            String sQL = "CALL delDetalleVenta(?)";
            ps = con.prepareStatement(sQL);
            ps.setInt(1, dtVenta.getClave_DetalleVenta());
            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.out.println("e" + ex.getMessage());
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Querys q = new Querys();
        Usuario u = new Usuario();
        ArrayList uvs;
        uvs=new ArrayList();
        for (int i=0;i<uvs.size();i++) {
            System.out.println(uvs.get(i));
            
        }
        
    }

}
