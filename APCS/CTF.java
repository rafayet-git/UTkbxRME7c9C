import java.util.Scanner;

public class CTF{
    public static void main(String[] args){
        double fahr;
        double celc;
        Scanner in = new Scanner(System.in);
        System.out.print("what is the temp in C? ");
        celc = in.nextInt();
        fahr = (1.8 * celc) + 32;
        System.out.print(celc + " degrees C is ");
        System.out.println(fahr + " degrees F");
    }
}
