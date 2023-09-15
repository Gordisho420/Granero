/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Granero;

/**
 *
 * @author DROGON
 */
public class Articulo {
    
    private String codigo;
    private String nombre;
    private String Categoria;
    private long Cantidad;
    private double ValorCompra;
    private double ganancia;

    public Articulo(String codigo, String nombre, String Categoria, long Cantidad, double ValorCompra) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Categoria = Categoria;
        this.Cantidad = Cantidad;
        this.ValorCompra = ValorCompra;
        this.ganancia = 0.0;
    }

    public Articulo() {
        
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public long getCantidad() {
        return Cantidad;
    }

    public void setCantidad(long Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getValorCompra() {
        return ValorCompra;
    }

    public void setValorCompra(double ValorCompra) {
        this.ValorCompra = ValorCompra;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }
    
    public void showInfo(){
        System.out.println(this.getCodigo());
        System.out.println(this.getnombre());
        System.out.println(this.getCategoria());
        System.out.println(this.getCantidad());
        System.out.println(this.getValorCompra());
        System.out.println(this.getGanancia());
    }

   /*
        public void setGanancia(ListaCategorias listaCategorias){
        for (Categoria c: listaCategorias.categoriaList){
            if(this.getCategoria()==c.getCodigo()){
                this.ganancia = this.valorCompra * c.getGanancia() + this.valorCompra;


            }
        }

    */
    
    public void setGanancia(Listacategoria listacategoria){
        for(Categoria_articulo c: listacategoria.Categorialist){
            if(this.getCategoria()==c.getCodCat()){
                this.ganancia = this.ValorCompra * c.getGanancia() + this.ValorCompra;
            }
        
        
        }
    
    }
}
