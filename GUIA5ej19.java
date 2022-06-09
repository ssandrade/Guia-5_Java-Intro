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
public class GUIA5ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
     String tipo;
     int cambio;
        System.out.println("ingrese la cantidad de euros y a que valor los quiere cambiar");
        cambio = leer.nextInt();
        tipo = leer.next();
        resF(tipo, cambio);
        
    }
    
    public static void resF(String tipo, int cambio) {
   
        double res ;
        if (tipo.equals("dolares")){
         res = 1.049 * cambio ;
         System.out.println(cambio+" euros pasados a "+tipo+" da como resultado "+res);
        
        }else if(tipo.equals("yenes")){
         res = 137.39 * cambio;
         System.out.println(cambio+" euros pasados a "+tipo+" da como resultado "+res);
            
        }else if(tipo.equals("libras")){
         res = 19.41 * cambio;
         System.out.println(cambio+" euros pasados a "+tipo+" da como resultado "+res);
            
        }else{
            System.out.println("verifique haber escrito bien el tipo de cambio");
        }
        
        
    }
    
    
}
