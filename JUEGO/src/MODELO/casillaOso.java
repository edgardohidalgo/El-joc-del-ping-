package JUEGO.src.MODELO;

import java.util.ArrayList;

public class casillaOso extends casilla {
    public casillaOso(int posicion) {
        super(posicion ,new ArrayList<>());
    }
@Override
public void realizarAccion( jugador jugador) {
        jugador.setPosicion(0);
}
}
