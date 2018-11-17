package Math.Converter;

import java.lang.*;
import java.util.*;

public class Weight {

    public static double poundToKilogram(double pound) {
        double result = pound / 2.2046;

        return result;
    }

    public static double poundToOunce(double pound) {
        double result = pound * 16;

        return result;
    }

    public static double poundToGram(double pound) {
        double result = pound / 0.0022046;

        return result;
    }

    public static double poundToStone(double pound) {
        double result = pound * 0.071429;

        return result;
    }

    public static double kilogramToPound(double kilogram) {
        double result = kilogram * 2.2046;

        return result;
    }

    public static double kilogramToOunce(double kilogram) {
        double result = kilogram * 35.274;

        return result;
    }

    public static double kilogramToGram(double kilogram) {
        double result = kilogram * 1000;

        return result;
    }

    public static double kilogramToStone(double kilogram) {
        double result = kilogram * 0.1574;

        return result;
    }

    public static double ounceToPound(double ounce) {
        double result = ounce * 0.0625;

        return result;
    }

    public static double ounceToKilogram(double ounce) {
        double result = ounce / 35.274;

        return result;
    }

    public static double ounceToGram(double ounce) {
        double result = ounce / 0.035274;

        return result;
    }

    public static double ounceToStone(double ounce) {
        double result = ounce * 0.0044643;

        return result;
    }

    public static double gramToPound(double gram) {
        double result = gram * 0.0022046;

        return result;
    }

    public static double gramToKilogram(double gram) {
        double result = gram / 1000;

        return result;
    }

    public static double gramToOunce(double gram) {
        double result = gram * 0.035274;

        return result;
    }

    public static double gramToStone(double gram) {
        double result = gram * 0.00015747;

        return result;
    }

    public static double stoneToPound(double stone) {
        double result = stone * 14;

        return result;
    }

    public static double stoneToKilogram(double stone) {
        double result = stone / 0.15747;

        return result;
    }

    public static double stoneToOunce(double stone) {
        double result = stone * 224;

        return result;
    }

    public static double stoneToGram(double stone) {
        double result = stone / 0.00015747;

        return result;
    }

}