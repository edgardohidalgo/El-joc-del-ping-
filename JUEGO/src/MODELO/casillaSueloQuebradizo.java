package JUEGO.src.MODELO;

import java.util.ArrayList;

public class casillaSueloQuebradizo extends casilla {
    public casillaSueloQuebradizo(int posicion) {
        super(posicion ,new ArrayList<>());
    }
    @Override
    public void realizarAccion( jugador jugador) {
        jugador.setPosicion(0);
    }
}