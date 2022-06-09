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
public class GUIA5ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, num3, num4;
        
        System.out.println("Ingrese 4 numeros del 1 al 20");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();
        num4 = leer.nextInt();
        
        if(num1 <= 20){
            System.out.print(num1);
           for(int i = 0 ; i < num1 ; i++){
               System.out.print("*");
               
           }
        }else{
            System.out.println("valor incorrecto");
        }
        
        System.out.println(" ");
        
        if(num2 <= 20){
            System.out.print(num2);
           for(int i = 0 ; i < num2 ; i++){
               System.out.print("*");
               
           }
        }else{
             System.out.println("valor ingresado incorrecto");
         }
        
        System.out.println(" ");
        
        if(num3 <= 20){
            System.out.print(num3);
           for(int i = 0 ; i < num3 ; i++){
               System.out.print("*");
               
           }
        }else{
            System.out.println("valor ingresado incorrecto");
        }
        
        System.out.println(" ");
        
        if(num4 <= 20){
            System.out.print(num4);
          for(int i = 0 ; i < num4 ; i++){
              System.out.print("*");
               
           }
        }else{
            System.out.println("valor ingreado incorrecto");
        }
    }
    
}
