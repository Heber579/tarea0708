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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner (System.in);
        String operacion;
        int sumando1,sumando2,total,minuendo,sustraendo,diferencia,multiplicando,multiplicador,producto,dividendo,divisor,cociente;
        System.out.println("Ingrese la abreviatura de la operacion que desea realizar");
        System.out.println("s (suma), r (resta), m (Producto, multiplicacion), d (division)");
        operacion=lector.next();
        if (operacion.equals("s")){
            System.out.println("Ingrese el valor del primer sumando");
            sumando1=lector.nextInt();
            System.out.println("Ingrese el valor del segundo sumando");
            sumando2=lector.nextInt();
            total=sumando1+sumando2;
            System.out.println("La suma total es "+total);
        }else if (operacion.equals("r")){
            System.out.println("Ingrese el valor del minuendo");
            minuendo=lector.nextInt();
            System.out.println("Ingrese el valor del sustraendo");
            sustraendo=lector.nextInt();
            diferencia=minuendo-sustraendo;
            System.out.println("La suma total es "+diferencia);
        }else if (operacion.equals("m")){
            System.out.println("Ingrese el valor del multiplicando");
            multiplicando=lector.nextInt();
            System.out.println("Ingrese el valor del multiplicador");
            multiplicador=lector.nextInt();
            producto=multiplicando*multiplicador;
            System.out.println("La suma total es "+producto);
        }else if(operacion.equals("d")){
            System.out.println("Ingrese el valor del dividendo");
            dividendo=lector.nextInt();
            System.out.println("Ingrese el valor del divisor");
            divisor=lector.nextInt();
            cociente=dividendo/divisor;
            System.out.println("La suma total es "+cociente);
        }
    }
//cambios realizados desde casa
//Es una prueba
}
