package JUEGO.src.MODELO;

public class item {
    private String nombre;
    private String descripcion;
    private int poder;

    // Constructor
    public item(String nombre, String descripcion, int poder) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.poder = poder;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPoder() {
        return poder;
    }

    // Método usar
    public void usar() {
        System.out.println("Usando el objeto: " + nombre);
    }

    // objetos que tienen
    List
}