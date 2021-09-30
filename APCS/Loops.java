public class Loops {
    public static double power(double x, int n) {
        double e = x;
        if (n == 0) {
            return 1.0;
        } else {
            while (n > 1) {
                e = x * e;
                n = n - 1;
            }
            return e;
        }
    }
    public static int factorial(int n) {
        int result = 1;
        while (n > 0) {
            result = result * n;
            n = n - 1;
        }   
        return result;
    }
    public static double myexp(double x, int n) {
        double total = 1;
        int i = 1;
        if (n > 1) {
            total = total + x;
            i = i + 1;
        }
        while (i <= n) {
            total = total + ((Math.pow(x, i)) / (factorial(i)));
            i = i + 1;
        }
        return total;
    }
    public static void check(double x) {
        System.out.println(x + "    " + Math.exp(x) + "     " + myexp(x, 20));
    }
    public static void main(String[] args) {
        double x = 0.1;
        while (100.0 >= x) {
            check(x);
            x = x*10;
        }
        x = -0.1;
        while (-100.0 <= x) {
            check(x);
            x = x*10;
        }
    }
}
