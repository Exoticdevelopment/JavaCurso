package Loops;

public class For {



    //OPENBOOTCAMP CLASE6 : BUCLE FOR


    /*
    Nos deja repetir un codigo cuantas veces queramos
     */


    public static void main(String[] args) {


        /*Primero crearemos una variable y la mayoria de las veces las iniciaremos en 0 , luego
        colocaremos la condicion de finalizacion del bucle , luego colocamos el incremento


        operadores:
        icremento ++
        decremento --


        ejemplo: si queremos que sume de 2 en 2 ponemos i+=2
        */

        //la variable i es la iteradora
        for (int i= 0 ; i < 10 ; i++) {


            System.out.println("El valor de la variable de i es:"+i);

        }

        String[] nombres = {"pepe", "Juanito" , "Ruperta"}; //Aqui estamos creando un array
                       //.lenght nos devuelve la longitud del array , es decir que en vez de colocar 3 que son los nombres que hay en el array ,
        // ponemos .lenght que nos daria la longityd que son 3 , que son los nombres que hay en el array
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);//El porque debo utilizar System.out.println(nombres[i]) y no System.out.println(nombres); =

            /*
            Este código System.out.println(nombres[i]); te imprime el valor que tiene el elemento i en el array, lo que hace es llamar a la función toString() de forma que es lo mismo que hacer System.out.println(nombres[i].toString);

            En cambio el código System.out.println(nombres); llama a la función toString() de un array (no del tipo de variable), cómo el método no está definido lo que muestra es el tipo de variable y su ubicación en memoria.

            [Ljava.lang.String;@15aeb7ab Significa que tienes un array de tipo String que se encuentra en la ubicación 15aeb7abde la memoria del ordenador.

             */

        }

        int suma= 0;

        int[] numeros = {5,7,8};

        for (int i= 0 ; i <numeros.length ; i++) {
            suma += numeros[i];
            //Tambien podemos colocar suma= suma +numeros[i];
            System.out.println(suma);
        }

        System.out.println("W3SCHOOL  \n");

        //W3SCHOOL

        /*
        When you know exactly how many times you want to loop through(a través de) a block of code , use the for loop instead (en cambio) of a
        while loop:

        syntax:

        for (statement 1 ; statement 2 ; statement 3){
        // code block to be executed
        }

        Statement 1 is executed (one time) before the execution of the code block

        Statement 2 is executed the condition for executing the code block

        Statement 3 is executed (every time) after the code block has been executed

        The example below will print the numbers 0 to 4:

        EXAMPLE:
         */

        System.out.println("W3SCHOOL EXERCISE 1: \n");

        for (int x= 0; x < 5; x++){
            System.out.println(x);
        }


        /*
        Example explained

        Statement 1 sets a variable before the loop starts (int x= 0).

        Statement 2 defines the condition for the loop to run (i must be less than 5) . If the condition is true ,
        the loop will start over again , if it is false , the loop will end.

        Statement 3 increases a value (i++) each time the code block in the loop has been executed.


        Another example:

        This example will only print even values between 0 and 10:
         */

        System.out.println("W3SCHOOL EXERCISE 2: \n");

        for (int e= 0; e<10; e= e+2) {
            System.out.println(e);
        }

        /*
        Nested Loops (Bucles anidados)

        It is also possible to place a loop inside(adentro) another loop. This is called a nested loop.

        The "inner loop" will be executed one time for each iteration of the "outer loop":

        Example:
         */

        //Outer loop

        System.out.println("W3SCHOOL EXERCISE 3: \n");

        for (int a= 1; a <= 2; a++) {
            System.out.println("Outer: " + a); //Executed 2 times

            //Inner loop

            for (int j = 1 ; j <= 3; j++){
                System.out.println("Inner: " +j); //Executed 6 times (2*3)
            }
        }


    }
}
