package Funciones;

public class JavaMethodParameters {

      //OPEN BOOTCAMP 4 CLASE: FUNCION CON PARAMETROS:

    //funcion con parametros y sin tipo de retorno

     static void imprimirSaludosBuenosDias(String nombre) {
         System.out.println("Hola como estas? un gusto saludarte"+ " " + nombre);
     }


    //funcion con parametros y con tipo de retorno

    static int multiply (int n1 , int n2){
        int variable;
        return variable= (n1+n2);
    }

    static String saludos (String nombre , String apellidos){

        return "Hola te saluda exotic dev , encontramos en la base de datos que te llamas "+ " "+ nombre + " "  +  "Tu apellido es " + " " +apellidos;

    }

    //W3SCHOOL PARAMETERS AND ARGUMENTS:

    /* Information can be passed to methods as parameters. Parameters act as variables inside the method.
    Parameters are specified after the method name , inside the parentheses. You can add as many parameters as you want , just separated them with a comma.

    The following example has a method that takes a String called fname as parameter. When the method is called , we pass along a first name , which is used inside the
    method to print the full name:

     */
    //Here create the method
    static void myMethod(String fname){
        System.out.println("Su nombre es"+" "+ fname + " su apellido es Martinez"  );
    }

    //MULTIPLE PARAMETERS

    //you can have as many parameters as you want Example

    static void Nameandage(String name , int age){
        System.out.println("Te llamas"+" " +name+" " + "y tienes " + age + " " + "años");
    }

    //RETURNS VALUES:

    /* The void keyword , used in the examples above , indicates that the method should not return a value . If you want the method to return a value ,
    you can use a primitive data type (such as int , char , etc.) instead of void , and use the return keyword inside the method: EXAMPLE:
     */

    //We create the return value method

    static int myMethod2(int x){
        return 5 +x;
    }








    public static void main(String[] args) {


        imprimirSaludosBuenosDias("Miguel");

        multiply(2,5);

        int result = multiply(2,5);

        System.out.println(result);

        System.out.println(saludos("Mariana" , "Garcia"));



        //here i am calling the method
        myMethod("Maria");
        myMethod("Carlos");
        myMethod("Mariana");

        /* When a parameter is passed to the method , it is called an argument . So , from the example above : fname is a parameter, while Maria , Carlos
        y Mariana are arguments
         */

        //here i am practicing about the MULTIPLE PARAMETERS


        Nameandage("Miguel" ,18);
        Nameandage("Mariana" , 19);

        /*Note
         that when you are working with multiple parameters,
         the method call must have the same number of arguments as there are parameters, and the arguments must be passed in the same order.
         */


        //here i am practicing about the //RETURNS VALUES:

        System.out.println(myMethod2(5));


        //You can also store the result in a variable (recommended , as it is easier to read and maintain) example:

        int z = myMethod2(5);

        System.out.println(z);





    }


    }

