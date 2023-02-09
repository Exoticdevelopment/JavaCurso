package ControlStructure;

public class IfElseif {

    public static void main(String[] args) {
        String dia = "Lunes";

        boolean resultado = dia.equals("Lunes"); //Aqui estamos comparando String en JAVA

        //else if en caso de que el if sea false , empieza a evaluar cada elseif hasta que una sea true y sale del bloque

        if (dia.equals("Lunes")) {
            System.out.println("Animo con la semana champions");

        } else if (dia.equals("Martes")) {
            System.out.println("Martes con M de mejor");

        } else if (dia.equals("Miercoles")) {
            System.out.println("Miercoles con M de mejor");

        } else if (dia.equals("Jueves")) {
            System.out.println("Jueves con J de Jugar");

        } else if (dia.equals("Viernes")) {
            System.out.println("Viernes con v de vaca");
        }
        //W3SCHOOL THE ELSE IF STATEMENT

        /*
        Use the else if statement to specify a new condition if the first condition is false

        Syntax:

        if (condition1) {
        // block of code to be executed if condition1 is true
        } else if (condition2) {
        // block of code to be executed if the condition1 is false and condition2 is true
        } else {
        // block of code to be executed if the condition1 is false and condition2 is false
        }

        Example:


         */

        int time = 22;
        if (time < 10){
            System.out.println("Good morning!");

        }
        else if (time<18){
            System.out.println("Good day");

        }else {
            System.out.println("Good evening");
        }

        /*Example explained:
        In the example above , time (22) is greater than 10 , so the first condition is false . The next condition is true
        in the else if statement is also false , so we move on to the else condition since condition1 and condition2 is both false
        and print to the screen "Good evening"

        However , if the time was 14 , our program would print "Good day".

         */
    }
}
