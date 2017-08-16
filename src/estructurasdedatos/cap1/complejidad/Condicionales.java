/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;

import java.util.Scanner;

/**
 *
 * @author jhonny
 */
public class Condicionales {
    
    
      public  void ejerciciocondicionales() {
         
         Scanner entrada = new Scanner(System.in);
        
        int respuesta;
              
        System.out.println("Menu ejercicio condicionales");
        System.out.println("1.Que pida dos números y multiplique todos los números que van desde el primero al segundo. Se\n" +
                           "debe controlar que los valores son correctos..");
        System.out.println("2.Que imprima la suma de todos los números impares que van del 1 al 100 y diga cuántos hay.");
        System.out.println("3. Que pida un número y diga si es primo o no.");
         
        
        respuesta = entrada.nextInt();
        
        switch(respuesta){
            case 1:
                int nua,nub,a,sum;
                
                System.out.println("Introduzca el primer numero");
                Scanner n1 = new Scanner(System.in);
                nua = n1.nextInt();
                System.out.println("Introduzca el primer numero");
                Scanner n2 = new Scanner(System.in);
                nub = n2.nextInt();
                 if(nua>nub){
                    
                     System.out.println("los valores no son correctos");
                    
                }
                
                else{
                    sum=1;
                    for(a=nua;a<=nub;a++){
                    
                    sum=sum*a;
                }
                     System.out.println(sum); 
                }
                  
                
                
                
                  break;
                
                  
                  case 2:
                  
                  int x,suma=0,cont=0;
                  
                  for(x=1;x<=100;x++){
                      
                      if(x%2!=0){
                          
                         suma=suma+x;
                         cont=cont+1;
                      }
                      
                  }
                      System.out.println("la cantidad de numeros es");
                      System.out.println(cont);
                      
                     System.out.println("la suma es");
                     System.out.println(suma);
                  break;
                   
                  
                  case 3:
                      
                      
                      Scanner scanner = new Scanner (System.in);
                int num = scanner.nextInt();
                int num2 = num-1 ;
                while((num%num2) != 0){
                num2--;
                }
                if(num2 ==1 ){
                System.out.println("Es Primo");
                }
                else{
                System.out.println("No es Primo");
                } 
                break;
    
    
        }}
}
      
