package Homework_4;

public class ThirdTask {
    public static void main (String[] args)
    {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++)
        {
            numbers[i] = i*5;
        }

        sumOddEven(numbers);

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
