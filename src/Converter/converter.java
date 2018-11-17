package Converter;

import java.lang.*;
import java.util.*;
import java.math.*;

public class Converter {

    public static double degreeToRadian(double number) {
        double radian = number * (Math.PI * 180);
        return radian;
    }

    public static double radianToDegree(double number) {
        double degree = number * (180 / Math.PI);
        return degree;
    }

    public static double positiveToNegative(double number) {
        double ptn = -Math.abs(number);
        return ptn;
    }

    public static double negativeToPositive(double number) {
        double ntp = Math.abs(number);
        return ntp;
    }

    public static String circleCalculate(double number) {

        double radius, area, diameter, circumference;

        radius = number;
        diameter = 2 * radius;
        area = (float) (Math.PI * radius * radius);
        circumference = (float) (2 * Math.PI * radius);

        if (number <= 0) {
            String result = "0";
            return result;
        }

        String output = "Radius: " + radius + "\n" + "Diameter: " + diameter + "\n" + "Area: " + area + "\n"
                + "Circum: " + circumference;

        return output;

    }

    public static int crossSum(int number) {

        int result = 0;

        while (number > 0) {

            result += (number % 10);
            number /= 10;

        }

        return result;
    }

}