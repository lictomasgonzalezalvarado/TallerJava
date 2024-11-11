package estructuradedatos.listasligadas;

public class Nodo {
    private String nombre;
    public Nodo enlace;

    public Nodo(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}
