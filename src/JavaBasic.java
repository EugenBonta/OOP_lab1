import java.lang.Math;

public class JavaBasic {
    public static void main(String[] args) {
        int n = 8;
        long time;
        long startTime;

        startTime = System.nanoTime();
        fibIterative(n);
        time = System.nanoTime() - startTime;
        System.out.println(n + "th Fibonacci term is: " + fibIterative(n));
        System.out.println("process time in nano sec iterative function = " + time);
        System.out.println("___---___---___---___---___");

        startTime = System.nanoTime();
        fibRecursive(n);
        time = System.nanoTime() - startTime;
        System.out.println(n + "th Fibonacci term is: " + fibRecursive(n));
        System.out.println("process time in nano sec using recursive function = " + time);
        System.out.println("___---___---___---___---___");

        startTime = System.nanoTime();
        fibFormula(n);
        time = System.nanoTime() - startTime;
        System.out.println(n + "th Fibonacci term is: " + fibFormula(n));
        System.out.println("process time in nano sec using formula function = " + time);
        System.out.println("___---___---___---___---___");

        startTime = System.nanoTime();
        fibFormula2(n);
        time = System.nanoTime() - startTime;
        System.out.println(n + "th Fibonacci term is: " + fibFormula2(n));
        System.out.println("process time in nano sec using formula2 function = " + time);
        System.out.println("___---___---___---___---___");

        Car toyota = new Car("Toyota", "Black", 8000, 2012, 180_000, false);
        Car renault = new Car("Renault", "Red", 6000, 2021, 15_000, true);
        toyota.showCar();
        renault.showCar();
    }

    static long fibIterative(int nr) {
        long a = 0;
        long b = 1;
        for (int i = 0; i < nr; i++) {
            b = a + b;
            a = b - a;
        }
        return a;
    }

    static int fibRecursive(int nr) {
        if (nr <= 1)
            return nr;
        return fibRecursive(nr - 1) + fibRecursive(nr - 2);
    }

    static double fibFormula(int nr) {
        double ratio = 1.618034;
        double a;
        a = (Math.pow(ratio, nr) - (Math.pow(1 - ratio, nr))) / Math.sqrt(5);
        return Math.round(a);
    }

    static double fibFormula2(int nr) {
        int i = 1;
        int j = 0;
        int k = 0;
        int h = 1;
        while (nr > 0) {
            int t;
            if (nr % 2 == 1) {
                t = j * h;
                j = i * h + j * k + t;
                i = i * k + t;
                nr--;
            }
            t = h * h;
            h = 2 * k * h + t;
            k = k * k + t;
            nr = nr / 2;
        }
        return j;
    }
}
