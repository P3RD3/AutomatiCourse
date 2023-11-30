package Test;

public class Main {
    public static double averageValue(double a, double b){
        System.out.printf("The average of %.1f and %.1f is:%.1f\n",a,b,(a+b)/2);
        return (a + b) / 2;
    }
    public static double sum(double a, double b){
        System.out.printf("The sum of %.1f and %.1f is:%.1f\n",a,b,a+b);
        return a+b;
    }


    public static void main(String[] args) {
        double a= 1,b =2;

        averageValue(a,b);
        sum(a,b);

    }

}
