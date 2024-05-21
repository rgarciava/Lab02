package Lab02;

public class IsOrdered {
    public static void main(String[] args) {
        int numero1 = 6754321;
        int numero2 = 1234567;
        System.out.println(
                "El número " + numero1 + " está ordenado de forma decreciente: " + isOrdenadoDescending(numero1));
        System.out.println(
                "El número " + numero1 + " está ordenado de forma creciente: " + isOrdenadoIncreasing(numero1));
        System.out.println(
                "El número " + numero2 + " está ordenado de forma decreciente: " + isOrdenadoDescending(numero2));
        System.out.println(
                "El número " + numero2 + " está ordenado de forma creciente: " + isOrdenadoIncreasing(numero2));

    }

    public static boolean isOrdenadoDescending(int n) {
        if (n < 10) {
            return true;
        }
        int ultimoDigito = n % 10;
        int resto = n / 10;
        int penultimoDigito = resto % 10;
        return (penultimoDigito >= ultimoDigito) && isOrdenadoDescending(resto);
    }

    public static boolean isOrdenadoIncreasing(int n) {
        if (n < 10) {
            return true;
        }
        int ultimoDigito = n % 10;
        int resto = n / 10;
        int penultimoDigito = resto % 10;
        return (penultimoDigito <= ultimoDigito) && isOrdenadoIncreasing(resto);
    }
}
