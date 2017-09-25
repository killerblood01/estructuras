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
public class Cola {
    private Nodopersona primero; 
    private Nodopersona ultimo; 
    private Nodopersona actual; 
        
    
    public void crearCola() 
    { 
    this.primero = null; 
    this.ultimo = null; 
    } 
    
    
    public void empezarCola (String nombre, String cedula) 
    { 
        Nodopersona nuevo = new Nodopersona(); 
        nuevo.setNombre(nombre);
        nuevo.setCedula(cedula);
        if(( this.primero==null)&&( this.ultimo== null)) 
        { 
            this.primero = nuevo; 
            this.ultimo = nuevo; 
        } 
        else 
        { 
            ultimo.setSiguiente(nuevo); 
            ultimo = nuevo; 
        } 
    } 
    
    
    public void sacar() 
    { 
        primero = primero.getSiguiente(); 
    } 
    
   
    public void listar() 
    { 
        actual = primero; 
        while( actual!=null) 
        { 
            System.out.println( actual.getNombre()+" "+actual.getCedula()); 
            actual = actual.getSiguiente(); 
        } 
    } 
    
    
}
