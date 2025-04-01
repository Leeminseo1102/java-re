import java.util.Scanner;

public class D19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //백준
        int unm = sc.nextInt();

        for (int i = 0; i < unm; i++) {
            System.out.println(unm + " * " + i + " = " + (unm * i));
        }
        sc.close();
    }
}
