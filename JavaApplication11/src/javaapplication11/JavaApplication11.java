/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //diego
    int num1;
    int num2;
    int resultado;
    
    Scanner constructor=new Scanner(System.in);
    System.out.println("Ingrese el primer numero:");
    num1=constructor.nextInt();
    
    System.out.println("Ingrese el segundo numero:");
    num2=constructor.nextInt();
    
    resultado=num1+num2;
    System.out.println("El resultado de la suma es "+resultado);
    //juli
    
    resultado=num1-num2;
    System.out.println("El resultado de la resta es "+resultado);
    //felipe
    
    resultado=num2/num1;
    System.out.println("El resultado de la division es "+resultado);
        
    }
    
}
