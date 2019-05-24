package com.company;

public class Main {

    public static void main(String[] args) {
        Partida partida = new Partida();
        Jugador jugador = new Jugador();
        Maquina maquina = new Maquina();


        for (int i = 1; i<= 3 ;i++) {

            partida.mostrarRonda(i);

            partida.mostrarMarcador(jugador.contador, maquina.contador);

            jugador.pedirDecision();

            jugador.decidir();

            partida.enseñarTurno1();

            jugador.numero();

            partida.enseñarTurno2();

            maquina.sacarNumero();

            partida.sumarNumeros(jugador.numero, maquina.numero);

            partida.mostrarSuma();

            partida.mostrarGanador(jugador.decision, jugador.contador, maquina.contador);
        }
    }
}
