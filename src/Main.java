import java.util.Scanner;

/**
 * Created by SergiuszK on 2017-06-13.
 */
public class Main {
    private static CTemperatureConverter temperatureConverterC = new CTemperatureConverter();
    private static FTemperatureConverter temperatureConverterF = new FTemperatureConverter();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String userName = System.getProperty("user.name");
        boolean quitProgram = false;
        int choiceMenu = 0;
        printMenu();
        System.out.println("Hello, " + userName);
        while (!quitProgram) {
            System.out.println("Enter your choice: ");
            choiceMenu = scanner.nextInt();
            scanner.nextLine();
            switch (choiceMenu) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    convertFromCel();
                    break;
                case 2:
                    convertFromFar();
                    break;
                case 3:
                    quitProgram = true;
                    break;
                default:
                    printMenu();
            }
        }

    }

    public static void printMenu() {
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print options ");
        System.out.println("\t 1 - To convert temperature from Celsius to other units");
        System.out.println("\t 2 - To convert temperature from Fahrenheit to other units");
        System.out.println("\t 3 - To quit");
    }

    public static void convertFromCel() {
        System.out.println("Please enter value in Celsius: ");
        double value = scanner.nextDouble();
        System.out.println("Please enter number after decimal point:  ");
        int decimalPoints = scanner.nextInt();
        temperatureConverterC.tempCelToFar(value, decimalPoints);
    }

    public static void convertFromFar() {
        System.out.println("Please enter value in Fahrenheit: ");
        double value = scanner.nextDouble();
        System.out.println("Please enter number after decimal point:  ");
        int decimalPoints = scanner.nextInt();
        temperatureConverterF.tempCelToFar(value, decimalPoints);
    }

}
