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
        int n;
        System.out.println("ingrese numero inicial: ");
        int i = valor.nextInt();
        System.out.println("ingrese numero final: ");
        int m = valor.nextInt();
        System.out.println("numeros inpares: ");
        if(i %2 ==0){
                 n = i + 1;
            
        for (;n<=m;n+=2){
            
            System.out.println("inpar: "+n); 
        }
        }
        else {
        for (;i<=m;i+=2){
            System.out.println("inpar: "+i);
        }
        }
    }
}
