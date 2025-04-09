package JUEGO.src.MODELO;

import java.util.List;

public class casillaTrineo extends casilla {
    private List<Integer> posicionsTrineu; 

    public casillaTrineo(int posicion, List<Integer> posicionsTrineu) {
        super(posicion, null);
        this.posicionsTrineu = posicionsTrineu;
    }

    @Override
    public void realizarAccion(jugador jugador) {
        int novaPosicio = getSeguentTrineu(jugador.getPosicion());
        if (novaPosicio != jugador.getPosicion()) {
            System.out.println(jugador.getNombre() + " ha cogido un trineo y ha avanzado hasta la casilla " + novaPosicio);
            jugador.setPosicion(novaPosicio);
        } else {
            System.out.println(jugador.getNombre() + " esta en el ultimo  trineo y no puede avanzar más!");
        }
    }

    
    private int getSeguentTrineu(int posicioActual) {
        for (int posicio : posicionsTrineu) {
            if (posicio > posicioActual) {
                return posicio;
            }
        }
        return posicioActual;
    
    }
}
