package Loops;

public class JavaBreakandContinue {

    public static void main(String[] args) {


        //W3SCHOOL JAVA BREAK AND CONTINUE


        /*
        You have already seen the break statement used in an earlier chapter of this tutorial.
        It was used to "Jump out" of a switch statement.

        The break statement can also be used to jump out of a loop

        This example stops the loop when i is equal to 4
         EXAMPLE:
         */

        System.out.println("\n EXERCISE 1 \n");

        for (int i = 0; i < 10 ; i++){
            if (i == 4){
                break;
            }
            System.out.println(i);
        }


        //JAVA CONTINUE:

        /*
        The continue statement breaks one iteration (in the loop) , if a specific condition occurs,
        and continues with the next iteration in the loop.

        This example skips the value of 4:
         */
        System.out.println("\n EXERCISE 2 \n");

        for (int j = 0 ; j < 10 ; j++){
            if (j == 4) {
                continue;
            }
            System.out.println(j);
        }

        //Break and Continue in While Loop:

        /*
        You can also use break and Continue in while loops:


         */
        System.out.println("\n EXERCISE 3 \n");

        int k =0;

        while (k < 10) {
            System.out.println(k);
            k++;
            if (k ==4){
                break;
            }
        }

        System.out.println("\n EXERCISE 3 \n");

        int l = 0;
        while (l < 10) {
            if (l == 4) {
                l++;
                continue;
            }
            System.out.println(k);
            k++;

            }



    }
}
