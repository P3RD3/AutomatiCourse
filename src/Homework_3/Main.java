package Homework_3;

//Importing the exception handling method and Scanner to get input from console
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    //using the Math.max method, we find which of the 3 numbers is the largest and return the largest number
    private static int compareNumbers (int a, int b, int c) {return Math.max (Math.max(a, b), c);}

    //Basic odd or even calculator, returns a boolean (true when even or false when odd)
    private static boolean oddOrEven(int a){
        return a % 2 == 0;
    }

    //Calculates the area of a rectangle
    private static double rectangleArea (double a, double b) { return a*b; }

    //Calculates the parameter of rectangle
    private static double rectangleParameter (double a, double b) {return 2*(a+b);}

    public static void main (String[] args)
    {

        /* Creating object of class scanner to take input from the console, defining needed integers to process data.
        * booleans are used in the while loops as checkpoints to make the user re-enter input in case they enter invalid input prior */
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0, secondNumber =0, thirdNumber, a, month = 0;
        double length = 0,width;
        boolean retryFirst = false, retrySecond = false, retryThird = false, retryOdd = false, retryMonth = false, retryLength = false, retryWidth = false;

        //While loop for odd numbers function it will run until retryOdd boolean is false(default)
        while (!retryOdd)
        {
            //Try-catch loop, to catch exception in case user enters anything else but an integer
            try
            {
                System.out.println("Please enter a number, to check if it is odd or even");
                a = scanner.nextInt(); // using nextInt option to read only integers, if user enters anything else, exception will occur
                // I excluded  all negative numbers, as the program looks better with positive numbers :)
                if(a<0)
                {
                    System.out.println("Please enter a positive number");
                    retryOdd = false;
                }
                // printing our results based on the entered data
                else if (oddOrEven(a))
                {
                    System.out.printf("Number %d is even\n", a);
                    retryOdd = true; //Setting the resetOdd boolean to true(breaking the while loop)
                }
                else
                {
                    System.out.printf("Number %d is odd\n", a);
                    retryOdd = true;//Setting the resetOdd boolean to true(breaking the while loop)
                }
            }
            /*this catch, catches the wrong input exception, generated when user enters an invalid character of type int
            Prints an error message and resets the loop for the user to enter a new input*/
            catch (InputMismatchException e)
            {
                System.out.println("That is not a number!");
                scanner.next();//this clears the input from the scanner(to my knowledge)
                retryOdd = false;//Force reset the loop by resetting resetOdd to false
            }
        }
        /* While loop for the compareNumbers method, runs until user has entered all 3 numbers correctly.
        * The 3 retries booleans are used to set checkpoints in the loop so the user does not have to enter all values again, in case of an error*/
    while(!(retryFirst && retrySecond && retryThird))
    {
        //try-catch loop, in case the user enters invalid input and
        try
        {
           if (!retryFirst) // first checkpoint
           {
            System.out.println("Please enter 1st number");

            firstNumber = scanner.nextInt();/* if this sees anything but an integer, it will give an exception.
             The catch will catch the exception and set the retryFirst to false, restarting the loop at this point.*/
            retryFirst = true; // first check point cleared
           }
           else if(!retrySecond)
           {
            System.out.println("Please enter 2nd number");
            secondNumber = scanner.nextInt();
            retrySecond = true;
           }
           else if (!retryThird)
           {
               System.out.println("Please enter 3rd number");
               thirdNumber = scanner.nextInt();
               retryThird = true;

               /*Once we have all 3 numbres entered valid, we call our compare function defined above, to tell us which one is the biggest
               * Using basic if statements and the output of the function, we can check which of the number was the biggest and print our results*/
               int largestNumber = compareNumbers(firstNumber,secondNumber,thirdNumber);

               if (largestNumber == firstNumber && largestNumber == secondNumber && largestNumber == thirdNumber)
               {
                   System.out.println("All numbers are even");
               }
               else if (largestNumber == firstNumber)
               {
                   System.out.println("The 1st number is the biggest");
               }
               else if (largestNumber == secondNumber)
               {
                   System.out.println("The 2nd number is the biggest");
               }
               else if (largestNumber == thirdNumber)
               {
                   System.out.println("The 3rd number is the biggest");
               }
           }
           // this catch triggers when the InputMismatch exception is generated from the user's input.
        } catch (InputMismatchException e)
        {
            System.out.println("Please enter a number!");// prints an error message to user
            scanner.next();// clears the input
            if (!retryFirst)
            {
                retryFirst = false;// restart at 1st number checkpoint
            }
            if (!retrySecond)
            {
                retrySecond = false;// restart at 2nd number checkpoint
            }
            if (!retryThird)
            {
                retryThird = false;// restart at 3rd number checkpoint
            }
        }
    }
    /*This while loop is used to utilize month*/
    while (!retryMonth)
    {
        try {
            System.out.println("Please enter the number from 1-12 , to get the month");
            month = scanner.nextInt();
                if (month<0)
                {
                    System.out.println("Number cannot be negative");
                    retryMonth = false;
                }
                else
                {
                switch (month)
                {
                    default:
                        System.out.println("A month with this number does not exist, please enter a number from 1-12");
                        retryMonth = false;
                        break;
                    case 1:
                        System.out.printf("You have selected %d. The month of the year is January.\n", month);
                        retryMonth = true;
                        break;
                    case 2:
                        System.out.printf("You have selected %d. The month of the year is February.\n", month);
                        retryMonth = true;
                        break;
                    case 3:
                        System.out.printf("You have selected %d. The month of the year is March.\n", month);
                        retryMonth = true;
                        break;
                    case 4:
                        System.out.printf("You have selected %d. The month of the year is April.\n", month);
                        retryMonth = true;
                        break;
                    case 5:
                        System.out.printf("You have selected %d. The month of the year is May.\n", month);
                        retryMonth = true;
                        break;
                    case 6:
                        System.out.printf("You have selected %d. The month of the year is June.\n", month);
                        retryMonth = true;
                        break;
                    case 7:
                        System.out.printf("You have selected %d. The month of the year is July.\n", month);
                        retryMonth = true;
                        break;
                    case 8:
                        System.out.printf("You have selected %d. The month of the year is August.\n", month);
                        retryMonth = true;
                        break;
                    case 9:
                        System.out.printf("You have selected %d. The month of the year is September.\n", month);
                        retryMonth = true;
                        break;
                    case 10:
                        System.out.printf("You have selected %d. The month of the year is October.\n", month);
                        retryMonth = true;
                        break;
                    case 11:
                        System.out.printf("You have selected %d. The month of the year is November.\n", month);
                        retryMonth = true;
                        break;
                    case 12:
                        System.out.printf("You have selected %d. The month of the year is December.\n", month);
                        retryMonth = true;
                        break;
                    }
                }
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a number");
            scanner.next();
            retryMonth = false;
        }

    }

    while (!(retryLength && retryWidth))
    {
        try
        {
            if (!retryLength)
            {
            System.out.println("Please enter the length of the rectangle");
            length = scanner.nextDouble();
            retryLength = true;
            }
            else if (!retryWidth)
            {
                System.out.println("Please enter the width of the rectangle");
                width = scanner.nextDouble();
                retryWidth = true;
                if (width==length)
                {
                    System.out.println("The length and width match, so this shape is a square");
                    retryWidth = false;
                    retryLength = false;
                }
                else
                {
                double rectangleArea = rectangleArea(length,width);
                double rectangleParameter = rectangleParameter(length,width);
                System.out.printf("You rectangle has a length of %.2fcm.\n", length);
                System.out.printf("You rectangle has a width of %.2fcm.\n", width);
                System.out.printf("You rectangle has a area of %.2fcm².\n", rectangleArea);
                System.out.printf("You rectangle has a parameter of %.2fcm.\n", rectangleParameter);
                }
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Please enter a number!");
            scanner.next();
            if (!retryLength)
            {
                retryLength = false;
            }
            if (!retryWidth)
            {
                retryWidth = false;
            }
        }
    }
  }
}
