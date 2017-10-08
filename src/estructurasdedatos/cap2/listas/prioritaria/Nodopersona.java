/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas.prioritaria;
import estructurasdedatos.cap2.listas.prioritaria.Nodopersona;
/**
 *
 * @author jhony
 */
public class Nodopersona {
    private persona dato;
    private Nodopersona siguiente;
    
    
    public void crearnodo(){
    siguiente=null;
    dato=null;
}

    /**
     * @return the dato
     */
    public persona getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int cedula) {
        persona p =new persona (cedula);
        this.dato = p;
    }

    /**
     * @return the siguiente
     */
    public Nodopersona getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodopersona siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
