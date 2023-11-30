package Homework_5;

public class Main {

    public static void main (String[] args)
    {
        //Създаваме обекти от нашите класове и тестваме нашите методи
        Dog Bulldog = new Dog("Charlie",15,"Bulldog","Medium Sized");
        System.out.println();
        Parrot Twingles = new Parrot("Tommy", 2,"African",true);
        Twingles.setCanSpeak(false);
        System.out.println(Twingles.getData());
        Twingles.setAge(3);
        System.out.println(Twingles.getData());

    }
}
