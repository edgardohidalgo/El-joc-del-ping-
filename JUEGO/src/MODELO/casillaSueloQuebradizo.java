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
       int numObjectes = jugador.getInventari() .size();

    if (item > 5)

    {
        System.out.println("El jugador " + jugador.getNombre() + " té més de 5 objectes i cau al terra trencadís. Retorna a l'inici.");
        jugador.setPosicion(0);  // Retorna el jugador a la posició inicial.
       } else if (numObjectes > 0) {
           System.out.println("El jugador \" + jugador.getNombre() +")
    }


}
