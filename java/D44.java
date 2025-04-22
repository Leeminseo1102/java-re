import java.util.Scanner;

public class D44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = a + b;
            System.out.println(result);

        }
        sc.close();
    }
}
