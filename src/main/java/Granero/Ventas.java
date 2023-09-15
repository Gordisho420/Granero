/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Granero;

/**
 *
 * @author DROGON
 */
public class Ventas {
    
    private String Codventas;
    private String nombre;
    private String codarticulo;
    private double cantidad;
    private double precio;
    private double subtotal;

    public Ventas() {
    }
    
    
    public Ventas(String Codventas, String codarticulo, double cantidad) {
        this.Codventas = Codventas;
        this.nombre = nombre;
        this.codarticulo = codarticulo;
        this.cantidad = cantidad;
        this.subtotal = 0.0;
        this.precio = 0.0;
        
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getCodventas() {
        return Codventas;
    }

    public void setCodventas(String Codventas) {
        this.Codventas = Codventas;
    }

    public String getCodarticulo() {
        return codarticulo;
    }

    public void setCodarticulo(String codarticulo) {
        this.codarticulo = codarticulo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }
    public void showInfo(){
        
        System.out.println("Cod ventas " +this.getCodventas());
       
        System.out.println("Codarticulo " +this.getCodarticulo());
        System.out.println("Nombre" + this.getnombre());
        System.out.println("cantidad " +this.getCantidad());
        System.out.println("precio " + this.getPrecio());
        System.out.println("subtotal " +this.getSubtotal());
        System.out.println("  ");
    
    }
    public void Calculartotal(ListaArticulos listaArticulos){
        for(Articulo articulo:listaArticulos.getArticuloList()){
            this.precio=articulo.getGanancia();
            this.nombre=articulo.getnombre();
            this.subtotal=this.precio * this.cantidad;
        }
    }
    
    
}
