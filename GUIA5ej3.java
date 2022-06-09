/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Sergio
 */
public class GUIA5ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        String frase, min, may;
        
        System.out.println("ingrese una frase para convertir");
        frase = leer.next();
        
       min = toLowerCase(frase); 
       may = toUpperCase(frase);
       
       System.out.println("En minusculas: " + min);
       System.out.println("En mayusculas: " + may);
    }
    
}
