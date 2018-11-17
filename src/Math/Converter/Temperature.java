package Math.Converter;

import java.lang.*;
import java.util.*;

public class Temperature {

    public static double fahrenheitToCelsius(double fahrenheit) {
        double result = (fahrenheit - 32) / 1.8;

        return result;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        double result = ((fahrenheit - 32) / 1.8) + 273.15;

        return result;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double result = (celsius * 1.8) + 32;

        return result;
    }

    public static double celsiusToKelvin(double celsius) {
        double result = celsius + 273.15;

        return result;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        double result = ((kelvin - 273.15) * 1.8) + 32;

        return result;
    }

    public static double kelvinToCelsius(double kelvin) {
        double result = kelvin - 273.15;

        return result;
    }

}