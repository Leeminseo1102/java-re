import java.util.Scanner;

public class code05_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 적어주세요: ");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100){
            System.out.print("A");
        }else if (score >= 80) {
            System.out.print("B");
        }else if (score >= 70) {
            System.out.print("C");
        }else if (score >= 60) {
            System.out.print("D");
        }else{
            System.out.print("F");
        }
        System.out.print(" 학점입니다");
        sc.close();
    }
}
