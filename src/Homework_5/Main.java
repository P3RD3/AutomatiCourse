package Homework_5;

import org.omg.CORBA.WStringSeqHelper;

import java.awt.*;

public class Main {

    public static void main (String[] args)
    {
        Dog Bulldog = new Dog("Charlie",15,"Bulldog","Medium Sized");
        System.out.println();
        Parrot Twingles = new Parrot("Tommy", 2,"African",true);
        Twingles.setCanSpeak(false);
        System.out.println(Twingles.getData());
        Twingles.setAge(3);
        System.out.println(Twingles.getData());

    }
}
