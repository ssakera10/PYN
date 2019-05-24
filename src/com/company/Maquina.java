package com.company;
import java.util.Random;
import java.util.Scanner;

public class Maquina {

    int numero;
    int contador = 0;


    Scanner sc = new Scanner(System.in);



    void sacarNumero(){
        numero = new Random().nextInt(6);
        System.out.println(numero);
    }


}
