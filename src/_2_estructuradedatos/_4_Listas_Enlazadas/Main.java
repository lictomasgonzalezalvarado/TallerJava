package estructuradedatos.listasligadas;

public class Main {
    public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada();

        listaLigada.AgregarNodo("Javier");
        listaLigada.AgregarNodo("Cecilia");
        listaLigada.AgregarNodo("Francisco");
        listaLigada.AgregarNodo("Laura");
        listaLigada.AgregarNodo("Pedro");
        listaLigada.AgregarNodo("Gabriela");
        listaLigada.AgregarNodo("Yair");
        listaLigada.AgregarNodo("Veronica");
        listaLigada.AgregarNodo("Hilario");

        listaLigada.EliminarNodo("Gabriela");
        listaLigada.IncorporarNodo("Baltazar", "Yair");
        listaLigada.ReemplazarNodo("Veronica","Hermenegildo");

        listaLigada.Imprimir();
    }
}
