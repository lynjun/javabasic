package ex6;

class e6_27 {
    public static void main(String[] args) {
        System.out.println(Mymath2.add(250l,100l)); // 클래스메서드(static메서드) : 호출 객체 생성 없이 호출 가능
        Mymath2 mm = new Mymath2(); // 인스턴스(객체) 생성 !객체는 iv(인스턴스변수) 묶음!
        mm.a = 200l; // <- 참조 변수
        mm.b = 300l;
        System.out.println(mm.add()); //인스턴스메서드 호출



    }
}
class Mymath2{
    long a,b; // <- iv 인스턴스 변수
    long add(){
        return a+b;
    }
    static long add(long a, long b){  // 클래스메서드 (static메서드)<- long a, long b =  lv 지역변수  /매개변수는 입력값/

        return a + b;
    }
}
