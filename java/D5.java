public class D5 {
    public static void main(String[] args) {

        System.out.println(D4.mom + " 나이 " + D4.age2);
        System.out.println(D4.son + " 나이 " + D4.age);
        System.out.println("두 사람의 나이의 값은?");

        //처음 짤떄 나이 합을 D4.age + D4.age2 가 실행하니 2249가 나와서 놀랐는데 아마도 문자열로 취급 된것 같다 ()넣으니 int로 취급해줬다
        System.out.println(D4.mom + " 와 " + D4.son + "의 나이에 합은" +" = "+ (D4.age + D4.age2));
    }
}
