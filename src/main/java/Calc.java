public class Calc {
    int sum (int a, int b) {
        int s = a+b;
        System.out.println("если сложить будет " +s);
        return s;
        }

    int razn(int a, int b){
        int r = a-b;
        System.out.println("разность равна " +r);
        return r;
    }
    int umn(int a, int b){
        int u = a*b;
        System.out.println("если умножить будет " + u);
        return u;
    }
    int del(int a, int b){
        int d = a/b;
        System.out.println("если разделить будет " + d);
        return d;
    }
    int per(int a){
        int p = a*4;
        System.out.println("периметр нашего квадрата " +p);
        return p;
    }
}
