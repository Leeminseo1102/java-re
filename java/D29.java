import java.util.Scanner;
public class D29{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String a = scanner.next();
        String b = scanner.next();


        String result = (a + b).toLowerCase().replace(" ", "");


        System.out.println(result);

        scanner.close();
    }
}