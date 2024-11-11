package estructuradedatos.listasligadas;

public class ListaLigada {
    private Nodo nodoPrincipal;

    public ListaLigada() {

        this.nodoPrincipal=null;
    }


    public void AgregarNodo(String nombre) {

        this.nodoPrincipal=AgregarNodo(this.nodoPrincipal,nombre);
    }


    private Nodo AgregarNodo(Nodo nodoPrincipal, String nombre){
        if (nodoPrincipal==null){
            System.out.println("Se agrega el nodo "+nombre+"\n");
            return  new Nodo(nombre);
        }
        else {
            System.out.println("** Pasando por el nodo " + nodoPrincipal.getNombre() + " antes de agregar el nodo "+nombre);
            nodoPrincipal.enlace=AgregarNodo(nodoPrincipal.enlace,nombre);
            return nodoPrincipal;
        }
    }


    public void EliminarNodo(String nombre) {
        if (nodoPrincipal != null)
            this.nodoPrincipal = EliminarNodo(this.nodoPrincipal, nombre);
        else
            System.out.println("Error, no se puede eliminar a " + nombre + ", ya que la lista ligada está vacía");
    }


    private Nodo EliminarNodo(Nodo nodoPrincipal, String nombre) {
       if (nodoPrincipal!=null) {
           if (nodoPrincipal.getNombre().equals(nombre)) {
               System.out.println("Eliminando el nodo " + nodoPrincipal.getNombre());
               return nodoPrincipal.enlace; // Se omite el nodo actual y se enlaza al siguiente
           }
           else
               nodoPrincipal.enlace = EliminarNodo(nodoPrincipal.enlace, nombre);
       }
       else
           System.out.println("No se puede eliminar el nodo " + nombre + ", ya que no existe");

       return  nodoPrincipal;
    }


    public void IncorporarNodo(String nombre, String despuesDe) {
        if (nodoPrincipal != null)
            this.nodoPrincipal = IncorporarNodo(this.nodoPrincipal, nombre, despuesDe);
        else
            System.out.println("Error, no se puede incorporar a " + nombre + ", ya que la lista ligada está vacía");
    }


    private Nodo IncorporarNodo(Nodo nodoPrincipal, String nombre, String despuesDe) {
        if (nodoPrincipal!=null) {
            if (nodoPrincipal.getNombre().equals(despuesDe)) {
                System.out.println("Incorporando el nodo " + nombre + " después del nodo " + despuesDe);
                Nodo nuevoNodo=new Nodo(nombre); //Se crea el nuevo nodo
                nuevoNodo.enlace=nodoPrincipal.enlace; //al enlace del nuevo nodo le asignamos el enlace del nodo encontrado
                nodoPrincipal.enlace=nuevoNodo; //Finalmente al nodo encontrado se le asigna el nuevo nodo
            }
            else
                nodoPrincipal.enlace = IncorporarNodo(nodoPrincipal.enlace, nombre, despuesDe);
        }
        else
            System.out.println("No se puede incorporar el nodo " + nombre + ", ya que no existe el nodo " +  despuesDe);

        return  nodoPrincipal;
    }

    public void ReemplazarNodo(String nombre, String reemplazo) {
        if (this.nodoPrincipal != null)
            this.nodoPrincipal = ReemplazarNodo(this.nodoPrincipal,nombre,reemplazo);
        else
            System.out.println("Error, no puede haber reemplazo porque la lista ligada está vacía");
    }

    public Nodo ReemplazarNodo(Nodo nodoPrincipal, String nombre, String reemplazo) {
        if (nodoPrincipal!=null) {
            if (nodoPrincipal.getNombre().equals(nombre)) {
                System.out.println("Reemplazando el nodo " + nodoPrincipal.getNombre() + " por el nodo " +reemplazo);
                Nodo nuevoNodo=new Nodo(reemplazo);
                nuevoNodo.enlace=nodoPrincipal.enlace;
                nodoPrincipal=nuevoNodo;
            }
            else
                nodoPrincipal.enlace=ReemplazarNodo(nodoPrincipal.enlace,nombre,reemplazo);
        }
        else
            System.out.println("No se puede reemplazar el nodo " + nombre + " ya que éste no existe");
        return  nodoPrincipal;
    }

    public void Imprimir()
    {
        if (nodoPrincipal != null)
            Imprimir(this.nodoPrincipal);
        else
            System.out.println("Error, no se puede imprimir la lista ligada ya que está vacía");
    }


    private void Imprimir(Nodo nodoPrincipal){
        if (nodoPrincipal != null){
            System.out.print(nodoPrincipal.getNombre()+" >> ");
            Imprimir(nodoPrincipal.enlace);
        }
    }
}
