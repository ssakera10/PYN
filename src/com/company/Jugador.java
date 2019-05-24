package com.company;
import java.util.Scanner;

public class Jugador {
    int decision;
    int numero;
    int contador = 0;

    Scanner sc = new Scanner(System.in);


    void decidir(){
        decision = sc.nextInt();
    }


    void pedirDecision(){
        System.out.println("Turno del jugador, Pares o Nones ?");
        System.out.println();
        System.out.println("Pares = 1 , Nones = 2");
        System.out.println();

        decision = sc.nextInt();
    }



    void numero(){
        numero = sc.nextInt();
    }


}

