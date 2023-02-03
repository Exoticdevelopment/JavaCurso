package IdeArchivosJavaySintaxis.Variables;

/*
Para este primer ejercicio tendréis que realizar lo siguiente:

Crea un proyecto de Java desde 0

Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.

Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.

Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String. */
public class ejercicio {
    public static void main(String[] args) {

        byte hola0= 14;
        short hola1= 15;
        int hola2= 100;
        long hola3 = 100000;
        double hola4= 5.44d;
        boolean hola5= false;
        String hola6  = "Miguel";


        System.out.println(hola0 + " "+ hola1 + " " + hola2 + " " + hola3 + " " + hola4 + " " + hola5 + " " + hola6);



        /*Importante para tener en cuenta:
        Para hacer eso tienes que sabes que es concatenación. Simplemente es la unión de 2 cadenas String.
        La ventaja de java es que podemos convertir un número o un tipo de dato numérico de manera muy facil,
         con tan solo poner, por ejemplo, x + "", esta misma se convierte en una cadena. Entonces, sabiendo esto,
          tu puedes poner cualquier valor numérico y concatenarlo con String, que tambien es valido,
          porque Java primero convierte el valor de esa variable a un String en memoria para poder concatenar. Ojo, no modifica el valor de la variable.
         */





    }
}
