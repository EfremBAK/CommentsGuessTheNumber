
   /*
   *program about comment
   *Efrem B. Abrehe
   *22nd October, 2019
    */

   import java.util.Random;
   import java.util.Scanner;

   public class comments {

    public static void main(String[] args){

       long from, to;


            Scanner scan = new Scanner(System.in);

            //this will gve out a random value 1 - 100 long
            Random random = new Random();
        from = 1;
       to = 100;

       int randomNumber = random.nextInt((int)(to - from + 1)) + (int)from;

            // notice the data types of the variables declared so far
            // (int) is an explicit cast that will convert a 'long' data type to an 'int' data type

            //will guess the value
            int guessedNumber = 0;

            //output
            System.out.printf("The number is between %d and %d.\n", from, to);

            // here is a loop
            do
            {
                System.out.print("Guess what the number is: ");
                guessedNumber = scan.nextInt();
                if (guessedNumber > randomNumber)
                    System.out.println("Your guess is too high!");
                else if (guessedNumber < randomNumber)
                    System.out.println("Your guess is too low!");
                else
                    System.out.println("You got it!");
            }
            while (guessedNumber != randomNumber);
        }
    }

