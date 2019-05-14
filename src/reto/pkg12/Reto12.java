/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto.pkg12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author lalor
 */
public class Reto12 {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int numeroKm;
        int nivelVidacaballo = 0;
        int nivelVidaUsuario = 100;
        int Kmrecorrido = 0;
        int opcion = 0;
        System.out.println("Ingrese cantidad de Km a recorrer");
        numeroKm = Integer.parseInt(entrada.readLine());

        Random aleatorio = new Random(System.currentTimeMillis());
        for (int KmActual = 1; KmActual <= numeroKm; KmActual++) {
            System.out.println("Elcabalo esta en el km" + KmActual);

            if (Kmrecorrido == 5) {

                opcion = aleatorio.nextInt(4) + 1;
                switch (opcion) {
                    case 1:
                        nivelVidaUsuario += 10;
                        System.out.println("--- Encontramos un paquete de vida =)---");
                        System.out.println("--- + 10 puntos al usuario ---");
                        break;
                    case 2:
                        nivelVidaUsuario -= 5;
                        nivelVidacaballo -= 5;
                        System.out.println(" --- Encontramos una bomba =( ---");
                        System.out.println(" --- - 5 puntos al usuario ---");
                        System.out.println(" --- - 5 puntos al caballo ---");
                        break;
                    case 3:
                        nivelVidacaballo += 10;
                        System.out.println("--- Encontramos un pasto =)---");
                        System.out.println("--- + 10 puntos al caballo ---");
                        break;
                    case 4:
                        nivelVidacaballo -= 5;
                        System.out.println("--- Encontramos una trampa =( ---");
                        System.out.println("--- - 5 puntos al caballo ---");
                        break;
                    default:
                        break;

                }

                Kmrecorrido = 0;
            } else {
                opcion = aleatorio.nextInt(3) + 1;
                if (opcion == 1) {
                    nivelVidaUsuario += 10;
                    System.out.println("--- Encontramos un paquete de vida =)---");
                    System.out.println("--- + 10 puntos al usuario ---");
                } else if (opcion == 2) {
                    nivelVidaUsuario -= 5;
                    nivelVidacaballo -= 5;
                    System.out.println(" --- Encontramos una bomba =( ---");
                    System.out.println(" --- - 5 puntos al usuario ---");
                    System.out.println(" --- - 5 puntos al caballo ---");
                }
            }

            Kmrecorrido++;

            if (nivelVidaUsuario == 0 || nivelVidacaballo == 0) {
                System.out.println("--- Se acabo el juego =( ---");
                break;
            }
        }
    }
}
