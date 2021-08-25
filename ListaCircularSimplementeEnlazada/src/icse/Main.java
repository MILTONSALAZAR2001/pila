package icse;

import pc.Cola;
import Pila.Pila;


public class Main {
    public static void main(String[] args) {

        Pila pila = new Pila();
        System.out.println(pila.estavacia());

        for (int i = 1; i <=5; i++) {
            pila.insertarFin(i);
        }
        pila.mostrarCircular(1);

        pila.eliminarFin();
        pila.eliminarFin();
        pila.mostrarCircular(1);
    }
}
