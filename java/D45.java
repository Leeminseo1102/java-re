import java.util.Scanner;

public class D45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int unm =sc.nextInt();

        String s = "*";

        for(int a = 0; a < unm; a++) {
//            for(int b = 1; b <= 1; b++) {

                System.out.println(s);

                s = s + "*";
//



        }
        sc.close();
    }
}
