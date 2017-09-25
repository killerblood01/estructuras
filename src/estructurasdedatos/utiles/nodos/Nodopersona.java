/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

/**
 *
 * @author jhony
 */
public class Nodopersona {

    private String nombre;
    public String cedula;
    private Nodopersona siguiente;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public Nodopersona getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodopersona siguiente) {
        this.siguiente = siguiente;
    }

}
