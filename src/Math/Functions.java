import java.util.*;
import java.math.*;

public class Functions {

    public static double percentage(double value, double from) {
        double percentage = (value * 100) / from;
        return percentage;
    }

    public static double valueOfPercentage(double value, double percentageFrom, double percentageTo) {
        double valueOfPercentage = (percentageTo * value) / percentageFrom;
        return valueOfPercentage;
    }

    public static double roundAt(double number, int divide, String mode) {
        String str = mode.toLowerCase();

        BigDecimal result = new BigDecimal(Double.toString(number));

        if (str == "up") {
            result = result.setScale(divide, RoundingMode.UP);
        } else if (str == "down") {
            result = result.setScale(divide, RoundingMode.DOWN);
        } else {
            result = result.setScale(divide, RoundingMode.UP);
        }

        return result.doubleValue();
    }

}