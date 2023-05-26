/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openbootcamp;

/**
 *
 * @author clau
 */
public class EjerciciosTema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementarNumeroPuertas();
        System.out.println("El coche tiene " + miCoche.numeroDePuertas + " puertas.");
        
// Ejercicio de suma
        int num1=4;
        int num2=5;
        int num3=6;
        System.out.println("La suma es: "+FuncionSuma( num1, num2, num3));
    }
    public static int FuncionSuma(int n1, int n2, int n3) {
        return n1+n2+n3;
    }
}
class Coche {

    int numeroDePuertas = 2;

    public void incrementarNumeroPuertas() {
        numeroDePuertas++;
    }
}
