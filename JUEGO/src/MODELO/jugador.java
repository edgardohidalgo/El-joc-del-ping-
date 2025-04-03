package JUEGO.src.MODELO;

public abstract class jugador {

    private String nombre;
    private int posicion;
    private String color;

    /**
     *
     * @param nombre
     * @param posicion
     * @param color
     *
     */
    public jugador(String nombre, int posicion, String color) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.color = color;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void moverse(int casillas) {
        this.posicion += casillas;
    }

    public void usarItem(String item) {
        System.out.println("Usando el item: " + item);
    }



}
