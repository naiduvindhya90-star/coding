public class BasicMathDemo {
    public static void main(String[] args) {
        System.out.println("add: " + BasicMath.add(2,3));
        System.out.println("subtract: " + BasicMath.subtract(5,2));
        System.out.println("multiply: " + BasicMath.multiply(4,2.5));
        System.out.println("divide: " + BasicMath.divide(5,2));
        System.out.println("pow: " + BasicMath.pow(2,10));
        System.out.println("sqrt: " + BasicMath.sqrt(9));
        System.out.println("factorial(10): " + BasicMath.factorial(10));
        System.out.println("gcd(54,24): " + BasicMath.gcd(54,24));
        System.out.println("lcm(54,24): " + BasicMath.lcm(54,24));
        System.out.println("isPrime(97): " + BasicMath.isPrime(97));
        double[] arr = {1,2,3,4,5};
        System.out.println("sum: " + BasicMath.sum(arr));
        System.out.println("avg: " + BasicMath.average(arr));
        System.out.println("modulo(-3,4): " + BasicMath.modulo(-3,4));
        System.out.println("clamp(10,0,5): " + BasicMath.clamp(10,0,5));
    }
}
