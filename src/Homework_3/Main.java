package Homework_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static int compareNumbers (int a, int b, int c)
    {
        return Math.max (Math.max(a, b), c);

    }
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0, secondNumber =0, thirdNumber =0;
        int result;
        boolean retryFirst = false, retrySecond = false, retryThird = false;

    while(!(retryFirst && retrySecond && retryThird)) {
        try {
           if (!retryFirst)
           {
            System.out.println("Please enter 1st number");
            firstNumber = scanner.nextInt();
            retryFirst = true;
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
               int largestNumber = compareNumbers(firstNumber,secondNumber,thirdNumber);
               switch (largestNumber)
               {
                   case 1:
                       System.out.println("The 1st number is the biggest");
                       break;
                   case 2:
                       System.out.println("The 2nd number is the biggest");
                       break;
                   case 3:
                       System.out.println("The 3rd number is the biggest");
                       break;
               }

           }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number!");
            scanner.next();
            if (!retryFirst) {
                retryFirst = false;
            }
            if (!retrySecond) {
                retrySecond = false;
            }
            if (!retryThird) {
                retryThird = false;
            }
        }
    }


    }


    }
