package JUEGO.src.MODELO;

import java.util.ArrayList;

public class tablero {
    private ArrayList<casilla> casillas;
    private ArrayList<jugador> jugadores;
    private  int turnos;
    private  jugador jugador;


    public tablero (ArrayList<casilla> casillas ,ArrayList<jugador> jugadores, int turnos , jugador jugador ){
        this.casillas = casillas;
        this.jugadores = jugadores;
        this.turnos=turnos;
        this.jugador = jugador;
    }
    public ArrayList<casilla> getCasillas() {
        return casillas;
    }

    public void setCasillas(ArrayList<casilla> casillas) {
        this.casillas = casillas;
    }

    public ArrayList<jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public int getTurnos() {
        return turnos;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }

    public jugador getJugador() {
        return jugador;
    }

    public void setJugador(jugador jugador) {
        this.jugador = jugador;
    }


    public void actualizarTablero() {

    }




}
