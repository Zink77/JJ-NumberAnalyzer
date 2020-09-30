import java.io.*;
import java.util.*;


public class TheNumberAnalyzer
{
    public static void main(String[] args)
    {
        //ask for 10 numbers
        //set up variables
        int numberToUse;
        int smallest;
        int largest;
        float average = 0;

        //set up the scanner to get input
        System.out.println("Please enter 10 numbers between 1-100, one at a time");
        Scanner numberScanner = new Scanner(System.in);
        numberToUse = numberScanner.nextInt();


        //number validation
        do {
            System.out.println("That is not a number between 1-100");
            numberToUse = numberScanner.nextInt();
        }
        while ((numberToUse <= 0) || numberToUse >= 101);

        //sets variables to the first number instead of zero, in case 0 is not entered
        smallest = numberToUse;
        largest = numberToUse;
        average += numberToUse;

        //make a loop that gets average smallest and largest
        for (int i = 0; i < 9; i++) {
            numberToUse = numberScanner.nextInt();

            while ((numberToUse <= 0) || numberToUse >= 101)
            {
                System.out.println("That is not a number between 1-100");
                numberToUse = numberScanner.nextInt();
            }

            if (numberToUse < smallest) {
                smallest = numberToUse;
            }

            if (numberToUse > largest) {
                largest = numberToUse;
            }

            average += numberToUse;

        }
        // print all number then state largest, smallest, and average
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        System.out.println("Average: " + average/10);
    }
}

