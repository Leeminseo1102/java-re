import java.util.Scanner;

public class D47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int outputRowNum = sc.nextInt();
        for (int rowNum = 1; rowNum < outputRowNum +1; rowNum++) {
            for(int blank = outputRowNum - 1; blank > rowNum -1; blank--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= rowNum; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
//        for (int i = 0; i < n ; i++) {
//            for (int j = 1 ; j <= n; j++) {
//                if(n > i-1) {
//
//                    System.out.print("X");
//                } else
//
//            }
//            for (int j = i; j < n; j++) {
//
//                System.out.print("*");
//
//            }
//            System.out.println();
//
//        }
//        sc.close();
//    }