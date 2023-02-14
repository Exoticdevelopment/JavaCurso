package Ejercicio;

public class EjercicioEstructuradecontrol {

    public static void main(String[] args) {
        /*
        En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
         */


        //Creamos el array de tipo String

        String[] carros = {"Mazda", "Audi", "Hyundai"};



        //Recorremos el array y mostramos su contenido
        for (int i = 0; i < carros.length; i++) {
            System.out.print(carros[i]+" ");
        }

    }

}
