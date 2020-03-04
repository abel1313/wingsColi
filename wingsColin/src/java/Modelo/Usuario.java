/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author abel_
 */
public class Usuario {

    private int clave_Usuario;
    private String nombre_Usuario;
    private String pass_Usuario;
    private String clave_Empleado;

    public Usuario(int clave_Usuario, String nombre_Usuario, String pass_Usuario, String clave_Empleado) {
        this.clave_Usuario = clave_Usuario;
        this.nombre_Usuario = nombre_Usuario;
        this.pass_Usuario = pass_Usuario;
        this.clave_Empleado = clave_Empleado;
    }

    public Usuario() {
        this.clave_Usuario = 0;
        this.nombre_Usuario = "";
        this.pass_Usuario = "";
        this.clave_Empleado = "";

    }

    public int getClave_Usuario() {
        return clave_Usuario;
    }

    public void setClave_Usuario(int clave_Usuario) {
        this.clave_Usuario = clave_Usuario;
    }

    public String getNombre_Usuario() {
        return nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        this.nombre_Usuario = nombre_Usuario;
    }

    public String getPass_Usuario() {
        return pass_Usuario;
    }

    public void setPass_Usuario(String pass_Usuario) {
        this.pass_Usuario = pass_Usuario;
    }

    public String getClave_Empleado() {
        return clave_Empleado;
    }

    public void setClave_Empleado(String clave_Empleado) {
        this.clave_Empleado = clave_Empleado;
    }

}
