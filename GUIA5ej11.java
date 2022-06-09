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
public class GUIA5ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int tipodemotor;
        
        System.out.println("ingrese un numero del 1 al 4 para saber el tipo de motor");
        tipodemotor = leer.nextInt();
        
        if (tipodemotor >= 1 && tipodemotor <= 4){
            
            switch (tipodemotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                   break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                   break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                   break;
            case 4: 
                System.out.println("La bomba es una bomba de pasta alimenticia");
                   break;
            }
        }else{
        System.out.println("No existe un valor valido para tipo de bomba");
        }
        
        
    }
    
}
