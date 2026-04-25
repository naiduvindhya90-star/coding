import java.math.BigInteger;

/**
 * Utility class providing basic math functions.
 */
public final class BasicMath {
    private BasicMath() {}

    public static double add(double a, double b) { return a + b; }

    public static double subtract(double a, double b) { return a - b; }

    public static double multiply(double a, double b) { return a * b; }

    public static double divide(double a, double b) {
        if (b == 0.0) throw new IllegalArgumentException("Division by zero");
        return a / b;
    }

    public static double pow(double a, double b) { return Math.pow(a, b); }

    public static double sqrt(double a) { return Math.sqrt(a); }

    public static double abs(double a) { return Math.abs(a); }

    public static double min(double a, double b) { return Math.min(a, b); }

    public static double max(double a, double b) { return Math.max(a, b); }

    public static long modulo(long a, long b) {
        if (b == 0) throw new IllegalArgumentException("Modulo by zero");
        long m = a % b;
        return (m + Math.abs(b)) % Math.abs(b);
    }

    public static double sum(double[] arr) {
        if (arr == null) return 0.0;
        double s = 0.0;
        for (double v : arr) s += v;
        return s;
    }

    public static double average(double[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Array must not be null or empty");
        return sum(arr) / arr.length;
    }

    public static BigInteger factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) res = res.multiply(BigInteger.valueOf(i));
        return res;
    }

    public static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0) return b;
        if (b == 0) return a;
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a / gcd(a, b) * b);
    }

    public static double clamp(double value, double min, double max) {
        if (min > max) throw new IllegalArgumentException("min must be <= max");
        return Math.max(min, Math.min(max, value));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; (long) i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static BigInteger combinations(int n, int k) {
        if (n < 0 || k < 0 || k > n) throw new IllegalArgumentException("Invalid n or k");
        BigInteger num = BigInteger.ONE;
        BigInteger den = BigInteger.ONE;
        for (int i = 1; i <= k; i++) {
            num = num.multiply(BigInteger.valueOf(n - (i - 1)));
            den = den.multiply(BigInteger.valueOf(i));
        }
        return num.divide(den);
    }
}
