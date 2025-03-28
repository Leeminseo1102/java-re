public class code04_13 {
    public static void main(String[] args) {
        String str = "   한글 ABCD efgh";
        String cutStr = "";
        String restr = "";
        boolean res;

        cutStr = str.trim();
        restr = str.replaceAll(" ", "");
        res = str.isEmpty();//is들어가면 거의 다 참이야 거짓이냐를 나타네는 암묵적인 룰
        boolean res2 =str.length() == 0;

        System.out.println(restr);
        System.out.println(res);
        System.out.println(res2);
        System.out.println(cutStr);
        System.out.println("기존 문자열===> [" + str +"]");
        System.out.println("공백 제거 ==> [" + cutStr +"]");
    }
}
