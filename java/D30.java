import java.util.Scanner;

public class D30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
                                                    //all은 하나만 바꿀때

        String result = (a + b).toLowerCase().replaceAll(" ","");
        System.out.println(result);
        sc.close();
    }
}
