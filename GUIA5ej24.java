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
public class GUIA5ej24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int matriz [][] = new int [3][3];
        
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.println("ingrese el numero en la posicion "+i+","+j+" de la matriz"); 
                int num = leer.nextInt();
                matriz[i][j] = num; 
            }
        }
     mostrar(matriz);
     comprobar(matriz);
        
    }
    public static void comprobar(int matriz [][]){
        boolean log = false;
        for (int i = 0 ; i <3 ; i++){
           for (int j = 0 ; j < 3 ; j++){
               if (matriz[i][j] == -matriz[j][i]){
                   log = true;
               }
           } 
        }
         if (log == true){
             System.out.println("La matriz es antisimetrica");
         }else{
             System.out.println("La matriz no es antisimetrica");
         }
    }
    public static void mostrar(int matriz [][]){
        System.out.println("la matriz cargada es:");
         for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(matriz[i][j]+" ");
            }
             System.out.println("");
        }
        
        System.out.println("La matriz transpuesta es");
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(matriz[j][i]+" ");
            }
             System.out.println("");
        }
    }
}
