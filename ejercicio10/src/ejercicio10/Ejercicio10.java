/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author Barbero
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero = 0;
        int contador = 0;
        int numero_aleatorio;
        do {
            numero_aleatorio = (int) ((Math.random()) * 100 + 1);
            if (numero_aleatorio % 2 != 0) {
                System.out.println(numero_aleatorio);
                numero++;
            }
            contador++;
        } while (numero < 3);

        System.out.println("Cantidad de valores aleatorios: " + contador);
        System.out.println("Modificacion gustavo");
    }
    
}
