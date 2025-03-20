import java.util.Scanner;

public class D8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("현관문 상태를 입력하세요 (열림/닫힘): ");


        String doorStatus = scanner.nextLine().trim();


        if (doorStatus.equalsIgnoreCase("열림")) {
            System.out.println("현관문이 열렸습니다. 신호를 보냅니다!");

            sendSignal();
        } else if (doorStatus.equalsIgnoreCase("닫힘")) {
            System.out.println("현관문이 닫혔습니다.");
        } else {
            System.out.println("잘못된 입력입니다.");
        }

        scanner.close();
    }


    public static void sendSignal() {

        System.out.println("알림: 현관문이 열렸습니다!");


    }
}
