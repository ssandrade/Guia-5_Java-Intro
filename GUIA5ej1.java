/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class GUIA5ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
              
      double num, suma, num1; 
     System.out.println("ingrese dos numeros para sumarlos entre si");
     
          num = leer.nextDouble();   
          num1 = leer.nextDouble();
          
        suma=num+num1;
        System.out.println("la suma entre "+num+" y "+num1+" es "+suma);         
        
      
    }
    
}
