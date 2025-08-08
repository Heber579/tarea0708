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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner (System.in);
        int precio,descuento,preciofinal;
        System.out.println("Ingrese el precio final de la compra");
        precio=lector.nextInt();
        if (precio<500){
            System.out.println("Compra pequeña. No aplica descuento");
        }else if ((precio>=500) && (precio<=1000)){
            descuento=(int) (precio*0.05);
            preciofinal=precio-descuento;
            System.out.println("Descuento del 5% efectuado");
            System.out.println("Precio final de la compra: "+preciofinal);
        }else if ((precio>1001) && (precio<=7000)){
            descuento=(int) (precio*0.11);
            preciofinal=precio-descuento;
            System.out.println("Descuento del 11% efectuado");
            System.out.println("Precio final de la compra: "+preciofinal);
        }else if ((precio>7001) && (precio<=15000)){
            descuento=(int) (precio*0.18);
            preciofinal=precio-descuento;
            System.out.println("Descuento del 18% efectuado");
            System.out.println("Precio final de la compra: "+preciofinal);   
        }else{
            descuento=(int) (precio*0.25);
            preciofinal=precio-descuento;
            System.out.println("Descuento del 25% efectuado");
            System.out.println("Precio final de la compra: "+preciofinal); 
        }
   
    }
    
}
