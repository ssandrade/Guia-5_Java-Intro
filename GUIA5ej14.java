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
public class GUIA5ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        float num, suma;
        suma = 0;
        
        System.out.println("Ingrese numeros enteros positivos");
        for (int i = 0 ; i < 20 ; i++ ){
            num = leer.nextFloat();
            
            if(num == 0 ){
                System.out.println("Se capturó un 0");
                break ;
            }else if (num > 0){
                suma = num + suma; 
            }
            
        }
         System.out.println("La suma de los numeros ingresados es "+ suma);
    }
    
}
