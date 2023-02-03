package Funciones;

public class JavaOperators {
    public static void main(String[] args) {

        //Operators are used to perform operations on variables and value (perform: llevar a cabo)
          /* In the example below , we use the + operator to add together two values: (together = Junto)    */

        int x = 100 + 50;

        /*Altough (apesar de) the + operator is often used to add together two values , like in the example above , it can also be used to add together a variable and a value , or a variable
        and another variable: Example */

        int sum1 = 100+50;
        int sum2 = sum1 +250;
        int sum3 = sum2 + sum2;


        System.out.println(sum1+" " + sum2 +" "+sum3);


        /*Java divides the operators into the following groups:
        -Arithmetic operators
        -Assigment operators
        -Compararison operators
        -Logical operators
        -Bitwise operators

        */


        //Arithemetic operators:
        /*
        + Addition , adds together two values
        - Subtraction , Subtracts one value from another
        * Multiplication , Multiplies two values.
        / Division , Divides one value by another.
        % Modulus , Returns the division remainder
        ++ Increment , Increases the value of a variable by 1
        -- Decrement , Decreases the value of a variable by 1
        */


        //Java assignment Operators:

        /* Assignment operators are used to assign values to variables.

        In the example below , we use the assignment operators (=) to assing the value 10 to a variable called x:

      */

        int x1= 10;

        //The addition assignment operator (+=) adds a value to a variable:


        int x2 = 10;

        x2 += 5;

        System.out.println(x2);


        /* A list of all assignment operators:

        Operator  Example  Same as
          =       x=5       x=5
          +=      x+=3      x=x+3
          -=      x-=3      x=x-3
          *=      x*=3      x=x*3
          /=      x/=3      x=x/3
          %=      X%=3      x=x %3

         */

        //JAVA COMPARISION OPERATORS

        /* Comparison operators are used to compare two values (or variables). This is import in programming , because it helps us to find answers and make decisions.

                                            o bien
        The return value of a comparison is either true or false. These values are known as Boolean values.


        In the following example , we use the greater than operator (>) to find out if 5 is greater than 3:

         */


        int e = 5;
        int f= 3;
        System.out.println(e>f); //returns true , because 5 is higher than 3



        //== Equal to
        System.out.println(e == f);

        //!= Not Equal

        System.out.println(e != f);


        //> Greater than

        System.out.println(e>f);


        //< Less than

        System.out.println(e<f);


        //>= Greater than or equal to

        System.out.println(e>=f);

        //<= Less than or equal to

        System.out.println(e<=f);






    }
}
