package Homework_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

//Метод с който проверяваме паролата въведена от user
    private static boolean isPasswordValid(String password)
    {
        //Обявяваме нужните променлилви.
        int minLength = 8;
        //3 boolean променнливи които ще използваме за да определим кое условие е при въвеждане на паролата
        boolean hasLetter = false;
        boolean hasNumber = false;
        boolean hasSymbol = false;
        //Проверяваме дали паролата е поне 8 символа
        if(password.length() < minLength){
            System.out.println("Password must be at least " + minLength);
            return false;
        }
        // Тук с char разцепваме паролата(String) на отделни символи и ги запазваме в масив(ch)
        for(char ch:password.toCharArray())
        {
            //Правим нужните верификации, и ги отбелязваме като преминати(true)
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
        //Със тези ifове, определяме какви грешки да връща на потребителя в случай че пропусне изискване
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
        //ако вскичко е наред, метода връща true
        else
        {
            return true;
        }
    }

    //Този мето проверява дали 3 подадени числа са позитивни
    private static boolean areNumbersPositive (int a,int b,int c)
    {
        //Тук довавяме нужните boolean стойности за да разберем кое от 3те числа е различно
        boolean aPositive = false;
        boolean bPositive = false;
        boolean cPositive = false;
        // Прости if проверки за негативни числа
        if (a > 0){
            aPositive = true;
        }
        if (b > 0) {
            bPositive = true;

        }
        if (c > 0) {
            cPositive = true;
        }
        //Проверяваме резултата от if проверките и в информираме потребителя при грешка
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
        // ако всичко е ОК, информираме потребителя и метода връща true
            else {
                System.out.println("All numbers are positive!");
                return true;
            }

    }

    //Метод който изпълнява базова проверка за да прецени дали 3 числа са равни
    private static boolean areNumbersEqual(int a, int b, int c){
        if (a == b && b == c){
            System.out.println("All numbers are equal!");
                    return true;
        } else {
            System.out.println("Numbers are not equal!");
            return false;
        }
    }

    //Метод който взема 3 числа и ги събира, връща сумата от тях на потребителя
    public static int sumOfNumbers(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }

    //Този метод използва sumOfNumbers метода за да изчисли сумата и да намери средната стойност
    public static void averageOfNumbers(int a, int b, int c){
       int sum = sumOfNumbers(a,b,c);
       System.out.println("Average of numbers is:"+sum/3);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* В този цикъл, потребителя въвежда паролата(цикъла е в случай на грешка, потребителя да може да се пробва пак).
        Този цикъл няма да бъде прекъснат освен ако потребителя не стигне break point-а в него(да въведе парола отговаряща на нашите изисквания)*/
        while(true)
        {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            //Тук използваме нашия метод да верифицираме паролата
            if (isPasswordValid(password))
            {
                System.out.println("Password is valid!");
                break;
            } else {
                System.out.println("Password is invalid!\nPlease note that a valid password contains at least 8 characters, 1 letter, 1 number, 1 symbol.");
            }
        }
        //------------------------------------------------------------------------------------------------------------
                                        //Метод за парола

                                        // Останалите части
        //------------------------------------------------------------------------------------------------------------

        // Обявяваме нужните променливи
        int firstNumber = 0, secondNumber = 0, thirdNumber;
        // boolean-ите са контролни точки, към който ще навигираме цикъла, в случаи на грешка от страна на потребителя
        boolean retryFirstNumber = false, retrySecondNumber =false, retryThirdNumber=false;
        System.out.println("Please enter 3 numbers and I will tell you if they are positive");

        //Този цикъл върви докато потребителя въведе правилни числа
        while (!(retryFirstNumber && retrySecondNumber && retryThirdNumber)) {
            try {

                /* Тези ifове изписват на потребителя да въведе 1 по 1 числата от програмата.
                Ако потребителя не въведе число(от тип integer), то скенера ще даде exception, който обработваме в catch
                 */
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

                    //След като имаме всички нужни променливи, тестваме наще методи от по-горе
                    areNumbersPositive(firstNumber, secondNumber, thirdNumber);
                    areNumbersEqual(firstNumber, secondNumber, thirdNumber);
                    System.out.println("Sum of numbers is:" + sumOfNumbers(firstNumber,secondNumber,thirdNumber));
                    averageOfNumbers(firstNumber,secondNumber,thirdNumber);
                }
            }

            // Тук се оправяме с, най-честия exception при въвеждане на данни, въведени данни от неправилен тип(всичко което не е integer(число))
            catch (InputMismatchException e) {
                System.out.println("Please enter a number!");// даваме на потребителя грешка, да си знае
                scanner.next();// исчистваме буфера(въведеното от потребителя)

                // В зависимост при кое въвеждане на число се е получила грешката.
                // Връщаме потребителя обратно в тази част на цикъла до която е стигнал.
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
