/**
 * This will covert celsius to fahrenheit and
 * fahrenheit to celsius.
 *
 */

public class P4Q1 {

    public static void main(String[] args) {
        
        double a = celsiusToFahrenheit(0);
        double b = fahrenheitToCelsius(32);
        
        System.out.println(a);
        System.out.println(b);
    }
    
    public static double celsiusToFahrenheit(double c) {
        //write your logic here
        return (9.0 / 5.0) * c + 32;
    }
    
    public static double fahrenheitToCelsius(double f) {
      //write your logic here
        return (5.0 / 9.0) * (f - 32);
    }

}
