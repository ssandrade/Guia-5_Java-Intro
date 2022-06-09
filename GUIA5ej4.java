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
public class GUIA5ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
       
        double c, f;
        
        System.out.println("ingrese los centigrados a convertir");
        c = leer.nextDouble();
        
        f = 32 + (9 * c / 5);
                
         System.out.println("el valor de " + c + "C° a Fahrenheit es de " + f );
        
    }
    
}
