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
public class GUIA5ej23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
      int [][] matriz = new int [4][4];
      int [][] transpuesta = new int [4][4];
      
        System.out.println("matriz original");
      for(int i = 0 ; i < 4 ; i++){
          System.out.println("");
          for(int j = 0 ; j < 4 ; j++){
             matriz[i][j] = (int)(Math.random() * 10);
              System.out.print(matriz[i][j]+"|");
          }
      }
        System.out.println("");
        System.out.println("Matriz transpuesta:");
      for (int i = 0 ; i < 4 ; i++){
          for(int j = 0 ;j < 4 ; j++){
              transpuesta [j][i] = matriz[i][j];
          }
      }
      for (int i = 0 ; i < 4 ; i++){
          for(int j = 0 ; j < 4 ; j++){
              System.out.print("|"+transpuesta[i][j]);
          }
          System.out.println("");
      }
     
    }
    
}
