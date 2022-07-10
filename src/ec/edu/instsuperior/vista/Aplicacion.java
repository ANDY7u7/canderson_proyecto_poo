/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.instsuperior.vista;
import ec.edu.instsuperior.modelo.Automovil;
import java.util.Scanner; 



/**
 *
 * @author Usuario
 */
public class Aplicacion {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in); 
        Automovil lerr= new Automovil(); 
        
         Automovil au1=new Automovil("KRT-0723", Automovil.TipoMarca.VMW ,2014, Automovil.tipoColor.NEGRO);
         
         System.out.print("Ingrese la placa del av-uto 1: ");
         au1.setPlaca(leer.next());
         System.out.print("Ingrese la marca: ");
         au1.setMarca(Automovil.TipoMarca.AUDI);
         System.out.print("Ingrese el año: ");
         au1.setAño(leer.nextInt());
         System.out.print("Ingrese el color: ");
         au1.setColor(Automovil.tipoColor.ROJO);
         System.out.println("\n\n\n");
        System.out.println(au1.toString());
        
        System.out.println("\n\n\n");
        System.out.println(au1.toString());
        
       
    }
}
