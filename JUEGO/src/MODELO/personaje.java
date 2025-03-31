package JUEGO.src.MODELO;

public class personaje {

    private String nombre;
    private int posicion;
    private String color;
    private Inventario inventario;

    // Constructor
    public personaje(String nombre, int posicion, String color, Inventario inventario) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.color = color;
        this.inventario = inventario;
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

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    // Métodos
    public void moverse(int casillas) {
        this.posicion += casillas;
    }

    public void usarItem(String item) {
        System.out.println("Usando el item: " + item);
    }


}
