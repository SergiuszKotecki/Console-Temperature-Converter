/**
 * Created by SergiuszK on 2017-06-13.
 */
public class CTemperatureConverter {

    public void tempCelToFar(double value, int decimalPoints) {
        celFar(value, decimalPoints);
        celKel(value, decimalPoints);
        celRan(value, decimalPoints);
        celRea(value, decimalPoints);
        celRom(value, decimalPoints);
        celD(value, decimalPoints);
        celN(value, decimalPoints);
/*  mathematical formulas:
        °F = (°C × 1.8) + 32
        °K = °C + 273.15
        °R = (°C + 273.15) × 1.8
        °Ré =(°C × 4)/5
        °Rø = °C × 21/40+7.5
        °De = (100 − °C) × 3/2
        °N = °C × 33/100*/
    }

    public void celFar(double value, int decimalPoints) {
        double sumF = ((value * 1.8) + 32);
        System.out.printf("Value in Fahrenheit: %." + decimalPoints + "f%n", sumF);
    }

    public void celKel(double value, int decimalPoints) {
        double sumK = value + 273.15;
        System.out.printf("Value in Kelvin: %." + decimalPoints + "f%n", sumK);
    }

    public void celRan(double value, int decimalPoints) {
        double sumRan = (value + 273.15) * 1.8;
        System.out.printf("Value in Rankine: %." + decimalPoints + "f%n", sumRan);

    }

    public void celRea(double value, int decimalPoints) {
        double sumRea = (value * 4) / 5;
        System.out.printf("Value in Réaumur: %." + decimalPoints + "f%n", sumRea);
    }

    public void celRom(double value, int decimalPoints) {
        double sumRom = ((value * 21) / 40) + 7.5;
        System.out.printf("Value in Rømer: %." + decimalPoints + "f%n", sumRom);
    }

    public void celD(double value, int decimalPoints) {
        double sumD = (100 - value) * (3 / 2);
        System.out.printf("Value in Delisle: %." + decimalPoints + "f%n", sumD);

    }

    public void celN(double value, int decimalPoints) {
        double sumN = value * (0.3333);
        System.out.printf("Value in Newton: %." + decimalPoints + "f%n", sumN);
    }


}
