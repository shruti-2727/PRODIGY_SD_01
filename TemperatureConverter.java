import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature value:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter unit of measurement (C, F, or K):");
        String unit = scanner.next().toUpperCase();

        double celsius, fahrenheit, kelvin;

        switch (unit) {
            case "C":
                celsius = temperature;
                fahrenheit = (celsius * 9/5) + 32;
                kelvin = celsius + 273.15;
                break;
            case "F":
                fahrenheit = temperature;
                celsius = (fahrenheit - 32) * 5/9;
                kelvin = celsius + 273.15;
                break;
            case "K":
                kelvin = temperature;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * 9/5) + 32;
                break;
            default:
                System.out.println("Invalid unit of measurement.");
                return;
        }

        System.out.println("Celsius: " + celsius + " °C");
        System.out.println("Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Kelvin: " + kelvin + " K");

        scanner.close();
    }
}