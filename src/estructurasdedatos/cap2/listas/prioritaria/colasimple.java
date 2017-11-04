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
public class colasimple {
    private Nodopersona dato;
    private Nodopersona tope;
    private Nodopersona ultimo;

    
    public void crearcola() {
        tope = ultimo = null;
    }

    public boolean vacia() {
        return (this.tope == null);
    }

    public void encolar(String cedula) {
   
        Nodopersona nuevo = new Nodopersona();
       
        nuevo.setCedula(cedula);
    
        if (vacia()) {
          
            this.tope = nuevo;
            this.ultimo = nuevo;
          
        } else {
         
            ultimo.setSiguiente(nuevo);
          
            ultimo = nuevo;
        }

    }

    
    public void desencolar() {
       
        if (vacia()) {
           
            System.out.println("Cola vacia");
        } else {
           
            tope = tope.getSiguiente();

        }
    }

   
    public void listarr() {
     
        Nodopersona aux = tope;

        System.out.println("");
        int i = 0;
        
        while (aux != null) {
          
           /* System.out.println(i + "." + " [ " + aux.getDato().getCedula() + " ]");*/

            aux = aux.getSiguiente();
            i++;
        }

    }

   
    public int size() {
   
        Nodopersona aux = tope;

        int contador = 0;
      
        while (aux != null) {
           
            contador++;
            aux = aux.getSiguiente();

        }
       
        return contador;

    }

    
    public Nodopersona getDato() {
        return dato;
    }

    
    public void setDato(int cedula) {
        Nodopersona p = new Nodopersona();
        p = dato;
    }

    
}
