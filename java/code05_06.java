import java.util.Scanner;

public class code05_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int n =sc.nextInt();

        if(n > 100){
            if(n < 1000){
                System.out.println("100보다 크고 1000보다 작넹");
            }else{
                System.out.println("와 1000보다 크군용");
            }
        }else{
            System.out.println("옹 100보다 작넹");
        }
        sc.close();
    }
}
