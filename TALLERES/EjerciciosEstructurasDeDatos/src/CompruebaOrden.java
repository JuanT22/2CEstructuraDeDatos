import java.util.Scanner;

public class CompruebaOrden {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Ingrese los " + n + " elementos:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        boolean ordenado = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ordenado = false;
                break;
            }
        }

        if (ordenado) {
            System.out.println("El arreglo está ordenado ascendentemente.");
        } else {
            System.out.println("El arreglo NO está ordenado ascendentemente.");
        }

        sc.close();
    }
}
