/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Granero;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DROGON
 */
public class Listacategoria {
    
    List<Categoria_articulo> Categorialist;

    public Listacategoria(List<Categoria_articulo> Categorialist) {
        this.Categorialist = Categorialist;
    }

    public Listacategoria() {
        
        Categorialist= new ArrayList();
    }
    
    public void addCategorialist(Categoria_articulo c){
        this.Categorialist.add(c);
    }
    
    public void showList(){
        for(Categoria_articulo c: this.Categorialist)
            c.showInfo();
        
    }

}
