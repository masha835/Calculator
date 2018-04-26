public class Calculator {

    public static void main(String args[]) {
        int a = 5;
        int b = 6;
        double r = 6.0;
        double p = 7.0;

        System.out.println(sum(a,b));

        System.out.println(minus(a,b));

        System.out.println(multi(a,b));

        System.out.println(division(r,p));
        System.out.println(power(r,p));
        System.out.println(prosent(r));
    }

    static int sum(int x, int y) {
       return (x+y);

    }
    static int minus(int c, int d) {
        return (c-d);
    }
    static int multi(int g,int z) {
        return (g*z);
    }

    static double division(double m, double q) {
        return (m/q);
    }
    static double power(double k, double l) {
    return Math.pow (k,l);
    }
    static double prosent(double e) {
        return (e/100);

    }
    /*int ab() {
        return (int) 0;
    }

    short bc() {
        return (short) 0;
    }

    String qz(int a) {
        return "" + a;
    }

    Integer fs(String s) {
        return 7;
    }*/
}
