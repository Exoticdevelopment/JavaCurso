package Funciones;

public class JavaMethods {

        //OPENBOOTCAMP 1 CLASE: QUE ES UNA FUNCION:

        /*
        Por ejemplo si queremos crear una pagina de E-commerce y repetir varias veces el menu
        en vez de estar cada rato imprimiendo todo a cada rato creamos una funcion
         */

        /*System.out.println("Bienvenidos al E-commerce de zapatillas");
        System.out.println("1- Ver zapatillas");
        System.out.println("2- Comprar Zapatillas");
        System.out.println("3- Salir");*/


        /* Una funcion es un bloque de codigo que nos ayuda a no repetir codigo */


        //W3 SCHOOLS

        /* A method is a block of code which only runs when it is called.
        You can pass data , known as parameters , into a method
        Methods are used to perform (llevar a cabo) certain (cierta) actions , and they are also know
        as fuctions.

        Why use methods? To reuse code , define the code once , and use it many times.
         */




        //OPEN BOOTCAMP 2 CLASE: COMO SE CREA UNA FUNCION:

       //La funcion debe estar por fuera del metodo main.

        // void es una palabra reservada que indica que no devuelve nada la funcion
        static void showMenu(){

            System.out.println("Bienvenidos al E-commerce de zapatillas");
            System.out.println("1- Ver zapatillas");
            System.out.println("2- Comprar Zapatillas");
            System.out.println("3- Salir");

        }
        //IMPORTANTE , TIPOS DE DATOS MAS COMUNES : Int , long , double , boolean , String
        static String getMenu(){

            return "Bienvenidos al E-commerce de zapatillas \n 1- ver zapatillas.....";

        }

        static int getorden(){
            return 2+2;
        }

        //W3SCHOOL CREATE A METHOD:

    /* A method must be declared within a class.(Un método debe declararse dentro de una clase.). It is defined with the name of the method , followed by parentheses ().
    Java provides(proporciona) some pre-defined methods , such as  (como) System.out.println() , but you can also create your own methods
    to perform certain actions:


    Example:

    Create a method inside Main:

    public class Main {
      static void myMethod() {
      //code to be executed
      }
    }

    Example Explained:

    -myMethod() is the name of the method
    -static means (manera o medio) that the method belongs (pertenece) to the Main class and not an object of the Main class.
    -void means that this method does not have a return value .
     */


    //OPEN BOOTCAMP 3 CLASE: COMO SE INVOCA UNA FUNCION:

    /*
    Debemos invocar la funcion dentro del metodo main
     */

    public static void main(String[] args) {

        //opcion 1: Ya hemos creado el metodo por fuera del METODO MAIN que se llama showMenu

        showMenu(); //Aqui estamos invocando la funcion , SIN PARAMETRO Y SIN TIPO DE RETORNO

        //opcion 2: Funcion con sin parametro y con tipo de retorno

        getMenu(); //Aqui retorna un String , pero no imprime nada porque en el return no estamos haciendo que imprima

        System.out.println(getMenu());// Si queremos ver lo que tiene dentro la funcion getMenu que devuelve un string debo imprimirlo manualmente o crear una variable
        //y dentro de la variable meter el metodo menu , pero igualmente debemos imprimirlo

        String menu = getMenu();

        System.out.println(menu);

        //ejemplo con funcion que retorna int

        System.out.println(getorden());

        //otra manera metiendo la funcion dentro de la variable y debemos imprimir la variable igualmente

        int orden = getorden();

        System.out.println(orden);



        //W3SCHOOL CALL A METHOD:

        /*
        To call a method in Java , write the methods name followed by two parameters () and a semicolon ;

        In the following example , myMethod() is used to print a text (the action) , when it is called:

        Example

        Inside main , call the myMethod() method:

        public class Main {

          static void myMethod() {
           System.out.println("I just got executed");
          }

          public static void myMethod main (String [] args) {
          myMethod();
          }

        }

        //Outputs "I just got executed!"

        -A method can also be called multiple times example:


        public class Main {

          static void myMethod() {
           System.out.println("I just got executed");
          }

          public static void myMethod main (String [] args) {
          myMethod(); //Call a method
          myMethod(); //Call a method
          myMethod(); //Call a method
          }

        }

        //Outputs "I just got executed!"
        "I just got executed!"
        "I just got executed!"

         */










    }





}
