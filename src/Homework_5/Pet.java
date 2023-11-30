package Homework_5;

//Това е основинят ни клас Pet
public class Pet {
    //Тук обявяваме променливите който важът за всички домашни любимци(име, възраст, порода, и т.н)
    private String name;
    private int age;
    private String breed;

    //Създаваме нашия базов коструктор
    public Pet(String newName, int newAge, String newBreed) {
        name = newName;
        age = newAge;
        breed = newBreed;
    }

    // Getter и Setter за всяка стойност
    public String getName() {
        return name;
    }
    public String getBreed(){
        return breed;
    }

    public int getAge() {
        return age;
    }

    // Тъй като, възръста неможе да бъде отрицателна, правим if проверка
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

    //Класови метод който ще използваме за да изпишем данните на обекта в конзолата
    public String getData(){
        return "Name: " + getName() + "\nAge: " + getAge() + "\nBreed: " + getBreed();
    }
}

//Създаваме под-клас на Pet
class Dog extends Pet
{

    // Задаваме уникалните за под-класът променливи
    private String size;

    /* модефицираме базовия конструктор(повикваме нужните променливи от базовия клас с super),
    за да може да използва нашите под-класови променливи */
    public Dog(String newName, int newAge, String newBreed, String newSize) {
        super(newName, newAge, newBreed);
        size = newSize;
    }

    // Getter и Setter за под-класовата стойност
    public String getSize(){
        return size;
    }

    public void setSize(String newSize){
        this.size = newSize;
    }

    // Модефицираме и getData метод от базовия клас за да изписва стойностите от под-класът
    public String getData(){
        return super.getData() + "\nSize: " + getSize();
    }

}

// Същото като клас Dog
class Parrot extends Pet
{
    private boolean canSpeak;

    public Parrot(String newName, int newAge, String newBreed,boolean newCanSpeak) {
        super(newName, newAge, newBreed);
        canSpeak = newCanSpeak;
    }

    //Тук вместо да връщаме true/false, връщаме string който зависи от boolean canSpeak
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
