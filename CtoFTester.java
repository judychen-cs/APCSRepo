// Hello!
// For the parameters, the functions should have one double type each.
// The first function should take Celsius as a parameter, while the other should have Fahrenheit.
// The first function should return a double type value Fahrenheit, while the other should return a double type value Celsius.

public class conversion_1 {
  public static double celsiusToFahrenheit(double C) {
    double Fahrenheit = ((9.0/5.0) * C) + 32;
    return Fahrenheit;
  }
}

public class conversion_2 {
  public static double fahrenheittoCelsius(double F) {
    double Celsius = (5.0/9.0) * (F - 32);
    return Celsius;
  }
}
