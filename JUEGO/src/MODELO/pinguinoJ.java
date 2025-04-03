package JUEGO.src.MODELO;

import javax.swing.*;

public class pinguinoJ extends jugador {
    private Inventario inventario;
    public pinguinoJ(String nombre, int posicion, String color, Inventario inventario) {
        super(nombre, posicion, color);
        this.inventario = inventario;
    }

}
