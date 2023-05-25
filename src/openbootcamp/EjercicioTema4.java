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
public class EjercicioTema4 {

    /**
     * @param args the command line arguments
     */
    /*En este ejercicio practicarás las estructuras de control, para ello deberás crear:

Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

Incrementar el valor de la variable en uno cada vez que se ejecute.

Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.*/
    public static void main(String[] args) {
        // Ejericicio If
        int numeroIf = -7;
        if (numeroIf > 0) {
            System.out.println("El numeroIf es positivo");

        } else if (numeroIf < 0) {
            System.out.println("El numeroIf es negativo");
        } else if (numeroIf == 0) {
            System.out.println("El numeroIf es 0");
        }
        {

        }
        //Ejericio While
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("NumeroWhile: " + numeroWhile);
        }

        //Ejercicio Do While
        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println("NumeroDoWhile: " + numeroDoWhile);
        } while (numeroDoWhile > 3);

        //Ejercicio For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("NumeroFor es : " + numeroFor);
        }
        //Ejercicio Switch
        String estacion = "verano";
        switch (estacion) {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("El valor ingresado no es una estación");
                break;
        }

    }
}
