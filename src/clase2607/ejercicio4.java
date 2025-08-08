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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner (System.in);
        String letra;
        System.out.println("Ingrese una letra del abedecario");
        letra=lector.next();
        if ((letra.equals("a")) || (letra.equals("e")) || (letra.equals("i")) || (letra.equals("o")) || (letra.equals("u"))){
            System.out.println("La letra es una vocal");
        }else
            System.out.println("La letra es una consonante"); 
        
    }
    
}
