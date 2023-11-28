/*
Домашно 1

Напишете програма, която:

1. Чете за име на потребител
2. Чете за любимо хоби на потребителя
3. Изписва в конзолата подходящо съобщение за потребителя и хобито
 */

package Homework1;

// import java scanner utility to read user input
import java.util.Scanner;

// Define main class
public class Main {

    // Define main function/program entrypoint
    public static void main(String[] args) {

        // Define variables used to store user input
        String name, hobby;

        // Create object of class scanner to read user input from console
        Scanner scanner = new Scanner(System.in);

        // Prompts the user to enter their name, reads user input and stores it in Name string.
        System.out.println("Hi, what is your name?");
        name = scanner.nextLine();

        // Prompts the user to enter their hobby, reads user input and stores it in Hobby string.
        System.out.println("What is your hobby?");
        hobby = scanner.nextLine();

        // Print out end result into console
        System.out.println("Hello "+ name + " , I also enjoy " + hobby +"!!!");

    }
}