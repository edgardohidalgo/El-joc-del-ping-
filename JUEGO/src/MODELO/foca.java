package JUEGO.src.MODELO;

public class foca  extends jugador {
	private boolean soborno;
	private boolean aplastarJugador;
	private boolean golpearJugador;
	
	public foca(String nombre, int posicion, String color, boolean soborno, boolean aplastarJugador, boolean golpearJugador) {
		super(nombre, posicion, color);
		this.soborno = soborno;
	}
	
	public boolean getsoborno() {
        return soborno;
    }
	public void soborno() {
		this.soborno = soborno;
    }
	
	public boolean getaplastar() {
        return aplastarJugador;
    }
	public void aplastar() {
		this.aplastarJugador = aplastarJugador;
    }
	
	public boolean getgolpear() {
        return golpearJugador;
    }
	public void golpear() {
		this.golpearJugador = golpearJugador;
    }
}
