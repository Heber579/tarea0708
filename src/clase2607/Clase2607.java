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
public class Clase2607 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1 Realice un programa que pida una edad y determine si es menoy o mayor de edad
        Scanner lector=new Scanner (System.in);
        int edad;
        System.out.println("Ingrese la edad");
        edad=lector.nextInt();
        if (edad>=18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
    
}
