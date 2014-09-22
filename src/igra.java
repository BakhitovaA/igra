import java.util.Random;
import java.util.Scanner;

/**
 * Created by student on 22.09.2014.
 */
public class igra {
    public static void main(String[] args) {
        int n=new Random().nextInt(100)+1;
        Scanner in=new Scanner(System.in);
        while (true){
            System.out.print("введите число = ");
            int x=in.nextInt();
            if (x<n) {
                System.out.println("число "+x+" меньше загаданного");
            }
            if (x>n) {
                System.out.println("число "+x+" больше загаданного");
            }
            if (x==n) {
                System.out.println("Поздравляю! Загаданное число="+n);
                break;
            }
        }

    }
}
