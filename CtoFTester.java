// Hello!
// For the parameters, the functions should have one double type each.
// The first function should take Celsius as a parameter, while the other should have Fahrenheit.
// The first function should return a double type value Fahrenheit, while the other should return a double type value Celsius.

public class CtoFTester {
  public static double celsiusToFahrenheit(double C) {
    double Fahrenheit = ((9.0/5.0) * C) + 32.0;
    return Fahrenheit;
  }
  public static double fahrenheittoCelsius(double F) {
    double Celsius = (5.0/9.0) * (F - 32.0);
    return Celsius;
  }
  public static void main(String[] args){
    System.out.print("Celsius of 0 degrees F" + " = " + fahrenheittoCelsius(0));
    System.out.print("Fahrenheit of 0 degrees C" + " = " + celsiusToFahrenheit(0));
  }
}
