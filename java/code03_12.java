import java.util.Scanner;

public class code03_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println( (num > 100)&&(num < 200) );
        System.out.println((num == 99)||(num == 100));
        System.out.println(!(num == 100));

        sc.close();

    }
}
