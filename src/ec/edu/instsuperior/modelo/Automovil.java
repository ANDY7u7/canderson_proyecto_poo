/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.instsuperior.modelo;

/**
 *
 * @author Usuario
 */
public class Automovil {
    
    private String placa;
    public enum TipoMarca {CHEVROLET, TOYOTA, VMW, AUDI}
    private TipoMarca marca;
    private int año;
    public enum tipoColor {ROJO, NEGRO, BLANCO, AZUL}
    private tipoColor color;
    
     public Automovil() {
    }
      public Automovil(String placa, TipoMarca marca, int año, tipoColor color) {
        this.placa = placa;
        this.marca = marca;
        this.año = año;
        this.color = color;
      }
      public void setPlaca(String Placa){
          this.placa=placa;
          
      }
     public void setMarca(TipoMarca marca){
             this.marca=marca; 
     
      }
     public void setAño(int año){
         this.año=año;
         
     }
     public void setColor(tipoColor color){
         this.color=color;
         
     }
     public String getPlaca(){
         return placa;
         
     }
     public TipoMarca getMarca(){
         return marca;
         
     } 
     public int getAño(){
         return año;
         
     }
     public tipoColor getColor(){
         return color; 
     }
     
     @Override
     public String toString(){
         return "los datos del vehiculo: \n"
                + "Placa: "+getPlaca()+"\n"
                + "Marca: "+getMarca()+"\n"
                + "Año: " +getAño();
                
                 
     }
     
     
      
      
        
        
        
   
}
