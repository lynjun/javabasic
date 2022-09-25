//  생성자
// 생성자가 하나도 없을 때만, 컴파일러가 기본 생성자 자동 추가

package ex6;
class Data_1{
    int value;  // 생성자가 하나도 없기 때문에 기본 생정자 자동 추가
}
class Data_2{
    int value;
    Data_2() {} // 생성자가 하나 있으므로 자동 추가 되지 않았으므로 기본 생성자를 추가해줘야함
    Data_2(int x){
        value = x;
    }
}
class ch6_33 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2();
    }
}
