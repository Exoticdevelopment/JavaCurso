package Loops;

public class While {

    public static void main(String[] args) {


        //OPENBOOTCAMP CLASE8 : BUCLE WHILE


        /*
        La diferencia entre el for y el while es que el bucle for es determinado mientras que el bucle while
        es un bucle indeterminado
         */

        //La mayoria de veces evaluamos condiciones


        int contador = 0;


        while (contador < 10) {
            contador++;
            ; //Aqui hacemos que el bucle no sea infinito , porque es un incremento , si no ponemos esto el bucle seria infinito

            //Si queremos romper un bucle lo hacemos de la siguiente manera!

            if (contador == 5) { /*Como pusimos este if estamos rompiendo el codigo , pero si no hubiesemos puesto este if con el break se imprimiria hola mundo 10 veces*/
                continue; /*continue; es otro metodo como el break solo que no rompe el bucle solo salta esa iteracion*/


            }

            if (contador == 7) {
                System.out.println("Adios");
                break; //Asi interumpimos o salimos de un bucle
            }


            System.out.println("Hola mundo" + contador);

            /* El break and continue sirven tanto para while como para for

             */


        }

        System.out.println("Sali del bucle yessss");


        //W3SCHOOL


        /*
        The while loop loops through a block of code as long as a specified condition
        is true:

        Syntax

        while (condition){
        //Code block to be
        }

        in the example below , the code in the loop will run , over and over again , as long as
        a variable (i) is less than 5:

        EXAMPLE
         */
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

    }
}
