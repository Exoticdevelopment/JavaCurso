package ControlStructure;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //OPENBOOTCAMP CLASE 4 IF Y ELSE


        //el if ya sabemos que sirve para hacer una condicion que siempre sera evaluada primera if=(si) , y en caso que el if no se cumpla el siempre va a entrar al else

        //Crearemos una situacion donde le pediremos a una persona datos del banco para un prestamo


        String nombre;

        //Bienvenida

        System.out.println("Bienvenido a Bancoexotic");

        //preguntamos cual es el nombre:

        System.out.println("Digita tu nombre");

        Scanner entrada = new Scanner(System.in);

        nombre = entrada.next();
        //Saludamos
        System.out.println("Hola " + " " + nombre);

        //Preguntamos la edad para saber si le podemos dar un prestamo , si es menor de edad no lo podemos hacer


        int edad;

        System.out.println("Digita tu edad");

        edad = entrada.nextInt();

        System.out.println("Estamos procesando tu prestamo");


        if (edad >= 18) { //Aqui evaluamos si el cliente si tiene mas de 18
            System.out.println("Se te consedio un prestamo , dejanos pensar!");

            System.out.println("El prestamo fue de " + edad * 100 + "Usd \n");
        } else {//Else es de otro modo en español , entonces siempre que if no se cumpla el por default va a correr el else
            System.out.println("Eres menor de edad no te podemos hacer un prestamo \n");
        }

        System.out.println("W3SCHOOL EXAMPLE \n");

        //W3SCHOOL ELSE STATEMENT


        /*
        Use the else statement to specify a block of code to be executed if the condition is false.

        //Syntax:

        if (condition) {
       // block of code to be executed if the condition is true
       } else {
       // block of code to be executed if the condition is false
        }
        EXAMPLE:
        */

        int time = 20;
        if (time < 18){
            System.out.println("Good day!");

        }else {
            System.out.println("Good evening");
        }//outputs "Good evening"

        /*
        Example explained:
        In the example above , time (20) is greater than 18 , so the condition is false. Because of this
        we move on to the else condition and print to the screen " Good evening". If the time was less than 18,
        the program would print "Good day"
         */



    }
}
