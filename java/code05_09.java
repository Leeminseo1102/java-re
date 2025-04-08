import java.util.Scanner;

public class code05_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("<1> <2> <3> 중 선택하시오: ");
        int num = sc.nextInt();

        switch (num){
            case 1:
                System.out.print("1");
                break;

            case 2:
                System.out.print("2");
                break;

            case 3:
                System.out.print("3");
                break;

            default:
                System.out.print("잘못 눌렀어");
        }
        sc.close();
    }
}
