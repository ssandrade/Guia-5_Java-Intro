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
public class GUIA5ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int tamaño;
        
        System.out.println("indique el tamaño del cuadrado");
        tamaño = leer.nextInt();
        
        for( int i = 0 ; i < tamaño ; i++){
            System.out.print("*");
        }
        System.out.println();
        
        for( int i = 0 ; i < tamaño-2 ; i++){
            System.out.print("*");
            for( int j = 0 ; j < tamaño-2 ; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        
       for( int i = 0 ; i < tamaño ; i++){
            System.out.print("*");
        }
        
        
    }
    
}
