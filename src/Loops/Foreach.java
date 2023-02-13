package Loops;

public class Foreach {

    public static void main(String[] args) {

        //OPENBOOTCAMP CLASE7 : BUCLE FOREACH

        /*
         se usa exclusivamente para recorrer elementos en una matriz (array)
         */



        String[] nombres = {"pepe", "Juanito" , "Ruperta"}; //Aqui estamos creando un array

        for(String nombre : nombres) {

            System.out.println(nombre);

        }


        System.out.println("\n EJERCICIO 2: ARRAY INT \n");

        int suma = 0;

        int [] numeros = { 5, 10 ,15};

        for (int numero : numeros){
            suma += numero;

        }

        System.out.println(suma);



        //W3SCHOOL FOREACHLOOP:


        /*
        There is also a "for-each" loop, which is used exclusively to loop through elements in an array:

        Syntax:

        for(type variableName: arrayName){
        //code block to be executed
        }

        The following example outputs all elements in the cars array , using a "for-each" loop:

        Example:
         */


        System.out.println("W3SCHOOL EXERCISE 1: \n");


        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }











    }
}
