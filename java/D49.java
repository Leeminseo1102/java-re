import java.util.Scanner;

public class D49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int str = sc.nextInt();

        for (int i = 1; i < str; i++) {
            for (int j = i + 1  ; j <= str - 1; j--) {
                System.out.print("a");
            }

            for (int X = str; X < str+1 ; X++) {
                System.out.print("X");
            }
            System.out.println();
        }
        sc.close();
    }
}