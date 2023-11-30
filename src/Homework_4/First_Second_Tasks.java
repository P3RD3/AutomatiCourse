package Homework_4;
public class First_Second_Tasks {

    //Метод който напълва масив с числа
    public static void arrayInitialization(int[] numbers)
    {
        int sum = 0;
                //Прочитаме през масива
                for (int i = 0; i < numbers.length; i++)
                {
                    // всеки един идекс получава стойност: №индекс * 5
                    numbers[i] = i*5;
                    System.out.printf("Current index %d has value of %d. \n", i, numbers[i]);
                }
                // за всеки индекс вземаме елемент
                for (int element:numbers)
                {
                    //всеки елемент садържа индекс с стойност, добавяме я към общата съма
                    sum += element;
                }
                // исчисляваме средната стойност за масива
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
