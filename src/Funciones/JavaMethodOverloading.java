package Funciones;

public class JavaMethodOverloading {


    public static void main(String[] args) {

        //Example2 W3SCHOOL


        int myNum1 = plusMethodint(8, 5);

        double myNum2 = plusMethoddouble(4.3, 6.26);

        System.out.println("int" + myNum1);
        System.out.println("double" + myNum2);

        //EXAMPLE 3 W3SCHOOL


        /*if we see we are using the same method but with different parameters*/


        int myNum3 = plusMethodint(8,5);
        double myNum4 = plusMethoddouble(4.3, 6.26);

        System.out.println("int" + myNum3);
        System.out.println("double" + myNum4);
    }

    //OPEN BOOTCAMP 5 CLASE: SOBRECARGA DE FUNCIONES:

    /*
    Sobrecarga permite duplicar un metodo siempre y cuando tengan diferentes numero/tipo de parametros
     */

    static int suma(int numero1, int numero2) {

        return numero1 + numero2;

    }

    static int suma(int numero1, int numero2, int numero3) {
        return numero1 + numero2 + numero3;

    }

    static double suma(double numero1, double numero2) { //miren que aqui de deja sobrecargar teniendo diferente tipo de dato que seria double
        return numero1 + numero2;
    }

    //W3SCHOOL METHOD OVERLOADING

    /* With method overloading , multiple methods can have the same name with different parameters: Example

    int myMethod(intx)

    float myMethod(floatx)

    double myMethod(doublex)

    consider the following example , which has two methods that add number of different type:

    Example 2:
    */

    static int plusMethodint(int x, int y) {
        return x + y;
    }

    static double plusMethoddouble(double x, double y) {
        return x + y;
    }
    /* Instead of defining two methods that should do the same thing , it is better to overload one.
    in the example below , we overload the plusMethod method to work for both int and double Example 3 */

    static int plusMethod(int x, int y) {
        return x + y;
    }
    static double plusMethod(double x, double y) {
        return x+y;
    }
}