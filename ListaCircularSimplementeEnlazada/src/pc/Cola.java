package pc;

import icse.ListaCircularSimplementeEnlazada;
import icse.Nodo;

public class Cola extends ListaCircularSimplementeEnlazada {
    @Override


    public void insertarFin(Object dato) {
        if (estavacia()){
            Nodo nuevo = new Nodo();
            nuevo.setDato(dato);
            nuevo.setSiguiente(nuevo);

            inicio = nuevo;
        } else {
            Nodo nuevo = new Nodo();
            nuevo.setDato(dato);
            nuevo.setSiguiente(inicio);

            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != inicio) {
                ultimo = ultimo.getSiguiente();
            }
            ultimo.setSiguiente(nuevo);
        }
    }


}
