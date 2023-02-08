package Ejercicio;

import java.util.Scanner;

public class Funcionesejercicio {






   static int  getpreciowithiva (int precio1){
       return (int) (precio1*1.19);
   }

    public static void main(String[] args) {
        /*Para este ejercicio tendreis que crear una funcion que reciba un precio y devuelva el precio con el IVA INCLUIDO*/


        System.out.println("Bienvenido a la tienda Exoticdev");


        System.out.println("Digite el valor del producto");

        int precio1 ;

        Scanner entrada = new Scanner(System.in);

        precio1=entrada.nextInt() ;

        System.out.println("El valor que ingresaste fue" +" " +precio1);


        int total =getpreciowithiva(precio1);

        System.out.println("El precio con iva incluido es de"+" "+ total);


    }
}
