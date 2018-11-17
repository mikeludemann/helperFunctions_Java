package Math.Converter;

import java.lang.*;
import java.util.*;

public class Speed {

    public static double mphToKPH(double mph) {
        double result = mph * 1.609344;

        return result;
    }

    public static double mphToKnot(double mph) {
        double result = mph / 1.150779;

        return result;
    }

    public static double mphToMach(double mph) {
        double result = mph / 761.207;

        return result;
    }

    public static double kphToMPH(double kph) {
        double result = kph / 1.609344;

        return result;
    }

    public static double kphToKnot(double kph) {
        double result = kph / 1.852;

        return result;
    }

    public static double kphToMach(double kph) {
        double result = kph / 1225.044;

        return result;
    }

    public static double knotToMPH(double knot) {
        double result = knot * 1.150779;

        return result;
    }

    public static double knotToKPH(double knot) {
        double result = knot * 1.852;

        return result;
    }

    public static double knotToMach(double knot) {
        double result = knot / 661.4708;

        return result;
    }

    public static double machToMPH(double mach) {
        double result = mach * 761.207;

        return result;
    }

    public static double machToKPH(double mach) {
        double result = mach * 1225.044;

        return result;
    }

    public static double machToKnot(double mach) {
        double result = mach * 661.4708;

        return result;
    }

}