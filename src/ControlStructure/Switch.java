package ControlStructure;

public class Switch {
    public static void main(String[] args) {
        //OPENBOOTCAMP CLASE 5 SWITCH

        String dia = "Lunes";


        switch (dia){//Aqui lo que queremos evaluar

            case "Lunes"://Y los casos
                System.out.println("Es lunes");
                break; //Siempre debemos colocar el break para flojar el flujo de ejecucion
            //porque si no lo ponemos va a entrar en todos los casos

            case "Martes":
                System.out.println("Es martes");
                break;

            case "Miercoles":
                System.out.println("Es miercoles");
                break;


            default: //Este seria un caso por default , es como el ELSE
                System.out.println("Este es un caso por default");

        }


        //W3SCHOOL Java Switch Statements


        /*
        Instead (en cambio o en lugar) of writing many if ... else statements , you can use the switch statement.

        The switch statement select one of many code block to be executed:


        SYNTAX:

        switch(expression) {

         case x:
         // code block
         break;
         case y:
         // code block
         break;
         default:
         // code block
         }

         -This is how it works

         The switch expression is evaluated once (una vez)
         The value of the expression is compared with the value of each case.
         If there is a match , the associated block of code is executed
         The break and default keyword are optional , and will be described later in this chapter

         The example below uses the weekday number to calculate the weekday name:

         */

        int day =4;


        switch (day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

                //OUTPUTS "Thursday" (day 4)
        }

        //THE BREAK KEYWORDS

        /*
        When java reaches (alcanza) a break keyword , it breaks out of the switch block.

        This will stop the execution of more code and case testing inside the block.

        When a match is found , and the job is done , its time for break. There is no need for more testing


        //NOTE: A break can save a lot of execution time because it "ignores"
        the execution of all the rest of the code in the switch block.

        //THE DEFAULT KEYWORDS

        The default keyword specifies some code to run if these is no case match:

        Example:
         */

        int days = 4;
        switch (days) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
       // Outputs "Looking forward to the Weekend"

        //Note that if the default statement is used as the last statement in a switch block,
        // it does not need a break.
        /*
        Tenga en cuenta que si la declaración predeterminada se usa como la última declaración en un bloque de cambio,
        no necesita un descanso.
         */





    }
}
