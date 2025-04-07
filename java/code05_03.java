import java.util.Scanner;

public class code05_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unm = sc.nextInt();

        if (unm < 100){
            System.out.println("100보다 작군용");
            System.out.println("참이에용");
        }else{
            System.out.println("100보다 크군용");
            System.out.println("거짓이에용");
        }
        sc.close();

        System.out.println("끝이에용");
    }
}
