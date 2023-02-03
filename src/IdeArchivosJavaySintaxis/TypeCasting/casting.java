package IdeArchivosJavaySintaxis.TypeCasting;

public class casting {

    public static void main(String[] args) {

    //Casting is when you assing a value of one primitice data type to another type.


        /* In java , there are two types of casting:

        -Widening Casting (automatically)  Conversión de tipos implícita - converting a smaller type to a larger type size

         byte -> short -> char -> int -> long -> float -> double

         -Narrowing Casting (manually) Conversión de tipos explícita  - converting a larger type to a smaller type size


         double -> float -> long -> int -> char -> short -> byte
        */

        //Example: Widening Casting

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0



        //Example: Narrowing Casting

        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble1);   // Outputs 9.78
        System.out.println(myInt1);      // Outputs 9









    }
}
