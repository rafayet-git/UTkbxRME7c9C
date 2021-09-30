import java.util.Random;

public class Arrays {
    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }
    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high) {
                count++;
            }
        }
        return count;
    }
    public static void printArray(int[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }
    public static double[] powArray(double[] a, int pwr) {
        int i = 0;
        while (i < a.length) {
            a[i] = Math.pow(a[i],pwr);
            i++;
        }
        return a;
    }
    public static int[] histogram(int[] scores, int cou) {
        int[]  counts = new int[cou];
        for (int i = 0; i < counts.length; i++ ) {
            int index = scores[i];
            counts[i] = inRange(scores, i, i + 1);
        }
        return counts;
    }
    public static int indexOfMax(int[] a){
        int largestindex = 0;
        int largest = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
                largestindex = i;
            } 
        }
        return largestindex;
    }
    public static boolean[] sieve(int n) {
        boolean[] yesno = new boolean[n];
        int e = 0;
        while (e <= n) {
            for (int i = 2; i <= e/2; ++i) {
                if (e % i == 0) {
                    yesno[e] = true;
                }
            }
            e = e+1;
        }
        return yesno;
    }
    public static void main(String[] args) {
    }
}
