import java.lang.*;
import java.util.*;
import java.math.*;

public class Functions {

    public static double sum(double first, double second) {
        double result = first + second;
        return result;
    }

    public static double difference(double first, double second) {
        double result = first - second;
        return result;
    }

    public static double product(double first, double second) {
        double result = first * second;
        return result;
    }

    public static double average(double first, double second) {
        double result = (first + second) / 2;
        return result;
    }

    public static double distance(double first, double second) {
        double result = Math.abs(first - second);
        return result;
    }

    public static double max(double first, double second) {
        double result = Math.max(first, second);
        return result;
    }

    public static double min(double first, double second) {
        double result = Math.min(first, second);
        return result;
    }

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

    public static int reverseNumber(int number) {
        int num = number;
        int isPositive = 1;

        if (num < 0) {

            isPositive = -1;
            num = -1 * num;

        }

        int sum = 0;

        while (num > 0) {
            int result = num % 10;

            int maxDiff = Integer.MAX_VALUE - sum * 10;

            if (sum > Integer.MAX_VALUE / 10 || result > maxDiff) {

                System.out.println("Not a valid number");

            }

            sum = sum * 10 + result;
            num /= 10;
        }

        return isPositive * sum;
    }

    public static int romanToNumber(String roman) {
        String str = roman;
        int length = str.length();

        str = str + " ";
        int result = 0;

        for (int i = 0; i < length; i++) {

            char character = str.charAt(i);
            char nextCharacter = str.charAt(i + 1);

            if (character == 'M') {

                result += 1000;

            } else if (character == 'C') {

                if (nextCharacter == 'M') {

                    result += 900;
                    i++;

                } else if (nextCharacter == 'D') {

                    result += 400;
                    i++;

                } else {

                    result += 100;

                }
            } else if (character == 'D') {

                result += 500;

            } else if (character == 'X') {

                if (nextCharacter == 'C') {

                    result += 90;
                    i++;

                } else if (nextCharacter == 'L') {

                    result += 40;
                    i++;

                } else {

                    result += 10;

                }
            } else if (character == 'L') {

                result += 50;

            } else if (character == 'I') {

                if (nextCharacter == 'X') {

                    result += 9;
                    i++;

                } else if (nextCharacter == 'V') {

                    result += 4;
                    i++;

                } else {

                    result++;

                }
            } else {

                result += 5;

            }
        }

        return result;
    }

    public static String numberToRoman(int num) {

        StringBuilder sb = new StringBuilder();

        int times = 0;

        String[] romanCharacter = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM",
                "M" };
        int[] numbers = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };

        for (int i = numbers.length - 1; i >= 0; i--) {

            times = num / numbers[i];
            num %= numbers[i];

            while (times > 0) {

                sb.append(romanCharacter[i]);
                times--;

            }

        }

        return sb.toString();
    }

    public static int countOfPrimeNumber(int number) {

        if (number <= 0 || number == 1 || number == 2) {
            return 0;
        } else if (number == 3) {
            return 1;

        }
        BitSet set = new BitSet();

        number = number - 1;

        int s = (int) Math.sqrt(number);

        int result = number;

        for (int i = 2; i <= s; i++) {

            if (!set.get(i)) {

                for (int j = 2; (i * j) <= number; j++) {

                    if (!set.get(i * j)) {

                        result--;
                        set.set(i * j);

                    }

                }

            }

        }

        return result - 1;
    }

    public static String BMI(double weightKilogram, double sizeMeter) {

        double BMI = (weight / (sizeMeter * sizeMeter));

        System.out.println("Your BMI: " + BMI);

        if (BMI < 16) {
            return "Strong underweight";
        } else if (BMI > 16 && BMI < 17) {
            return "Moderate underweight";
        } else if (BMI > 17 && BMI < 18.5) {
            return "Light underweight";
        } else if (BMI > 25 && BMI < 30) {
            return "Pre-obese";
        } else if (BMI > 30 && BMI < 35) {
            return "Obesity - Step I";
        } else if (BMI > 35 && BMI < 40) {
            return "Obesity - Step II";
        } else if (BMI > 40) {
            return "Obesity - Step III";
        } else {
            return "Normal weight";
        }

    }

    public static int pentagonalNumber(int i) {
        return (i * (3 * i - 1)) / 2;
    }

    public static void Matrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }

    /* ############################################################ */

    public static boolean isSideValid(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide > thirdSide && secondSide + thirdSide > firstSide
                && firstSide + thirdSide > secondSide) {
            return true;
        } else {
            return false;
        }
    }

    public static double area_triangle(double firstSide, double secondSide, double thirdSide) {
        double area = 0;
        double s = (firstSide + secondSide + thirdSide) / 2;

        if (isSideValid(firstSide, secondSide, thirdSide)) {
            area = Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide));
            return area;
        } else {
            area = 0;
            return area;
        }
    }

    /* ############################################################ */

}