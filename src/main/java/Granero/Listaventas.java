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
public class Listaventas {
   private List<Ventas> ventaList;

    public Listaventas(List<Ventas> ventaList) {
        this.ventaList = ventaList;
    }

    public Listaventas() {
        
        this.ventaList= new ArrayList<>();
    }
   
   public void addventalista(Ventas v){
       this.ventaList.add(v);
   }
   
   public void showList(){
       for(Ventas v: this.ventaList)
           v.showInfo();
   }
   
   public void generarTotal(ListaArticulos listaArticulos){
       for(Ventas venta:ventaList){
           venta.Calculartotal(listaArticulos);
       }
   }
}
