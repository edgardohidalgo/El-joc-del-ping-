package JUEGO.src.MODELO;

import java.util.ArrayList;

public class casillaAgujero extends casilla {
    public casillaAgujero(int posicion) {
        super(posicion ,new ArrayList<>());
    }
    @Override
    public void realizarAccion( jugador jugador) {
        jugador.setPosicion(getPosicion() - 1);
    }
}