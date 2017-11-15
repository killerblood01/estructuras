/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;

/**
 *
 * @author tusk
 */
public class ArbolB{

     private void Insertar( NodoArbolB nodo, NodoArbolB raiz ) {
        
        if ( raiz == null ) {
            
           
        }
        else {           
            if ( nodo.getValor() <= raiz.getValor() ) {              
                if (raiz.getHijoizquierdo()== null) {
                    raiz.setHijoderecho(nodo);
                }
                else {
                    Insertar( nodo , raiz.getHijoderecho());
                }
            }
            else {              
                if (raiz.getHijoderecho()== null) {
                    raiz.setHijoderecho(nodo);
                }
                else {
                    Insertar( nodo, raiz.getHijoderecho());
                }
            }
        }
    }
    
   

     /*public int AlturaArbol(){
            if(!= null){
                return 0;
            }else{
                int hijoizquierdo=raiz.hijoIzquierdo.AlturaArbol();
                int hijoderecho=raiz.hijoDerecho.AlturaArbol();
                return (1+Math.max(hijoizquierdo, hijoderecho));
            }
        }*/
    


   public void orden(NodoArbolB raiz){
            if(raiz!= null){
                orden(raiz.getHijoizquierdo());
                System.out.print(raiz.getDato() + ",");
                orden(raiz.getHijoizquierdo());
            }
        }
  
  
    public void preorden(NodoArbolB raiz){
            if(raiz!= null){
                System.out.print(raiz.getDato() + ",");
                preorden(raiz.getHijoizquierdo());
                preorden(raiz.getHijoderecho());
            }
        }
       
           
     public void postorden(NodoArbolB raiz){
            if(raiz!= null){
                postorden(raiz.getHijoizquierdo());
                postorden(raiz.getHijoderecho());
                System.out.print(raiz.getDato() + ",");
            }
        }  

       
}
