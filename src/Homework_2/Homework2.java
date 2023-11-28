package Homework_2;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {

        //Create new object of type Scanner to get input form console
        Scanner scanner = new Scanner(System.in);

        //Define the replacement string
        String replacement = "Hello";

        //Request user to enter the original string, of which the last word will be replaced
        System.out.println("Please enter your string, the last word of the string will be replaced");
        String orignalString = scanner.nextLine();

        /* Using String tools to split the string into words.
        After splitting the string into separate words (separated by the spaces in between), locate the last word in the string.
        Print our find and the word which is to be replaced  */
        String[] words = orignalString.split("\\s+");
        String lastWord = words[words.length - 1];
        System.out.println("Last word is:" + lastWord);

        /* Defining the variable that contains the modified string.
        Using the replace function and we can replace the lastWord of the sentence with the replacement defined earlier. */
        String newString = orignalString.replace(lastWord,replacement);
        //Print our final result
        System.out.println("The new string is:" + newString);

    }


}
