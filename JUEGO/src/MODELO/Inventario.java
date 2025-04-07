package JUEGO.src.MODELO;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private ArrayList<item> lista;

    // Constructor
    public Inventario ( ArrayList<item> lista){
        this.lista = lista;
    }

    public ArrayList<item> getLista() {
        return lista;
    }

    public void setLista(ArrayList<item> lista) {
        this.lista = lista;
    }
}
