package Lab02;

public class Invertir {

    public static void main(String[] args) {
        System.out.print(invertir(234324, index(234324)));
        // System.out.print(234324%100);

    }

    public static int invertir(int n, int c) {
        if (n < 10) {
            return n;
        }
        return (n % 10) * (int) (Math.pow(10, c - 1)) + invertir(n / 10, c - 1);
    }

    public static int index(int n) {

        if (n == 0) {
            return 1;
        }
        int contador = 0;
        while (n != 0) {
            n = n / 10;
            contador++;
        }
        return contador;
    }
}