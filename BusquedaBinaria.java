package Lab02;

public class BusquedaBinaria {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        int buscado = 7;
        int resultado = busquedaBinaria(arr, buscado, 0, arr.length - 1);

        if (resultado != -1) {
            System.out.println("Elemento encontrado en el índice: " + resultado);
        } else {
            System.out.println("Elemento no encontrado en el arreglo.");
        }
    }

    private static int busquedaBinaria(int[] arr, int buscado, int inicio, int fin) {
        if (inicio > fin) {
            return -1;
        }
        int medio = inicio + (fin - inicio) / 2;
        if (arr[medio] == buscado) {
            return medio;
        }
        if (arr[medio] > buscado) {
            return busquedaBinaria(arr, buscado, inicio, medio - 1);
        }
        return busquedaBinaria(arr, buscado, medio + 1, fin);
    }
}