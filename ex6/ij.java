public class ij {
    public static void main(String[] args) {

        MyMath mm = new MyMath();

        long result1 = mm.add(5L,3L);
        long result2 = mm.subtract(5L,3L);
        long result3 = mm.multiply(5L,3L);
        double result4  = mm.divide(5l,3L);
        long result5 = mm.max(39l,5l);
        mm.printgugu(12);
        mm.add2(99,3);


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }
}
class MyMath {

    void printgugu(int dan){
        for(int i =1;i <=9;i++){
            System.out.println(dan * i);
        }
    }
    void add2(int a, int b){
        System.out.println(a+b);
    }
    long add(long a,long b){
        return a + b;
    }
    long max(long a , long b){
        if (a > b){
            return a;
        }
        else{
            return b;
        }
    }
    long subtract(long a,long b){ return a - b;}
    long multiply(long a,long b) {return a * b;}
    double divide(double a,double b) { return a/b;}
}
