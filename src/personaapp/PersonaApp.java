/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaapp;

/**
 *
 * @author clau
 */
public class PersonaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear un objeto de la clase Cliente
        Cliente cliente = new Cliente(30, "Juan", "123456789", 5000.0);
        System.out.println("Cliente:");
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());

        System.out.println();

        // Crear un objeto de la clase Trabajador
        Trabajador trabajador = new Trabajador(35, "María", "987654321", 3000.0);
        System.out.println("Trabajador:");
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}

