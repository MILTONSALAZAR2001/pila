package icse;

public class ListaCircularSimplementeEnlazada {
    protected Nodo inicio;

    public ListaCircularSimplementeEnlazada(){
        inicio = null;
    }

    public boolean estavacia() {
        return inicio == null;
    }

    public int tamaño() {
        int contador = 0;

        if (!estavacia()){
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != inicio) {
                ultimo = ultimo.getSiguiente();

                contador++;
            }
            contador++;
        }

        return contador;
    }

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

    public void eliminarFin()
    {
        if(!estavacia())
        {
            Nodo penultimo = inicio;
            while (penultimo.getSiguiente().getSiguiente() != inicio)
            {
                penultimo = penultimo.getSiguiente();
            }
            penultimo.setSiguiente(inicio);
        }
    }

    public void mostrarCircular(int vueltas) {
        if (!estavacia()){
            int contador = 0;

            Nodo temp = inicio;
            while (temp != null && contador < (tamaño() * vueltas)) {
                System.out.print(temp.getDato() +  "  ");

                temp = temp.getSiguiente();

                contador++;
            }
            System.out.println();
        }
    }


}
