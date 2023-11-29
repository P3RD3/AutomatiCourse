package Homework_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Third_Forth_task {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean retry = false;
       while(!retry)
       {
           int a;
           try
           {
               System.out.print("Please enter the size of the array: \n");
               a = scanner.nextInt();
               int[] numbers = new int[a];
               for (int i = 0; i < a; i++)
               {
                   System.out.printf("Please enter the value in index: %d \n",i);
                   numbers[i] = scanner.nextInt();
               }
               retry = true;
               sumOddEven(numbers);
           }
           catch (InputMismatchException e)
           {
               System.out.println("This is not a number!");
               retry = false;
           }
       }
    }
    private static void sumOddEven(int[] array)
    {
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < array.length; i++ )
        {
            int element = array[i];
            if (element%2==0)
            {
                System.out.printf("Element %d has value of %d and is even.\n",i ,element);
                sumEven += element;

            }
            else
            {
                sumOdd += element;
                System.out.printf("Element %d has value of %d is odd.\n",i, element);
            }
        }
        System.out.printf("Sum of all even numbers is: %d \n", sumEven);
        System.out.printf("Sum of all odd numbers is: %d \n", sumOdd);
    }

}
