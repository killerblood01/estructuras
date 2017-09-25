/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

import estructurasdedatos.utiles.nodos.Nodopersona;

/**
 *
 * @author tusk
 */
public class Pila {

    Nodopersona tope;

    public Pila() {
        this.tope = null;
    }

    public void apilar(String nombre, String cedula) {
        Nodopersona nuevo = new Nodopersona();
        nuevo.setNombre(nombre);
        nuevo.setCedula(cedula);
        if (tope == null) {
            tope = nuevo;
            tope.setSiguiente(null);
        } else {
            nuevo.setSiguiente(tope);
            tope = nuevo;
        }

    }

    public void listar() {
        Nodopersona auxiliar = new Nodopersona();
        auxiliar = tope;

        while (auxiliar != null) {
            System.out.println(auxiliar.getNombre() + " " + auxiliar.getCedula());
            auxiliar = auxiliar.getSiguiente();
        }
    }

    public void sacar() {
        tope = tope.getSiguiente();
    }

}
