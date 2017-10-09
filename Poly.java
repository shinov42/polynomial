public class Poly {

    int size;
    int coeff[] = new int[size];

    public static void summ(int[] a, int[] b, int N, int[] c) {
        for (int i = 0; i < N; i++) {
            c[i] = a[i] + b[i];
        }
        return;
    }

    public static void minus(int[] a, int[] b, int N, int[] c) {
        for (int i = 0; i < N; i++) {
            c[i] = a[i] - b[i];
        }
        return;
    }

    public static void multiple(int[] a, int[] b, int N, int[] c) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int temp = i + j;
                c[temp] += a[i] * b[j];
            }
        }
        return;
    }

    public static boolean equal(int[] a, int[] b, int N) {
        boolean f = true;
        for (int i = 0; i < 5; i++)
            if (a[i] != b[i]) {
                f = false;
                break;
            }
        return f;
    }

    private static int pow(int x, int i) {
        int res = 1;
        for (int k = i; k > 0; k--) {
            res *= x;
        }
        return res;
    }

    public static int solve(int[] a, int x, int N) {
        int res = 0;
        for (int i = 0; i < N; i++) {
            res += a[i] * pow(x, i);
        }
        return res;
    }

    private static void divisionMinus(int[] a, int[] b) {
        for (int i = 0; i < 5; i++) {
            a[i] -= b[i];
        }
    }

    private static void multipleDiv(int[] b, int c, int[] temp, int deg) {
        for (int i = 0; i < 5; i++) {
            if ((i + deg) < 5)
                temp[i + deg] = b[i] * c;
        }
    }

    public static void division(int[] a, int[] b, int N, int[] c, int[] leftover) {
        int maxA = -1, maxB = -1, maxC = 0;
        int[] t = new int[N];
        t = a.clone();
        int[] temp = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            if (b[i] != 0) {
                maxB = i;
                break;
            }
        }
        if (maxB != -1) {
            do {
                for (int i = N - 1; i >= 0; i--) {
                    if (t[i] != 0) {
                        maxA = i;
                        break;
                    }
                }
                if (maxA != -1) {
                    maxC = maxA - maxB;
                    c[maxC] = t[maxA] / b[maxB];
                    multipleDiv(b, c[maxC], temp, maxC);
                    divisionMinus(t, temp);
                }
            }
            while (maxC > 0);
            leftover[0] = t[0];
        }
    }
}