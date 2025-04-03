package JUEGO.src.MODELO;

import java.util.ArrayList;

public abstract class casilla {
    private int posicion;
    private ArrayList<jugador> jugadoresActuales;

    public  casilla(int posicion , ArrayList<jugador> jugadoresActuales) {
       this.posicion = posicion;
       this.jugadoresActuales = jugadoresActuales;

    }
    public int getPosicion() {
        return posicion;
    }
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    public ArrayList<jugador> getJugadoresActuales() {
        return jugadoresActuales;

    }
    public void setJugadoresActuales(ArrayList<jugador> jugadoresActuales) {
        this.jugadoresActuales = jugadoresActuales;
    }
    public void anadirJugador(jugador jugador) {
        this.jugadoresActuales.add(jugador);
    }
    public void eliminarJugador(jugador jugador) {
        this.jugadoresActuales.remove(jugador);
    }

    public abstract  void  realizarAccion(jugador jugador);

}

