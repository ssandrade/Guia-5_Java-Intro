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
public class GUIA5ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int a, b, opcion, suma, resta, dividir, multiplicar;
        String confirmacion;
        
        System.out.println("Ingrese dos numeros enteros");
        a = leer.nextInt();
        b = leer.nextInt();
        System.out.println("opciones del menú ");
        System.out.println("1. Suma");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        for(int i = 0 ; i < 100 ; i++ ){
            System.out.println("ingrese una opcion");
            opcion = leer.nextInt();
        switch(opcion){
            case 1:
                suma = a + b;
                System.out.println("La suma de ambos numeros es de " + suma);
                break;
            case 2:
                resta = a - b;
                System.out.println("La resta de ambos numeros es de " + resta);
                break;
            case 3:
                multiplicar = a * b;
                System.out.println("La multiplicación de ambos numeros es de " + multiplicar);
                break;
            case 4:
                dividir = a / b;
                System.out.println("La división entre ambos numeros es de " + dividir);
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                confirmacion = leer.next();
                if (confirmacion.equals("S")){
                    i = 101;
                    System.out.println("Fin del programa");
                  break;
                }
        }
                
    }
        
        
        
              
    }
    
}
