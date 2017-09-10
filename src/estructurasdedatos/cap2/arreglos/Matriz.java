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
public class Matriz {
   


    private int filas;           
    private int columnas;        
    private int[][] matriz;      


    public void crearmatriz(int f, int c) {  
        this.filas = f;                      
        this.columnas = c;                  
        this.matriz = new int[f][c];         
    }


    public void insertar(int f, int c, int dato) {  
        this.filas = f;
        this.columnas = c;
        this.matriz[f][c] = dato;                   
    }


    public void eliminar(int f, int c) {
        this.filas = f;
        this.columnas = c;
        this.matriz[f][c] = 0;
    }


    public void buscardato(int dato) {     

        for (int f = 0; f < matriz.length; f++) {   
            for (int c = 0; c < matriz.length; c++) {  
                if (this.matriz[f][c] == dato) {       
                    System.out.println("el dato se encuenta en la posicion: " + f
                            + "," + c);
                }
            }
        }
    }


    public void listar() {

        for (int x = 0; x < matriz.length; x++) {        
            for (int y = 0; y < matriz[x].length; y++) { 
                System.out.print(matriz[x][y] + " ");   
            }
            System.out.println(" ");
        }
    }
}