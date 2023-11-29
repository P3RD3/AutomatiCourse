package Homework_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sixth_Task {
    static int fib (int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
        return b;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0,secondNumber=1,sum=0;
        boolean retryCounter = false;
        while(!retryCounter) {
            try
            {
                System.out.println("Please enter the counter to which you want to view the Fibonacci sequence: ");
                int counter = scanner.nextInt();
                retryCounter = true;
                System.out.printf("The sum of the Fibonacci sequence is: %d", fib(counter));
            }
            catch (InputMismatchException e)
            {
                System.out.println("This is not a number");
                scanner.nextLine();
                retryCounter = false;
            }
        }
    }
}
