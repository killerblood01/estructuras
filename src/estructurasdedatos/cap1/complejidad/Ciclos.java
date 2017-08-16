/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;
 
import java.util.Scanner;

/**
 *
 * @author tusk
 */
public class Ciclos {
    
    
    
     public  void ejerciciociclos() {
         
         Scanner entrada = new Scanner(System.in);
        
        int respuesta;
              
        System.out.println("Menu ejercicio Ciclos");
        System.out.println("1.Que pida un número y diga si es primo o no.");
        System.out.println("2.Que muestre los números del 1 al 100.");
        System.out.println("3.Que calcule la suma de los cuadrados de los 100 primeros números.");
        System.out.println("4.Que imprima la suma de todos los números pares que van del 1 al 100.");   
        
        respuesta = entrada.nextInt();
        
        switch(respuesta){
            case 1:
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
                        
            case 2:
                
                int x;
                for(x=1;x<=100;x++){
                System.out.println(x);
                }
                break;
                
                
            case 3:
                
               int z,suma=0;
               for(z=1;z<=100;z++){
               
               suma=suma+(z*z);            
                }
               System.out.println("la suma de los numeros es "); 
               System.out.println(suma);
                
                break;
                
                
                
            case 4:    
                int v,sum=0;
                for(v=1;v<=100;v++){
                    
                if(v%2==0){
                    sum=sum+v;
                    
                }   
                    
                }
                
                System.out.println(sum);
                break;
        }
         
         
     }

    
    
}


