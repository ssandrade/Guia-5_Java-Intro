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
public class GUIA5ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String cadena;
        int correctas;
        correctas = 0;
        
        for( int i = 0 ; i < 10000000 ; i++){
        System.out.println("ingrese el fORMATO del dispositivo");
        cadena = leer.next();
        if (cadena.equals("&&&&&")){
            System.out.println("Usted eligió salir del menú");
            cadena.equals("FDE");
            break;
        }
        if (cadena.length() == 5){
        }else{
                  System.out.println("formato incorrecto"); 
                  break;
                    }
            if (cadena.substring(0,1).equals("X")){
            }else{
                        System.out.println("formato incorrecto");
                        break;
                        }
                if (cadena.substring(4,5).equals("O")){
                
                 correctas = correctas + 1;
                }else{
                         System.out.println("formato incorrecto");
                         break;
                         }
                
        }
        System.out.println("hubieron " + correctas +" formatos correctos");
        
        
        
    }
    
}
