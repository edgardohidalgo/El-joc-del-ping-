package JUEGO.src.MODELO;

import java.util.ArrayList;

public class  casillaTrineo extends casilla {
    public casillaTrineo(int posicion) {
        super(posicion ,new ArrayList<>());
    }
    @Override
    public void realizarAccion( jugador jugador) {
        jugador.setPosicion(0);
    }
}