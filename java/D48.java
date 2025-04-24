import java.util.Scanner;

public class D48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("년도를 입력하시오: ");
        int a = sc.nextInt();

        if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
            System.out.println(a + "윤년이 맞습니다");
        }else{
            System.out.println("윤년이 아닙니다");
        }
        sc.close();
    }
}
