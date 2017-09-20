/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

/**
 *
 * @author tusk
 */
public class NodoDoble {

    private NodoDoble siguiente;
    private NodoDoble anterior;
    private int dato;

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnteriror() {
        return siguiente;
    }

    public void setAnteriror(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void crearnodo() {
        this.siguiente = null;
        this.dato = 0;

    }
}
