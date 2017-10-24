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
        public class NodoArbolB {
        private NodoArbolB hijoderecho;
        private NodoArbolB hijoizquierdo;
        private int dato;

        public void NodoArbol() {
            this.setHijoderecho(null);
            this.setHijoizquierdo(null);
            this.setDato(0);
        }

    /**
     * @return the hijoderecho
     */
    public NodoArbolB getHijoderecho() {
        return hijoderecho;
    }

    /**
     * @param hijoderecho the hijoderecho to set
     */
    public void setHijoderecho(NodoArbolB hijoderecho) {
        this.hijoderecho = hijoderecho;
    }

    /**
     * @return the hijoizquierdo
     */
    public NodoArbolB getHijoizquierdo() {
        return hijoizquierdo;
    }

    /**
     * @param hijoizquierdo the hijoizquierdo to set
     */
    public void setHijoizquierdo(NodoArbolB hijoizquierdo) {
        this.hijoizquierdo = hijoizquierdo;
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }
}

