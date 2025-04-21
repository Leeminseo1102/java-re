public class D43 {
    public static void main(String[] args) {

        for(int a = 10; a >= 0; a--) {

            while (true) {
                System.out.print("숫자를 입력해주세요 (0 입력시 종료): ");


                if (a == 0) {
                    System.out.println("a 가 0이라서 종료");
                    break;
                }

                a--;

                System.out.println(a + "를 입력하셨습니다. while문 반복");
            }
        }

    }
}

