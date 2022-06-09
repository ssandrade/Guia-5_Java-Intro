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
public class GUIA5ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int [] vector;
       vector = new int[100];
        
       for (int i = 0 ; i < vector.length ; i++){
           vector[i] = i+1;
       } 
       
       for (int i = 99 ; i >= 0 ; i--){
           System.out.println("|"+vector[i]+"|");
           
       }
        
    }
    
}
