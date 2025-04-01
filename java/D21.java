import java.util.Scanner;

public class D21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //백준

        long X = sc.nextLong();


        int N = sc.nextInt();


        long totalAmount = 0;

        for (int i = 0; i < N; i++) {
            long a = sc.nextLong();
            int b = sc.nextInt();

            totalAmount += a * b;
        }


        if (totalAmount == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
