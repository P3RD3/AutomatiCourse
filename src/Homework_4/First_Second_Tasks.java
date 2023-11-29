package Homework_4;
public class First_Second_Tasks {

    public static void arrayInitialization(int[] numbers)
    {
        int sum = 0;
                for (int i = 0; i < numbers.length; i++)
                {
                    numbers[i] = i*5;
                    System.out.printf("Current index %d has value of %d. \n", i, numbers[i]);
                }
                for (int element:numbers)
                {
                    sum += element;
                }
                int average = sum / numbers.length;
                System.out.printf("The sum of the Array is: %d \n",sum);
                System.out.printf("The average of the array is: %d \n", average);
    }
    public static void main(String[] args)
    {
        int[] numbers = new int[20];
        arrayInitialization(numbers);
    }
}
