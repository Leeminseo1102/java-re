import java.util.Scanner;

    public class D11{
        public static void main(String[] args) {

            //백준
            Scanner scanner = new Scanner(System.in);


            int buddhistYear = scanner.nextInt();


            int gregorianYear = buddhistYear - 543;


            System.out.println(gregorianYear);


            scanner.close();
        }
    }


