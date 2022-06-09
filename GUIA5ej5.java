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
public class GUIA5ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        long doble, triple, raiz, num;
        
        System.out.println("ingrese un numero entero");
        num = leer.nextLong();
        
        doble = num * 2;
        triple = num * 3;
        raiz = (long)Math.sqrt(num);
        
        System.out.println("el doble de "+num+" es " +doble);
        System.out.println("el triple de "+num+" es " +triple);
        System.out.println("la raiz de "+num+" es " +raiz);
    }
    
}
