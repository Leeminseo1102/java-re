import java.util.Scanner;

public class D9 {
    public static void main(String[] ages){

        Scanner sc = new Scanner(System.in);

        System.out.println("내가  공부를 잘하고 있는걸까? (맞아/아니야)");
        //answer 사용자가 입력한 값을 변수로 지정한다
        String answer = sc.nextLine().trim();

        if(answer.equals("맞아")){
            System.out.println("그러치 그걸 너의 걸로 만들어");

        } else if(answer.equals("아니야")){
            System.out.println("자신감을 챙겨 친구");
        } else{
            System.out.println("뭐라는거야 제대로 적어");
        }
        sc.close();
    }
}
