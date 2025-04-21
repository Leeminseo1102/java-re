import java.util.Scanner;

public class D42 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("숫자를 입력해주세요 (0 입력시 종료): ");

            int a = sc.nextInt();

            if(a == 0){
                System.out.println("0 을 입력해 종료");
                break;
            }
            System.out.println(a + "를 입력하셨습니다. while문 반복");
        }
        sc.close();
    }
}

