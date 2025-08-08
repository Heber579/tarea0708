/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2607;

import java.util.Scanner;

/**
 *
 * @author Ever
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //++++++++++Realizar un programa que pida un sueldo
        //++++++++++Si el sueldo es mayor a Q2,000 que calcule
        //++++++++++EL 20% de aumento y si es menor que calcule
        //++++++++++El 10% de aumento
        
        Scanner lector=new Scanner (System.in);
        double sueldo,aumento,nuevosueldo;
        System.out.println("Ingrese su sueldo");
        sueldo= lector.nextDouble();
        if (sueldo>2000){
            aumento=sueldo*0.20;
            nuevosueldo= sueldo + aumento;
            System.out.println("Su aumento es de Q"+aumento);
            System.out.println("El nuevo sueldo es Q"+nuevosueldo);
        }else{
            aumento=sueldo*0.10;
            nuevosueldo=sueldo+aumento;
            System.out.println("Su aumento es de Q"+aumento);
            System.out.println("El nuevo sueldo es Q"+nuevosueldo);
        }
    }
   
}
