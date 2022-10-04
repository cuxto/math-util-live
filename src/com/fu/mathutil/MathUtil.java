package com.fu.mathutil;

public class MathUtil {

    public static long getFactorial(int n) {
        long product = 1;
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument");
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        return product;
    }

}
