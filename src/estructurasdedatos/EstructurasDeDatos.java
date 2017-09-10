/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;
import estructurasdedatos.cap1.complejidad.Ciclos;
import estructurasdedatos.cap1.complejidad.Condicionales;
import estructurasdedatos.cap1.complejidad.EjerciciosComplejidad;
import estructurasdedatos.cap2.arreglos.Vector;
import java.util.Scanner;

/**
 *
 * @author tusk
 */
public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String tecla = null;
        /*Ciclos ejerciciosciclos = new Ciclos();
        
         ejerciciosciclos.ejerciciociclos();
        
         Condicionales ejercicioscondicionales = new Condicionales();
         
         ejercicioscondicionales.ejerciciocondicionales();
         */
        
        /*EjerciciosComplejidad peordeloscasosuno = new EjerciciosComplejidad() ;
        
         peordeloscasosuno.peordeloscasosuno();*/
          
        Scanner entrada = new Scanner(System.in);
        
        do{
        int respuesta;
        
        System.out.println("Menu vector");
        System.out.println("1.para construir el vector.");
        System.out.println("2.para insertar");
        System.out.println("3.para listar.");         
        System.out.println("4.para buscar.");
        System.out.println("5.para ordenar.");
        System.out.println("6.para busqueda binaria.");
        System.out.println("7.para cambair dato.");
        System.out.println("8.para borrar dato."); 
        System.out.println("9.para salir.");   
        respuesta = entrada.nextInt();
        
        switch(respuesta){
            case 1:
                
        Vector construirvector  = new Vector();
        construirvector.construirvector(3);
        
        break;
        
            case 2:
         Vector insertar = new Vector();
         insertar.insertar(1,2);
         insertar.insertar(2,5);
         insertar.insertar(3,9);
         break;
         
         
            case 3:
                
        Vector listar  = new Vector();
        listar.listar();
                
         break;
         
            case 4:
                
        Vector  buscardato = new Vector();
        buscardato.buscardato(respuesta);
        
        break;
        
            case 5:
                
         Vector ordenar = new Vector();
         ordenar.ordenar();
         
         break;
         
            case 6:
         
        Vector buscarbinario = new Vector();
        buscarbinario.buscarbinario(respuesta);
        
        break;
           
                
            case 7:
                
         Vector update = new Vector();
         update.update(respuesta, respuesta);
         
        break;
        
            case 8:
                
        Vector borrar = new Vector();
        borrar.borrar(respuesta);
        
        break;   
        }
        System.out.print("\n¿Quiere seguir?\n");
        tecla = new Scanner(System.in).nextLine();
        }while (tecla.equals("s") || tecla.equals("S"));
         
        
        }
             
    }



   
    

