/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaconcat;

import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class PruebaConcat {
    static Scanner ent = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CONCATENAR");
        System.out.println("==============================================");
        System.out.println("");
        System.out.print("INTRODUZCA SU NOMBRE: ");
        String nom = ent.nextLine();
        System.out.print("INTRODUZCA SU PRIMER APELLIDO: ");
        String ape = ent.nextLine();
        System.out.println("\tNombre completo: "+nom+" "+ape);
        
        
    }
    
}
