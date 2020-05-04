/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodos.java;

import java.util.Scanner;

public class EjemploDosJava {
    
  Scanner lector = new Scanner(System.in);  
    
    
public EjemploDosJava() {
    
    double rad, area, longitud;
    
    System.out.println ("Ingrese el radio del circulo");
    rad=lector.nextDouble();
    
    area=Math.PI*Math.pow(rad,2) ;
     longitud=2*Math.PI*rad;
     
     System.out.println("El area del circulo es: "+area );
     System.out.println("La longitud de la circunferencia es: "+longitud);
   
}

    
   
    public static void main(String[] args) {
      EjemploDosJava solucion  = new EjemploDosJava ();
    }
    
}

