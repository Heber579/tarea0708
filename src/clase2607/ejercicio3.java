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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner (System.in);
        String figura;
        double base,altura,area,perimetro,radio;
        System.out.println("Ingrese el nombre de su figura geometrica");
        figura=lector.next();
        if (figura.equals("triangulo")){
            System.out.println("Ingrese la base");
            base=lector.nextDouble();
            System.out.println("Ingrese la altura");
            altura=lector.nextDouble();
            area=(base*altura)/2;
            System.out.println("El area es "+area);
        }else if (figura.equals("rectangulo")){
            System.out.println("Ingrese la base");
            base=lector.nextDouble();
            System.out.println("Ingrese la altura");
            altura=lector.nextDouble();
            area=(base*altura);
            perimetro=(base*2)+(altura*2);
            System.out.println("El area es "+area);
            System.out.println("El perimetro es "+perimetro);
        }else if (figura.equals("circulo")){
            System.out.println("Ingrese el radio");
            radio=lector.nextDouble();
            area=(3.1416)*(Math.pow(radio, 2));
            System.out.println("El area es "+area);
        }else{
            System.out.println("Figura no encontrada");
        }
        
    }
    
}
