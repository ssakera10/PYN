package com.company;

import java.util.Random;
import java.util.Scanner;

public class MainOK {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero1;
            int numero2;
            int sumatorio;
            int random = new Random().nextInt(6);
            int decision;
            int contador=0;
            int contadorMaquina=0;


            for (int i = 1; i >=1 & i<= 3 ;i++) {
                System.out.println("ronda numero " + i);
                System.out.println("humano " +  contador  + " VS Maquina " + contadorMaquina );


                System.out.println("Turno del jugador, Pares o Nones ?");
                System.out.println();
                System.out.println("Pares = 1 , Nones = 2");
                decision = sc.nextInt();
                System.out.println("Turno del jugador");
                System.out.println();

                numero1 = sc.nextInt();

                System.out.println("Turno de la maquina");
                System.out.println();

                numero2 = random;
                System.out.println(numero2);

                sumatorio = numero1 + numero2;
                System.out.println("Resultado " + sumatorio);
                System.out.println();

                if (sumatorio % 2 == 0 && decision == 1) {
                    System.out.println("Gana humano");
                    System.out.println();


                } else if (sumatorio % 2 != 0 && decision == 2) {
                    System.out.println("Gana humano");
                    contador++;
                    System.out.println();
                } else {
                    System.out.println("gana maquina");
                    contadorMaquina++;
                    System.out.println();
                }
            }
        }
    }
