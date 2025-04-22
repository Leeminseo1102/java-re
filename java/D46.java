import java.util.Scanner;

public class D46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = "*";

        String T = " ";


        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= n; j++) {

                s += "*";
                T += " ";

                System.out.println( T + s);
            }
        }

    }

}
