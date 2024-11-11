package _9_practicasdedisennio._6_inmutability;

public class Main {
    public static void main(String[] args) {
        Persona person =  new Persona("Tomas",45);
        System.out.println("Nombre: " + person.getNombre());
        System.out.println("Edad: " + person.getEdad());

        //person.setNombre("Braulio");
        //System.out.println("Nombre: " + person.getNombre());

    }
}
