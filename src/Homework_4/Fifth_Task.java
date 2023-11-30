package Homework_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fifth_Task
{
    public static void main (String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      boolean retry = false;
      // Цикъл с който подсигуряваме че потребителя ще въведе правилна стойност
      while(!retry)
      {
          try
          {
              System.out.println("Please enter a to which the counter will work");
              int a = scanner.nextInt();
              int num = 1;
              retry = true;

              //Цикъл който намира всички числа който не се делят на 3 и 7
              while(num <= a)
              {
                if ((num%3)!= 0 && (num % 7) !=0)
                {
                    System.out.printf("%d: This number cannot be divided by 3 and 7 \n",num);
                }
                num++;
              }
          }
          catch (InputMismatchException e)
          {
              System.out.println("This is not a number!");
              scanner.nextLine();
              retry = false;
          }
      }
    }
}
