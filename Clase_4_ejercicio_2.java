/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_2;

import java.util.Scanner;

/**
 *
 * @author Camila Pc
 */
public class Ej_2 {
/* Realizar un programa que dado un límite numérico, muestre en pantalla todos los números hasta ese límite*/
public static void main(String[] args) {
Scanner limite = new Scanner(System.in);
System.out.println("Ingrese un valor: ");
int i;
int numero = limite.nextInt();
for (i = 1; i <= numero; i++)  {
    System.out.println(i);
}
}
}


