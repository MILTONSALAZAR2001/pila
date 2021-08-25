package Pila;

import icse.Nodo;
import icse.ListaCircularSimplementeEnlazada;

public class Pila extends ListaCircularSimplementeEnlazada{

    @Override

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


}