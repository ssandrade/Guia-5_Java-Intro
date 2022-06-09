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
public class GUIA5ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("ingrese un numero");
        num = leer.nextInt();
        
        if(num % 2 == 0){
        System.out.println("el numero ingresado es par");
        }else 
        System.out.println("el numero ingresado es impar");
        }
        
        
    }
   
