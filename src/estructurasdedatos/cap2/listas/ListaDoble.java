/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

import estructurasdedatos.utiles.nodos.NodoDoble;

/**
 *
 * @author tusk
 */
public class ListaDoble {
    private NodoDoble cabeza;
    private NodoDoble cola;
    private NodoDoble actual;
    
    
    public void crearlistadoble() {        
                                         
        this.cabeza = null;
        this.cola   = null;
    }
    
    
    public void insertar(int dato) {          
        NodoDoble Nodo = new NodoDoble();
        Nodo.crearnodo();
        Nodo.setDato(dato);

        if (this.cabeza == null && this.cola == null) {     
            this.cabeza = Nodo;
            this.cola   = Nodo;
            
        } else {                                             
            cola.setSiguiente(Nodo);                        
            this.cola = Nodo;
        }
    }
    
    
    
    public void listar() {                                  
     
        if (!(this.cabeza == null && this.cola == null)) {                
            NodoDoble aux = cabeza;                                      
            int i = 0;                                                    

            while (aux != null) {
                System.out.println("El dato:" + "(" + aux.getDato()+ ")" + " " + "se encuentra en la posicion" + i );
                aux = aux.getSiguiente();
                i++;
            }
        }
    }
    

    
    
    public void eliminar(int dato) {                                       
                
        if (cabeza.getDato()== dato) {                                    
            cabeza = cabeza.getSiguiente();                                

        } else {                                                           
            NodoDoble aux = cabeza; 
            while (aux.getSiguiente().getDato()!= dato) {                  
                aux = aux.getSiguiente();

            }
            NodoDoble siguiente = aux.getSiguiente().getSiguiente();      
            aux.setSiguiente(siguiente);                                   

        }
    
}
}