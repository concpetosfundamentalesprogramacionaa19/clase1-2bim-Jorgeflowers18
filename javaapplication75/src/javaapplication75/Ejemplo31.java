/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Random aleatorios = new Random();
        int[] datos = new int[6];
        
        String[] rangos = {"0-8", "8.1-12", "12.1-16", "16.1-19", "19.1-20",
            "20.1-∞"};
        
        int opt;
        boolean bandera = true;
        
        while (bandera == true) {
            // peticion de notas al usuario
            System.out.println("Ingrese la nota del estudiante: ");
            double cantidad = entrada.nextDouble();
            // ciclos repetitivos para discriminar los datos ingresados
            if (cantidad >= 0 && cantidad <= 8) {
                datos[0] = datos[0] + 1;
            } else {
                if (cantidad >= 8.1 && cantidad <= 12) {
                    datos[1] = datos[1] + 1;
                } else {
                    if (cantidad >= 12.1 && cantidad <= 16) {
                        datos[2] = datos[2] + 1;
                    } else {
                        if (cantidad >= 16.1 && cantidad <= 19) {
                            datos[3] = datos[3] + 1;
                        } else {
                            if (cantidad >= 19.1 && cantidad <= 20) {
                                datos[4] = datos[4] + 1;
                            } else {
                                if (cantidad >= 20.1) {
                                    datos[5] = datos[5] + 1;
                                }
                            }

                        }
                    }

                }
            }
            System.out.println("Si desea ingresar mas datos presione 1, si no "
                    + "desea ingresar mas datos presione 2");
            opt = entrada.nextInt();
            if (opt == 2) {
            bandera = false;
        }
        
        }
        System.out.println("Resultados");

        for (int i = 0; i < datos.length; i++) {
            // salida de datos
            System.out.printf("Notas en %s - %d\n", rangos[i], datos[i]);
        }

    }
}
