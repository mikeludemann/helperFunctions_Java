import java.util.*;

public class Mathematic {

    public static double percentage(double value, double from) {
        double percentage = (value * 100) / from;
        return percentage;
    }

    public static double valueOfPercentage(double value, double percentageFrom, double percentageTo) {
        double valueOfPercentage = (percentageTo * value) / percentageFrom;
        return valueOfPercentage;
    }

}