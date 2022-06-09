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
public class GUIA5ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        String frase;
        
        System.out.println("ingrese una frase");
        frase = leer.next();
        
        if (frase.equals("eureka")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
    }
    
}
