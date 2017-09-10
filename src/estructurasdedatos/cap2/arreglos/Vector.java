/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.arreglos;

/**
 *
 * @author tusk
 */
public class Vector {
    
    private int tam;
    private int[] vector;
    
    



 public void construirvector(int n){
      this.tam = n;
      this.vector = new int[n];
      
 
}
 
public void  settam(int i){
    this.tam = i;
    
}

public int gettam(){
    
    return tam;
}

public void borrar (int t){
    
    if((t<tam)&&(t>0)){
        
        this.vector[t]= 0;
        
        
    }
    
    else{
        
        System.out.println("tamano de arreglo incorrecto");
    }
}
    
 public void insertar (int pos,int t){
     
     this.vector[pos] = t;
     
     
 }       
    
 public void listar(){
     
     for(int t=0;t<tam;t++){
         
          System.out.println(vector[t]);
     }
          
      }
            

public void buscardato(int dato){
    int x=0;
    while( x < tam){
             
           
        System.out.println("el dato esta en la posicion"+x);
        }
    
       x++;
    
}



public void ordenar(){
    
    int aux,r,j;
    
    for(r=0;r<tam;r++){
        for(j=r+1;j<tam;j++){
            if((vector[r] > vector[j])){
                
               aux = vector[r];
               vector[r] = vector[j];
               vector[j] = aux;
               
            }
            
        }
    }
    
}
    
  public void buscarbinario(int t){
      int posini=0;
      int posfinal= vector.length-1;
      int poscentral;
      
      while(posini <= posfinal){
          poscentral=(posfinal+posini)/2;
          if(vector[poscentral]==t){
              System.out.println("el dato esta en las posiciones "+posini+" y "+posfinal);
          }
              else if(t < vector[poscentral]){
                  posfinal=poscentral-1; 
                      
                      }
              else {
                  
                  posini=poscentral+1;
              
          }
   
      }
  }
    
    
 public void update(int t,int dato){
     
     if((t<tam)&&(t>0)){
         
         this.vector[t]=dato;
         
     }
  
  
    
    
    
}





    
    
    
}
 