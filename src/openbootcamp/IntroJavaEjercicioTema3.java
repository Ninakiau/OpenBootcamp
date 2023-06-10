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
public class IntroJavaEjercicioTema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombres = {"Juan", "María", "Pedro", "Ana"};
        String resultado = concatenarNombres(nombres);
        System.out.println("Resultado final: " + resultado);
    }

    public static String concatenarNombres(String[] nombres) {
        StringBuilder sb = new StringBuilder();
        for (String nombre : nombres) {
            sb.append(nombre).append(" ");
        }
        return sb.toString().trim();
    }
}
