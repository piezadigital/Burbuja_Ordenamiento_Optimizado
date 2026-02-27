import java.util.Arrays;

public class BurbujaOptimizado {
    public static void burbujaMejorado(int[] arreglo) {
        int n = arreglo.length;
        int limite = n - 1;

        while (limite > 0) {
            int ultimaPosicionIntercambio = 0;
            for (int i = 0; i < limite; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    // Intercambio
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;
                    // Guardamos la última posición donde hubo intercambio
                    ultimaPosicionIntercambio = i;
                }
            }
            // Reducimos el límite hasta la última posición intercambiada
            limite = ultimaPosicionIntercambio;
        }
    }
    public static void main(String[] args) {
        int[] datos = {22,4,88,9,1,7,15,45,6,78,11,100,5};
        System.out.print("Arreglo original: ");
        System.out.println(Arrays.toString(datos));
        System.out.print("Arreglo ordenado: ");
        burbujaMejorado(datos);
        for (int num : datos) {
            System.out.print(num + " ");
        }
    }
}