/**
 * Created by Komp_1 on 2017-06-14.
 */

/*  mathematical formulas:
 *       °C = (°F − 32) /1.8
 *       °K = (°F + 459.67) × 5/9
 *       °R = °F + 459.67
 *       °Ré = (°F - 32) × 4/9
 *    	 °Rø = (°F − 32) × 7/24 + 7.5
 *       °De = (121 − °F) × 5/6
 *       °N = (°F − 32) × 11/60
*/
public class FTemperatureConverter {

    public void tempCelToFar(double value, int decimalPoints) {



        double sumF = (value - 32) * 1.8;
        System.out.printf("Value in Celsius: %." + decimalPoints + "f%n", sumF);
        double sumK = (value + 459.67) * 0.55555555555;
        System.out.printf("Value in Kelvin: %." + decimalPoints + "f%n", sumK);
        double sumRan = value + 459.67;
        System.out.printf("Value in Rankine: %." + decimalPoints + "f%n", sumRan);
        double sumRea = (value - 32) * 0.44444444444;
        System.out.printf("Value in Réaumur: %." + decimalPoints + "f%n", sumRea);
        double sumRom = (value - 32) * 0.29166666666 + 7.5;
        System.out.printf("Value in Rømer: %." + decimalPoints + "f%n", sumRom);
        double sumD = (121 - value) * 0.83333333333;
        System.out.printf("Value in Delisle: %." + decimalPoints + "f%n", sumD);
        double sumN = (value - 32) * 0.18333333333;
        System.out.printf("Value in Newton: %." + decimalPoints + "f%n", sumN);
    }


}
