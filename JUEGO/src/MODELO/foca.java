package JUEGO.src.MODELO;

public class foca extends jugador {
    private boolean soborno;
    public foca(String nombre, int posicion, String color,boolean soborno){
        super(nombre ,posicion , color);
        this.soborno = soborno;

    }
}
