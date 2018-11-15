/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.controlador.Coordinador;
import ec.edu.ister.modelo.Operaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author adminlab3
 */
public class Aplicacion {
   public static void main(String[] args){
      // Operaciones objeto= new Operaciones();
      // Operaciones.suma();
       //JOptionPane.showMessageDialog(null,Operaciones.resta());
       //objeto.division();
       //JOptionPane.showMessageDialog(null,division());    
       Coordinador objeto=new Coordinador();
       objeto.menuScanner();   
       
}
 }
   