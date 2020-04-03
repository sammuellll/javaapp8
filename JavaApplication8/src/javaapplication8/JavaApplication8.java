/*
KULLANICIDAN ALINAN IKI SAYI ARASINDAKI SAYILARIN FAKTORIYELINI HESAPLAYAN PROGRAM
 */
package javaapplication8;

/*
 * @author IBRAHIM SAYHAN
 */
import java.util.*;
public class JavaApplication8 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x1, x2, t, n, s, f;
        String a;
        
        do {
            n = 1;
            s = 1;
            System.out.print("IKI SAYI GIRINIZ (ORN : 12 13) = ");
            x1 = input.nextInt();
            x2 = input.nextInt();
            f = x1 - x2;
            if (f <= 0) {
                t = x2;
                x2 = x1;
                x1 = t;
            }
            do {
                do {
                    n = n * s;
                    s = s + 1;
                } while (s <= x2);
                System.out.println(x2 + " faktoriyel = " + n );
                x2 = x2 + 1;
            } while (x1 >= x2);
            System.out.print("Tekrar yapmak ister misiniz (y, n) = ");
            input.nextLine();
            a = input.nextLine();
        } while (a.equals("y"));
    }
}
