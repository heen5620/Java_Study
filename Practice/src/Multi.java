public class Multi {
    int a;
    int b;
    String message;

    public Multi() {
        message = "안녕하세요";
    }

    public Multi(int a, int b) {
        this.a = a;
        this.b = b;
        message = "두개의 매개변수가 존재합니다";
        System.out.println(a+","+b+message);
    }
    public Multi(int a, int b, String message) {
            this.a = a;
            this.b = b;
            this.message = message;
            System.out.println("모든 매개변수가 존재합니다");
    }
    public int calcMulti(){
            return a*b;
    }
    public static void main(String[] args) {
//      Multi multi1 = new Multi();
//      System.out.println(multi1.message);
//        Multi multi1 = new Multi(1,2);
//        System.out.println("두 수의 곱은 ? = " + multi1.calcMulti());
//        Multi multi3 = new Multi(1,2," "+ "시윤 ❤️ 중민");
//        System.out.println(multi3.calcMulti() + multi3.message);
//            Integer aa = new Integer(10);
//            Integer bb = new Integer(10);\
//        System.out.println("aa = " + aa);
//        System.out.println("bb = " + bb);
//        System.out.println(bb == aa); //false 가 나오는 이유는 서로 다른 객체이기 때문에 이건 주소값을 가리킴.
        String aa = new String("중민이바보");
        String bb = new String("중민이바보");
        System.out.println(aa.equals(bb)); //equals 는 주소를 가리키지 않고 내용을 가리키기 때문에 equals()를 사용한다
    }
}
