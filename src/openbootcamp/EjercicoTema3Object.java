package openbootcamp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clau
 */
public class EjercicoTema3Object {

    /**
     * Segunda parte:
     *
     * Crear una clase coche.
     *
     * Dentro de la clase coche, una variable numérica que almacene el número de
     * puertas que tiene.
     *
     * Una función que incremente el número de puertas que tiene el coche.
     *
     * Crear un objeto miCoche en el main y añadirle una puerta.
     *
     * Mostrar el número de puertas que tiene el objeto.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementarNumeroPuertas();
        System.out.println("El coche tiene " + miCoche.numeroDePuertas + " puertas.");
    }
}





class Coche {

    int numeroDePuertas = 2;

    public void incrementarNumeroPuertas() {
        numeroDePuertas++;
    }
}
