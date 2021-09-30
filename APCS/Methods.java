public class Methods {
    public static Boolean isDivisible(int n, int m){
        Boolean divide = false;
        if (n % m == 0)
            divide = true;
        return divide;
    }
    public static Boolean isTriangle(int n, int m, int o){
        Boolean divide = true;
        if ((n + m) < o) {
            divide = false;
        } else if ((m + o) < n) {
            divide = false;
        } else if ((o + n) < m) {
            divide = false;
        }
        return divide;
    }
    public static int ack(int m, int n){
        if (m == 0)
            return n + 1;
        if (n == 0) 
            return ack(m - 1, 1);
        else
            return ack(m - 1, ack(m, n-1));
    }
    public static void main(String[] args){
        System.out.println(ack(3, 3));
    }
}
