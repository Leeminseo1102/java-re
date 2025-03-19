import java.util.Scanner;

public class D7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("아이디를 잊어버리셨나요? 이름을 입력해주세요");
        String UserName = sc.nextLine();

        System.out.println("나이를 입력해주세요");
        int inputAge = sc.nextInt();

        if (UserName.equals(D4.UserName) && inputAge == D4.age) {
            System.out.println("입력하신 정보가 맞습니다 아이디는 : "+D1.id);
        } else {
            System.out.println("입력하시 정보가 일치 하지 않습니다. 다시 확인 해주세요");
        }
        sc.close();

    }

}
