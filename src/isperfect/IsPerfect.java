package isperfect;
/* @author sumeyral

 */
import java.util.Scanner;

public class IsPerfect {
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        System.out.println(NumberUtil.isPerfect(val) == true ? "Sayı mükemmeldir.": "Sayı mükemmel değildir.");

    }
}

class NumberUtil {
    public static boolean isPerfect(int val) {
        if (val == sumFactors(val))
            return true;
        else
            return false;
    }

    public static int sumFactors(int val) {
        int sum = 1;

        if (val == 1)
            return sum;
        else {
            for (int i = 2; i < val; i++) {
                if (val % i == 0)
                    sum += i;
            }
            return sum;
        }
    }
}