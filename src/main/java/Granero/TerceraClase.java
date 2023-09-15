/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Granero;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class TerceraClase {

    public static void main(String[] args) {
      //  Articulo articulo1 = new Articulo("001","Arroz","0-4",50,2500);
       // Articulo articulo2 = new Articulo("002","Lentejas","0-5",20,2800);
        
       // articulo1.showInfo();
       // articulo2.showInfo();
    /*   
      List <Articulo> listaArticulo = new ArrayList<>();
       
       listaArticulo.add(new Articulo("001","Arroz","0-4",50,2500));
       listaArticulo.add(new Articulo("002","Lentejas","0-5",20,2800));
       listaArticulo.add(new Articulo("003","Alberjas","0-6",25,2700));
       
       // Recorrer la lista de articulos para mostrar la info de cada articulo
       
      for(Articulo a:listaArticulo){
           a.showInfo();
       }
   */
    
    Listacategoria categoria = new Listacategoria();
    
    categoria.addCategorialist(new Categoria_articulo("0-A","Alimentos",0.10));
    categoria.addCategorialist(new Categoria_articulo("0-B", "Aseo",0.15));
    
   
    
    
    ListaArticulos articulos = new ListaArticulos();
    
    articulos.addarticuloList(new Articulo("001","Alberja","0-A",50,2500));
    articulos.addarticuloList(new Articulo("002","Frijol","0-A",20,2800));
    articulos.addarticuloList(new Articulo("003","Arroz","0-A",25,2700));
    
    articulos.generarGanancias(categoria);
    
     
    
    
    Listaventas venta = new Listaventas();
    venta.addventalista(new Ventas("0-A", "001", 24));
    venta.addventalista(new Ventas("0-A", "002", 25));
    venta.addventalista(new Ventas("0-A", "003", 26));
    venta.generarTotal(articulos);
        
    venta.showList();
    
    
    }
   

}
