/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
  import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("ingrese un numero a evaluar: ");
        int m = valor.nextInt();
        System.out.println("numeros inpares: ");
        for (int i = 1;i<=m;i+=2){
            System.out.println("inpar: "+i);
            
        }
    }
}
