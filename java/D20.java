import java.util.Scanner;

public class D20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //백준
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A + B);
        }
        sc.close();
    }
}
