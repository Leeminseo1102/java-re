import java.util.Scanner;

public class D16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //백준
        int hour = sc.nextInt();
        int minute = sc.nextInt();


        minute -= 45;

        if (minute < 0) {
            minute += 60;
            hour -= 1;
        }

        if (hour < 0) {
            hour = 23;
        }

        // 결과 출력
        System.out.println(hour + " " + minute);
    }
}
