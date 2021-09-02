/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_4_ej_5;
import java.util.Scanner;
/**
 *
 * @author Camila Pc
 */
public class Clase_4_ej_5 {
 /* Realizar un programa que muestre en pantalla palabras que sean
        ingresadas por teclado hasta que se ingrese la palabra "salir".
        */
    public static void main(String[] args) {
    Scanner p = new Scanner(System.in);
    String palabra = "";
    
    while (!palabra.equals("salir")){
        System.out.println("Ingrese una palabra:");
        palabra = p.nextLine();
    }
        
    }
    
}
