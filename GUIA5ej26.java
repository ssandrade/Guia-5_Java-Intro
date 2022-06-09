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
public class GUIA5ej26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int matrizM [][] = new int [10][10];
         int matrizP [][] = new int [3][3];
    
    llenar(matrizM);
    ingreso(matrizP);
    comprobar (matrizM,matrizP);  
        
        
    }
    public static void llenar(int matrizM[][]){
        
        System.out.println("Matriz 10x10:");
        
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
               matrizM[i][j] = (int) (Math.random() * 100);
               if (matrizM[i][j] >9){
                   System.out.print(matrizM[i][j]+"|");
               }else{
                   System.out.print(matrizM[i][j]+" |");
               }
            }
            System.out.println("");
        }
    }
    public static void ingreso(int matrizP[][]){
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("ingrese la matriz 3x3 que quiere buscar");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                num = leer.nextInt();
                if(num > 99){
                    System.out.println("ingrese un numero de 1 o 2 digitos por favor");
                    j = j-1;
                }else{
                    j = j;
                    matrizP[i][j] = num; 
                }
            }
        }
        
        System.out.println("matriz ingresada");
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               if(matrizP[i][j]<9){
                   System.out.print(matrizP[i][j]+" |");
               }else{
                   System.out.print(matrizP[i][j]+"|");
               }
            }
            System.out.println("");
        }
        
    }
    public static void comprobar(int [][] matrizP, int [][] matrizM){
        int pi=0, pj=0;
        boolean log = false;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrizP[0][0] == matrizM[i][j]){
                    pi = i;
                    pj = j;
                    log = verificar(pi, pj, matrizM, matrizP);
                    if (log){
                    System.out.printf("¡¡La matriz fue encontrada!!En la posicion [%d][%d]"+i,j);
                    break;
                     }else{
                      System.out.println("La matriz no fue encontrada");
                    }
                }
            }
            if(log){
                break;
            }
        }  
        
        if(log){
            System.out.printf("¡¡La matriz fue encontrada!!En la posicion [%d][%d]"+pi,pj);
            
        }else{
            System.out.println("La matriz no fue encontrada");
        }
    }
    public static boolean verificar(int pi, int pj, int matrizM[][], int matrizP[][]) {
        int a=0,s=0,cont=0;
        boolean log = false;
        
        for (int i = pi; i < pi+3; i++) {
            for (int j = pj; j < pj+3; j++) {
              if(matrizM[i][j] == matrizP[a][s]){
                  cont++;
                 }else{
                  log = false;
                 }
              s++;
            }
            a++;
            s = 0;
        }
        
      if (log && cont == 9){
          return true;
      }else{
         return false;
      }  
        
        
    }
}
