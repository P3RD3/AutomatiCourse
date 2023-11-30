package Homework_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    private static boolean isPasswordValid(String password)
    {
        int minLength = 8;
        boolean hasLetter = false;
        boolean hasNumber = false;
        boolean hasSymbol = false;

        if(password.length() < minLength){
            System.out.println("Password must be at least " + minLength);
            return false;
        }

        for(char ch:password.toCharArray())
        {
            if (Character.isLetter(ch))
            {
                 hasLetter = true;
            } else if (Character.isDigit(ch))
            {
                 hasNumber = true;
            } else if (!Character.isLetterOrDigit(ch))
            {
                 hasSymbol = true;
            }
        }

        if (!hasLetter)
        {
            System.out.println("Password must contain at least 1 letter!");
            return false;
        }
        else if (!hasNumber)
        {
            System.out.println("Password must contain at least 1 number!");
            return false;
        }
        else if (!hasSymbol)
        {
            System.out.println("Password must contain at least 1 symbol!");
            return false;
        }
        else
        {
            return true;
        }
    }

    private static boolean areNumbersPositive (int a,int b,int c)
    {
        boolean aPositive = false;
        boolean bPositive = false;
        boolean cPositive = false;
        if (a > 0){
            aPositive = true;
        }
        if (b > 0) {
            bPositive = true;

        }
        if (c > 0) {
            cPositive = true;
        }

        if (!(aPositive && bPositive && cPositive)) {
            if (!aPositive) {
                System.out.println("1st number isn't positive.");
            }
            if (!bPositive) {
                System.out.println("2nd number isn't positive.");
            }
            if (!cPositive) {
                System.out.println("3rd number isn't positive.");
            }
            return false;
        }
            else {
                System.out.println("All numbers are positive!");
                return true;
            }

    }

    private static boolean areNumbersEqual(int a, int b, int c){
        if (a == b && b == c){
            System.out.println("All numbers are equal!");
                    return true;
        } else {
            System.out.println("Numbers are not equal!");
            return false;
        }
    }

    public static int sumOfNumbers(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }

    public static void averageOfNumbers(int a, int b, int c){
       int sum = sumOfNumbers(a,b,c);
       System.out.println("Average of numbers is:"+sum/3);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            if (isPasswordValid(password))
            {
                System.out.println("Password is valid!");
                break;
            } else {
                System.out.println("Password is invalid!\nPlease note that a valid password contains at least 8 characters, 1 letter, 1 number, 1 symbol.");
            }
        }

        int firstNumber = 0, secondNumber = 0, thirdNumber;
        boolean retryFirstNumber = false, retrySecondNumber =false, retryThirdNumber=false;
        System.out.println("Please enter 3 numbers and I will tell you if they are positive");

        while (!(retryFirstNumber && retrySecondNumber && retryThirdNumber)) {
            try {
                if(!retryFirstNumber) {
                    System.out.print("Please enter 1st number: ");
                    firstNumber = scanner.nextInt();
                    retryFirstNumber = true;
                } else if (!retrySecondNumber) {
                    System.out.print("Please enter 2nd number: ");
                    secondNumber = scanner.nextInt();
                    retrySecondNumber = true;
                } else if (!retryThirdNumber) {
                    System.out.print("Please enter 3rd number: ");
                    thirdNumber = scanner.nextInt();
                    retryThirdNumber = true;

                    areNumbersPositive(firstNumber, secondNumber, thirdNumber);
                    areNumbersEqual(firstNumber, secondNumber, thirdNumber);
                    System.out.println("Sum of numbers is:" + sumOfNumbers(firstNumber,secondNumber,thirdNumber));
                    averageOfNumbers(firstNumber,secondNumber,thirdNumber);
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter a number!");
                scanner.next();
                if(!retryFirstNumber){
                    retryFirstNumber = false;
                }
                if (!retrySecondNumber){
                    retrySecondNumber = false;
                }
                if (!retryThirdNumber) {
                    retryThirdNumber = false;
                }
            }
        }
    }
}
