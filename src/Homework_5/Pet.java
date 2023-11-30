package Homework_5;

public class Pet {
    private String name;
    private int age;
    private String breed;

    public Pet(String newName, int newAge, String newBreed) {
        name = newName;
        age = newAge;
        breed = newBreed;
    }

    public String getName() {
        return name;
    }
    public String getBreed(){
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge){
        if (newAge > 0){
            this.age = newAge;
        }
        else {
            System.out.println("Age cannot be less than 0");
        }

    }

    public void setName(String newName){
        this.name = newName;
    }
    public void setBree(String newBreed){
        this.breed = newBreed;
    }

    public String getData(){
        return "Name: " + getName() + "\nAge: " + getAge() + "\nBreed: " + getBreed();
    }
}

class Dog extends Pet
{
    private String size;
    public Dog(String newName, int newAge, String newBreed, String newSize) {
        super(newName, newAge, newBreed);
        size = newSize;
    }

    public String getSize(){
        return size;
    }

    public void setSize(String newSize){
        this.size = newSize;
    }

    public String getData(){
        return super.getData() + "\nSize: " + getSize();
    }

}
class Parrot extends Pet
{
    private boolean canSpeak;

    public Parrot(String newName, int newAge, String newBreed,boolean newCanSpeak) {
        super(newName, newAge, newBreed);
        canSpeak = newCanSpeak;
    }

    public String isCanSpeak() {
        String yes = "It can speak";
        String no = "It can't speak";
        if (canSpeak){
            return yes;
        }
        else
        {
            return no;
        }
    }
    public void setCanSpeak(boolean newCanSpeak){
        this.canSpeak = newCanSpeak;
    }

    public String getData(){
        return super.getData() + "\nCan speak: " + isCanSpeak();
    }
}
