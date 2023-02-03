package IdeArchivosJavaySintaxis.Variables;

public class JavaVariables {
    public static void main(String[] args) {


        // 1. numericos


        // 1.1 enteros

        byte variable1= 5;
        short variable2= 10;
        int variable3 = 30;
        long variable4 = 100;

        //1.2 decimal
        float variable = 5.75f;
        double variable20 = 5.44d;
        // 2.0 booleano
        boolean verdad = true;
        boolean falso = false;
        //3.0 texto
        char abc = 'c';
        String texto= "Hola";



        //2 Print

        //If i need to combine both text and a variable use  the + chararacter example:

        System.out.println(variable + texto );

        //2.1 Print numerics values
        /* The + character help with mathematical operator example */

        int x= 2;
        int a= 5;

        System.out.println(x+a); // Will print the result of the x +a;

        //3 Java Identifier:

        /* All Java variables must be identified with unique names.

        These unique names are called identifiers.

        Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).

        Note: It is recommended to use descriptive names in order to create understandable and maintainable code:
        */

        //Example:
        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;

        System.out.println(m);



    }

}
