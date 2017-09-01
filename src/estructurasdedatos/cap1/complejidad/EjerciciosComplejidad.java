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
public class EjerciciosComplejidad {
    
    public  void peordeloscasosuno() {
    
    Scanner entrada = new Scanner(System.in);
    int n=0;
    
    System.out.println("Menu ejercicio complejida");
    System.out.println("1.para el peor de los casos O(1).");
    System.out.println("2.para el peor de los casos O(n).");
    System.out.println("3.para el peor de los casos O(Log2 n ).");
    System.out.println("4.para el peor de los casos O(nLog2 n)."); 
    
    
    n = entrada.nextInt();
     
      switch(n){
            case 1:
                System.out.println("Dijite un numero para saber si es par o impar"); //O(1)
                Scanner scanner = new Scanner (System.in);       
                int x = scanner.nextInt();       //O(1)                     
                
                if(x%2==0){                   //O (1)
                    System.out.println("El numero es par");
                }
                else{
                    System.out.println("El numero es impar");
                }    
                  break;
                //el peor de los casis es O(1)
                  
             case 2:    
                System.out.println("Dijite un numero para saber si es primo o no");
                Scanner b = new Scanner (System.in);
                int num = b.nextInt();//O(1)
                int num2 = num-1 ;//O(1)
                while((num%num2) != 0){ //O(n)
                num2--;
                }
                if(num2 ==1 ){ // O(1)
                System.out.println("Es Primo");
                }
                else{
                System.out.println("No es Primo");
                } 
                //el peor de los casos es O(n)
                
                break;
              
             case 3:  
          
                  
                  
                }
    
}
    
    
    
}
