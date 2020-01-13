package pl.itacademy;

public class Utils {

    public static boolean isEmpty(String string) {
        return string == null || string.isEmpty();
    }

    public static int divide(int number, int divider) {
        if(divider == 0) {
            throw new ArithmeticException("Divider can't be 0");
        }
        return number / divider;
    }
}
