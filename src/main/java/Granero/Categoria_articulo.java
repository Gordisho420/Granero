/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Granero;

/**
 *
 * @author DROGON
 */
public class Categoria_articulo {
    
    private String codCat;
    private String nombre;
    private String Categoria;
    private double  ganancia;
    

    public Categoria_articulo(String codCat, String Categoria, double ganancia) {
        this.codCat = codCat;
        this.Categoria = Categoria;
        this.ganancia = ganancia;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria_articulo() {
        
    }
    
    public String getCodCat() {
        return codCat;
    }

    public void setCodCat(String codCat) {
        this.codCat = codCat;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(long ganancia) {
        this.ganancia = ganancia;
    }
    
    public void showInfo(){
        System.out.println(this.codCat);
        System.out.println(this.nombre);
        System.out.println(this.Categoria);
        System.out.println(this.ganancia);
        
    
    }
}
