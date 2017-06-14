/**
 * Created by SergiuszK on 2017-06-13.
 */
public class CTemperatureConverter {

    public void tempCelToFar(double value, int decimalPoints) {
        double sumF = ((value * 1.8) + 32);
        System.out.printf("Value in Fahrenheit: %." + decimalPoints + "f%n", sumF);
        double sumK = value + 273.15;
        System.out.printf("Value in Kelvin: %." + decimalPoints + "f%n", sumK);
        double sumRan = (value + 273.15) * 1.8;
        System.out.printf("Value in Rankine: %." + decimalPoints + "f%n", sumRan);
        double sumRea = (value * 4) / 5;
        System.out.printf("Value in Réaumur: %." + decimalPoints + "f%n", sumRea);
        double sumRom = ((value * 21) / 40) + 7.5;
        System.out.printf("Value in Rømer: %." + decimalPoints + "f%n", sumRom);
        double sumD = (100 - value) * (3 / 2);
        System.out.printf("Value in Delisle: %." + decimalPoints + "f%n", sumD);
        double sumN = value * (0.3333);
        System.out.printf("Value in Newton: %." + decimalPoints + "f%n", sumN);
    }
}
