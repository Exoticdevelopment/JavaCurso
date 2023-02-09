package ControlStructure;

public class If {

    //OPEN BOOTCAMP CLASE 3 IF

    public static void main(String[] args) {
        int edad = 17;

        if (edad >= 18) {//Si edad es mayor o igual que 18 es mayor edad , esta condicion no se cumple entonces evalua el otro if

            System.out.println("Es mayor de edad");

        }
        if (edad <= 17) { // Esto si se cumple entra y imprimite que es menor de edad
            System.out.println("Es menor de edad");
        }


        //W3SCHOOL IF STATEMENT

        /*
        Use the if statement to specify a block of Java code to be executed if a condition is true.

        if (condition){
        //block of code to be executed if a condition is true
        }
         */


        /*
        Note that if is in lowercase letters . Uppercase letters(If or IF) will generate an error
         */



        /*
        In the example below , we test two values to find out if 20 is greater than 18. if the condition is true
        , print some text:

        Example:

         */

        if (20>18){//Example2 of W3SCHOOL
            System.out.println("20 is greater than 18");
        }

        //We can also test variables:

        int x= 20;
        int y = 18;

        if (x>y){
            System.out.println("x is greater than y");
        }
        /*Example explained:
        In the example above we used two variables x and y to test whether(ya sea) x is greater than y (using
        the > operator). As (mientras o como) x is 20 , and y is 18 , and we know that 20 is greater than 18 , we
        print to the screen that "x" is greater than y".
         */







    }
}
