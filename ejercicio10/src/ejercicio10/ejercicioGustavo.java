/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author gasanchezg01
 */
public class ejercicioGustavo {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
        int numero;
        
         System.out.println("Por favor introduzca un número : ");
        numero = entrada.nextInt();
        
        
        if ( numero > 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }
   }
}
