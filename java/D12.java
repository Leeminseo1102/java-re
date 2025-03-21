import java.util.Scanner;

public class D12 {
    public static void main(String [] ages){
        Scanner sc = new Scanner(System.in);

        //백준

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int result1 = (A + B) % C;

        int result2 = ((A % C) + (B % C)) % C;

        int result3 = (A * B) % C;

        int result4 = ((A % C) * (B % C)) % C;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);


        sc.close();
    }
}



