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
public class GUIA5ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, num1;
        
        System.out.println("ingrese 2 numeros enteros");
        num = leer.nextInt();
        num1 = leer.nextInt();
        
        if (num > num1){
            System.out.println("el numero " +num +" es mayor");
          }else if (num1 > num){ 
           System.out.println("el numero " +num1 +" es mayor");
            }else if (num == num1){
           System.out.println("los numeros son iguales");
            }
    }
      
        
    }
