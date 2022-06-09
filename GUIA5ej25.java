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
public class GUIA5ej25 {
    Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int matriz [][] = new int [3][3];
        
        ingreso(matriz);
        comprobar(matriz);
        
    }
   public static void ingreso(int matriz[][]){
       Scanner leer = new Scanner(System.in);
       
       for (int i = 0 ; i < 3 ; i++){
           for (int j = 0 ; j < 3 ; j++){
               System.out.println("ingrese el numero en la posicion "+i+","+j);    
               int num = leer.nextInt();
               if (num > 9){
                   System.out.println("Numero incorrecto, ingrese un numero del 1 al 10 por favor");
                   j = j-1;
               }else{
                   j = j;
                   matriz[i][j] = num;
               } 
           }
       }
       System.out.println("matriz ingresada:");
       for (int i = 0 ; i < 3 ; i++){
           for (int j = 0 ; j < 3 ; j++){
               System.out.print("|"+matriz[i][j]+"|");
           }
        System.out.println("");
       }
   }
    public static void comprobar(int matriz[][]){
        int resultado, columna, fila, j, i;
        boolean log = true;
        resultado = 0;
        i = 0;
        while (log && i<3){
            j= 0;
            columna = 0;
            fila = 0;
            
            while ( j < 3){
                
                fila += matriz[i][j];
                columna += matriz[j][i];
                j++;
            }
            
            if (fila == columna ){
                if (i == 0){
                    resultado = fila;
                }else if (resultado != fila){
                    log =  false;
                }
            }else{
                log = false;
            }
            i++;
        }
        
        fila = 0;
        columna = 0 ;
        if (log){
            for(i = 0 ; i < 3 ; i++){
                fila += matriz[i][i];
                columna += matriz[3-1-i][i];
            }
            if (fila == columna){
                if (fila != resultado)
                    log = false;
            } else {
                log = false;
            }
        }
        
        if (log){
            System.out.println("Es un cuadrado magico ya que todos sus lados dan "+resultado);
         }else{
            System.out.println("No es un cubo magico");
        }
    }
    
    
}
