package Homework_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sixth_Task {

    // Създаваме метод който изчислява поредицата на Фибуначи
    static int fib (int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        //тук почваме след първите 2 изчисления, тъй като те са само 0 и 1
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
        //Връщаме последното число до което сме стигнали
        return b;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //Обявяваме нужните променливи
        int firstNumber = 0,secondNumber=1,sum=0;
        boolean retryCounter = false;

        //Използваме цикък за да сме сигурни че протебителя ни дава правилни данни
        while(!retryCounter) {
            try
            {
                //Вземаме променливата на брояча
                System.out.println("Please enter the counter to which you want to view the Fibonacci sequence: ");
                int counter = scanner.nextInt();
                retryCounter = true;
                //подаваме я на нашия метод и принтираме резултата
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
