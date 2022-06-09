/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author Sergio
 */
public class GUIA5ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int vector [];
        vector = new int [100];
        int c1, c2, c3, c4, c5;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        c5 = 0;
       
        for (int i = 0 ; i < 100 ; i++){
            vector[i] = (int) (Math.random() * 100000);
            if (vector[i] < 10){
                c1 = c1+1;
            }else if (vector[i] < 100){
                c2 = c2+1;
            }else if (vector[i] < 1000){
                c3 = c3+1;
            }else if (vector[i] < 10000){
                c4 = c4+1;
            }else if (vector[i] < 100000){
                c5 = c5+1;
            }
            
            
            
        }
        
        System.out.println("de 100 numeros");
        System.out.println("se encontraron "+c1+" numeros con un digito");
        System.out.println("se encontraron "+c2+" numeros con dos digitos");
        System.out.println("se encontraron "+c3+" numeros con tres digitos");
        System.out.println("se encontraron "+c4+" numeros con cuatro digitos");
        System.out.println("se encontraron "+c5+" numeros con cinco digitos");
        
    }
    
}
