import java.util.Scanner;

public class D28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result;

        if(a == b && b == c){
            result = 10000 + a * 1000;
        }else if(a == b || a == c){
            result = 1000 + a * 100;
        }else if(c == b){
            result = 1000 + a * 100;
        }else{
            result = Math.max(a, Math.max(b, c))* 100;
        }
        System.out.println(result);
        sc.close();
    }

}
