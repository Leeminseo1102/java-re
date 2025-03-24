import java.util.Scanner;

public class D14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int scor = sc.nextInt();

        //백준
        if (90 <= scor){
            System.out.println("A");
        }else if (80 <= scor){
            System.out.println("B");
        }else if (70 <= scor){
            System.out.println("C");
        }else if (60 <= scor){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
