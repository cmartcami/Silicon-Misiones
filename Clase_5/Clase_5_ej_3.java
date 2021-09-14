
package clase_5_ej_3;

import java.util.Scanner;

/**
 *
 * @author Camila Pc
 * Realizar un programa que permita la carga de 15 numeros
 * una vez cargados se necesita que el programa cuente e informe en pantalla
 * cuantas veces se cargó el número 3.
 */
public class Clase_5_ej_3 {


    public static void main(String[] args) {
        int vector[] = new int[15];
        Scanner teclado = new Scanner (System.in); 
        
        for(int i = 0; i <= 14; i++){
            System.out.println("Ingrese el valor para el índice " + i + ": ");
            vector[i] = teclado.nextInt();
        }
        int cantidad = 0;
        for(int i = 0; i < vector.length ; i++){
           if(vector[i] == 3){
                       cantidad ++ ;
           }}
        System.out.println("La cantidad de veces que se cargó el número 3 es:" + cantidad);
    
    }
    
}
