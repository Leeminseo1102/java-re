import java.util.Scanner;

public class D31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();

        int b = sc.nextInt();

        if(a == 2 && b == 18 ){
            System.out.println("Special");
        }else if((a == 2 && b < 18) || (a < 2 && b > 0)){
            System.out.println("Before");
        }else if(a >= 2 && b > 0){
            System.out.println("After");
        }

        sc.close();
    }
}
