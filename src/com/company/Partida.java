package com.company;
import java.util.Scanner;

public class Partida {

    int sumatorio;


    void enseñarTurno1(){
        System.out.println("Turno del jugador");
        System.out.println();
    }

    void enseñarTurno2(){
        System.out.println("Turno de la maquina");
        System.out.println();

    }

    void mostrarRonda(int ronda){
        System.out.println("ronda numero " + ronda);

    }

    void mostrarMarcador(int contador, int contadorMaquina){
        System.out.println("humano " +  contador  + " VS Maquina " + contadorMaquina );
    }

    void sumarNumeros(int num, int num2){
        sumatorio = num + num2;
    }

    void mostrarSuma(){
        System.out.println("Resultado " + sumatorio);
        System.out.println();
    }

    void mostrarGanador(int decision, int contador, int contadorMaquina) {
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
