package Lab02;

public class Palindromo {
    public static void main(String[] args) {
        System.out.println(palindromo("radar"));
        System.out.println(palindromo("perro"));
    }

    public static boolean palindromo(String word) {
        boolean b = false;

        if (word.length() < 2) {
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            word = word.substring(1, word.length() - 2);
            palindromo(word);
            return true;
        } else {
            b = false;
        }
        return b;
    }
}