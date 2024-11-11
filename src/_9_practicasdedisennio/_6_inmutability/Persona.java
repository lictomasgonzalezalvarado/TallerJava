package _9_practicasdedisennio._6_inmutability;

public final class Persona {
    private final String nombre;
    private final int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    //public void  setNombre(String nombre){
        //this.nombre = nombre; //Esto marcará un error ya que el atributo es inmutable
    //}
}