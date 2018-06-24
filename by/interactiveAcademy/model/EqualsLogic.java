package by.interactiveAcademy.model;

public class EqualsLogic {

    public static boolean getEquals(int n, int s) {

        if (n > 0) {
            return getEquals(n / 10, s - n % 10);
        }
       return n == 0 && s == 0;
    }
}
