
package clase_5_ej_2;

/**
 *
 * @author Camila Pc
 * Realizar un programa que permita la carga de 10 numeros en un vector.
 * Una vez cargados se necesita que el programa determine cual es el mayor y cual es el menor de ellos
 * 
 */

import java.util.Scanner;
import java.util.Arrays;

public class Clase_5_ej_2 {

    public static void main(String[] args) {
        int vector[] = new int[10];
        Scanner teclado = new Scanner (System.in); 
        
        for(int i = 0; i <= 9; i++){
            System.out.println("Ingrese el valor para el índice" + i + ": ");
            vector[i] = teclado.nextInt();
        }
        int mayor = vector[0]; 
        for (int i = 1; i < vector.length; i++) {
			if (vector[i] > mayor) {
				mayor = vector[i];
			}
        }
        System.out.println("El mayor es: " + mayor);
        int menor = vector[0]; 
        for (int i = 1; i > vector.length; i++) {
			if (vector[i] > menor) {
				menor = vector[i];
			}
        }
        System.out.println("El menor es: " + menor);
}}
