import java.util.Scanner;
//import는 다른 파일에 있는 정보를 가져오는것
public class D6 {
    public static void main(String[] args) {
        //scanner:키보드로 입력한 값을 받는다 이건 java.util에 포함 되어 있는 것
        Scanner scanner = new Scanner(System.in);

        //scanner.nextLine():사용자가 엔터를 칠때까지의 입력한 모든 텍스트를 읽는다
        System.out.print("ID를 입력하세요: ");
        String inputId = scanner.nextLine();


        System.out.print("나이를 입력하세요: ");
        int inputAge = scanner.nextInt();

        //만약 제대로 적으면 로그인 성공 다르게 적으면 실패(else는 if 명령어가 틀리면 발동하는것)
        //(inputId.equals(D1.id) && inputAge == D4.age):inputid는 D1에 있는 id를 담고 equals는 D1과 같은것인지 확인하는 역할
        if (inputId.equals(D1.id) && inputAge == D4.age) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
        //scanner.close();이거 없도 실행 되는데 있는 이유는 리소스 누수를 방지 차원에서 쓴다고 한다 이것도 처음 알았다
        //주석 다는거 재밌다
        scanner.close();



    }
}
