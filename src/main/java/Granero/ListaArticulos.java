/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Granero;

import java.util.ArrayList;
import java.util.List;
public class ListaArticulos {
    private List<Articulo> articuloList;
   
    

    public ListaArticulos(List<Articulo> articuloList) {
        this.articuloList = articuloList;
    }
    
    public void showList(){
        for (Articulo articulo :articuloList){
            articulo.showInfo();
        }
    }

    public ListaArticulos() {
        
        articuloList= new ArrayList<>();
    }
    
    public void addarticuloList(Articulo a){
        
        this.articuloList.add(a);
        
    }
    

    
    
    public void generarGanancias(Listacategoria listaCategorias){
        for(Articulo a: articuloList){
            a.setGanancia(listaCategorias);
        }
    }

    
    public List<Articulo>getArticuloList(){
        return articuloList;
    }
    
}
