public class conversions {
  public static double celsiusToFahrenheit(double C) {
    double Fahrenheit = ((9.0/5.0) * C) + 32;
    return Fahrenheit;
  }
  public static double fahrenheittoCelsius(double F) {
    double Celsius = (5.0/9.0) * (F - 32);
    return Celsius;
  }
}
