package JUEGO.src.MODELO;

import java.util.ArrayList;

public class casillaOso extends casilla {
    public casillaOso(int posicion) {
        super(posicion ,new ArrayList<>());
    }
    @Override
    public void realizarAccion(jugador jugador) {
        System.out.println("El jugador " + jugador.getNombre() + " ha caído en la casilla del oso. ¡Retorna al inicio del juego!");
        jugador.setPosicion(0); // El jugador es enviado a la posición inicial (suponemos que es la posición 0)
    }
}

