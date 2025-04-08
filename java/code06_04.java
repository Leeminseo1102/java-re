public class code06_04 {
    public static void main(String[] args) {
        for(int i=2; i<=20 ; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i=0; i<=20 ; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i=2; i <= 20 && i % 2 == 0 ; i+=2){ //초기값인 0이 i로 들어가고 조건식에서 0은 20보다 작고 2로 나눠지기에 실행 그후 증강식으로 가서 i는 1이 되고 조건이 안 맞으니 끝남
            System.out.print(i + " ");
        }
    }
}
