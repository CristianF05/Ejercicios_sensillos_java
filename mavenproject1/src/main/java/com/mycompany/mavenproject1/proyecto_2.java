/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
 import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class proyecto_2 {
     public static void main(String[] args) {
         Scanner v = new Scanner(System.in);
         System.out.println("ingre un numero: ");
         int n1 = v.nextInt();
         System.out.println("ingrese un numero: ");
         int n2 = v.nextInt();
         if(n1 != n2)
         {
             System.out.println(n1+" != "+n2+" los numerso diferentes ");
         }
         if (n1 < n2){
             System.out.println(n1+" < "+n2+" el numero "+n1+" es menor al numero "+n2);
         } 
         if (n1 <= n2){
              System.out.println(n1+" <= "+n2+" "+n1+" es igual o diferente a "+n2);
         }
         if (n1 == n2){
             System.out.println(n1+" == "+n2+" "+n1+" es igual a "+n2);
         }
         
     
}
}
