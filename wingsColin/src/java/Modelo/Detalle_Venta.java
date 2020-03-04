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
public class Detalle_Venta {

    private int clave_DetalleVenta;
    private String clave_Venta;
    private String clave_Producto;
    private double cantidad_Producto;
    private double subTotalDetalleVenta;

    public Detalle_Venta(int clave_DetalleVenta, String clave_Venta, String clave_Producto, double cantidad_Producto, double subTotalDetalleVenta) {
        this.clave_DetalleVenta = clave_DetalleVenta;
        this.clave_Venta = clave_Venta;
        this.clave_Producto = clave_Producto;
        this.cantidad_Producto = cantidad_Producto;
        this.subTotalDetalleVenta = subTotalDetalleVenta;
    }

    public Detalle_Venta() {
        this.clave_DetalleVenta = 0;
        this.clave_Venta = "";
        this.clave_Producto = "";
        this.cantidad_Producto = 0;
        this.subTotalDetalleVenta = 0;

    }

    public int getClave_DetalleVenta() {
        return clave_DetalleVenta;
    }

    public void setClave_DetalleVenta(int clave_DetalleVenta) {
        this.clave_DetalleVenta = clave_DetalleVenta;
    }

    public String getClave_Venta() {
        return clave_Venta;
    }

    public void setClave_Venta(String clave_Venta) {
        this.clave_Venta = clave_Venta;
    }

    public String getClave_Producto() {
        return clave_Producto;
    }

    public void setClave_Producto(String clave_Producto) {
        this.clave_Producto = clave_Producto;
    }

    public double getCantidad_Producto() {
        return cantidad_Producto;
    }

    public void setCantidad_Producto(double cantidad_Producto) {
        this.cantidad_Producto = cantidad_Producto;
    }

    public double getSubTotalDetalleVenta() {
        return subTotalDetalleVenta;
    }

    public void setSubTotalDetalleVenta(double subTotalDetalleVenta) {
        this.subTotalDetalleVenta = subTotalDetalleVenta;
    }

}
