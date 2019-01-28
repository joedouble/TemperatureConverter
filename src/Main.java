import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double tempInFahrenheit = 0;
        double tempInCelsius = 0;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is the temperature in Fahrenheit that you'd like converted to Celsius?");
        tempInFahrenheit = myScanner.nextDouble();

        tempInCelsius = (tempInFahrenheit - 32) / 1.8;

        System.out.println("The temperature in Fahrenheit is " + tempInFahrenheit + ".");
        System.out.println("The temperature in Celsius is " + tempInCelsius + ".");
    }
}
