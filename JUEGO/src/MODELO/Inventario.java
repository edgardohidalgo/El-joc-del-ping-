package JUEGO.src.MODELO;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private ArrayList<String> objetos;

    // Constructor
    public Inventario() {
        this.objetos = new ArrayList<>();
    }

    // Getter
    public List<String> getObjetos() {
        return objetos;
    }

    // Métodos
    public void agregarObjeto(String obj) {
        objetos.add(obj);
    }

    public void eliminarObjeto(String obj) {
        objetos.remove(obj);
    }
}
