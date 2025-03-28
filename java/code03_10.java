import java.util.Scanner;

public class code03_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score ;

        System.out.print("점수를 입력하시오:");
        score = sc.nextInt();
        System.out.println(score >= 70);

        sc.close();
    }
}
