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
public class EjercicioTema2IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio = 100.0;
        double precioConIVA = calcularPrecioConIVA(precio);
        System.out.println("Precio con IVA: " + precioConIVA);
    }

    public static double calcularPrecioConIVA(double precio) {
        double iva = 0.21; // Porcentaje del IVA (21% en este caso)
        double precioConIVA = precio * (1 + iva);
        return precioConIVA;
    }
}