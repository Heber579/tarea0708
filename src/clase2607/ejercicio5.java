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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner (System.in);
        int numero;
        System.out.println("Ingrese un numero");
        numero=lector.nextInt();
        if ((numero>=0)&&(numero<=9)){
            System.out.println("El numero ingresado contiene un digito");
        }else if ((numero>=10)&&(numero<=99)){
            System.out.println("El numero ingresado contiene dos digitos");
        }else if ((numero>=100)&&(numero<=999)){
            System.out.println("El numero ingresado contiene tres digitos");
        }else{
            System.out.println("Error. Cantidad de digitos exedentes");
        }
        
    }
    
}
