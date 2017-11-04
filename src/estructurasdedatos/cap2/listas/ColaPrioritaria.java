/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;
import estructurasdedatos.cap2.listas.prioritaria.colasimple;
/**
 *
 * @author tusk
 */
public class ColaPrioritaria {

    private colasimple colaA;
    private colasimple colaB;
    private colasimple prioritaria;

    public void crearcolas() {
        this.colaA = new colasimple();
        this.colaB = new colasimple();
        this.prioritaria = new colasimple();
    }

    public void hacercola(String cedula, int prioridad) {

        if (prioridad == 0) {

            if (colaA.size() < colaB.size()) {

                this.colaA.encolar(cedula);

            } else {

                this.colaB.encolar(cedula);
            }
        } else {

            if (prioridad == 1) {

                this.prioritaria.encolar(cedula);
            }
        }

    }

    public void listar() {

        System.out.println("cola A:");

        colaA.listarr();
        System.out.println("\n");

        System.out.println("cola B");

        colaB.listarr();
        System.out.println("\n");

        System.out.println("cola prioritaria");

        prioritaria.listarr();

    }

    public void atender() {

        for (int i = 0; i <= prioritaria.size(); i++) {

            prioritaria.desencolar();
        }

        if (prioritaria.size() == 0) {

            colaA.desencolar();
            colaB.desencolar();

        }
    }

}
