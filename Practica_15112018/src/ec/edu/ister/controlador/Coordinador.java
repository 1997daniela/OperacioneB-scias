/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import ec.edu.ister.modelo.Operaciones;
import java.util.Scanner;

/**
 *
 * @author adminlab3
 */
public class Coordinador {
    Scanner entrada =new Scanner(System.in);
    Operaciones objOperaciones=new Operaciones();
    public void opcionesMenu(){
          System.out.println("Ingresa un opción; \n"
           +"1.-Sumar(met clase)\n"
           +"2.- Restar (met clase)\n"
           +"3.-División(met instancia)\n"
           +"4.- Multiplicacion(met instancia)\n"
           +"5 salir \n");
    }
   public void menuScanner(){
       int op=0;
       do{
         opcionesMenu();
           op=entrada.nextInt();
         switch (op){
          case 1:
           Operaciones.suma();
           break;
          case 2:          
         System.out.println("La resta es: " +Operaciones.resta());
         break;
         case 3:
         objOperaciones.division();
         break;
         case 4:
         System.out.println("la multipliccion es"+objOperaciones.multiplicacion());
         break;
        }
            }while(op!=5);
     
 }
   
}
   