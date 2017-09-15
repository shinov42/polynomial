import java.util.Scanner;

public class poly {

    private static int pow(int x, int i) {
        int res = 1;
        for (int k = i; k > 0; k--) {
            res *= x;
        }
        return (res);
    }

    public static void summ(int[] a, int[] b) {
        for (int i = 0; i < 5; i++) {
            a[i] += b[i];
        }
        print(a);
    }

    public static void minus(int[] a, int[] b) {
        for (int i = 0; i < 5; i++) {
            a[i] -= b[i];
        }
        print(a);
    }

    public static void division_minus(int[] a, int[] b) {
        for (int i = 0; i < 5; i++) {
            a[i] -= b[i];
        }
    }

    public static void multiple(int[] a, int[] b) {
        int c[] = new int [25];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int temp = i + j;
                c[temp] += a[i] * b[j];
            }
        }
        print(c);
    }

    public static void multiple_div(int[] b, int c, int[] temp, int deg) {
        for (int i = 0; i < 5; i++) {
            if ((i + deg) < 5)
                temp[i + deg] = b[i] * c;
        }
    }

    public static void division(int[] a, int[] b, int param) {
        int maxA = 0;
        int maxB = 0;
        int maxC = 0;
        int[] c = new int[5];
        int[] temp = new int[5];
        for (int i = 4; i >= 0; i--) {
            if (b[i] != 0) {
                maxB = i;
                break;
            }
        }
        do {

            for (int i = 4; i >= 0; i--) {
                if (a[i] != 0) {
                    maxA = i;
                    break;
                }
            }
            maxC = maxA - maxB;
            c[maxC] = a[maxA] / b[maxB];
            multiple_div(b, c[maxC], temp, maxC);
            division_minus(a, temp);
        }
        while (maxC > 0);
        if (param == 1) {
            System.out.print(c[0] + "x^" + 0);
            for (int i = 1; i < c.length; i++) {
                System.out.print("+" + c[i] + "x^" + i);
            }
            System.out.println();
        } else {
            System.out.println("Остаток от деления:" + a[0]);
        }
    }

    public static void equal(int[] a, int[] b) {
        boolean f = true;
        for (int i = 0; i < 5; i++)
            if (a[i] != b[i]) {
                f = false;
                break;
            }
        if (f)
            System.out.println("Полиномы равны");
        else System.out.println("Полиномы не равны");
    }

    public static void solve(int[] a, int x) {
        int res = 0;
        for (int i = 0; i < 5; i++) {
            res += a[i] * pow(x, i);
        }
        System.out.println("Результат:");
        System.out.println(res);
    }

    public static void print(int[] mass) {
        System.out.println("Результат:");
        System.out.print(mass[0] + "x^" + 0);
        for (int i = 1; i < mass.length; i++) {
            System.out.print("+" + mass[i] + "x^" + i);
        }
        System.out.println();
    }

    public static void get(int[] mass) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите коэффициенты:");
        for (int i = 0; i < 5; i++) {
            mass[i] = scan.nextInt();
        }
    }
    public static int get_x(int x) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение х:");
        x = scan.nextInt();
        return x;
    }
}