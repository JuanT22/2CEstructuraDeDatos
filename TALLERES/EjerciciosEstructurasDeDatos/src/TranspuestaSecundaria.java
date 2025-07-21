import java.util.Random;
import java.util.Scanner;

public class TranspuestaSecundaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Ingrese el tamaño N de la matriz cuadrada: ");
        int N = sc.nextInt();

        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = rnd.nextInt(99) + 1;
            }
        }

        System.out.println("\nMatriz Original:");
        imprimirMatriz(A);


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i + j < N - 1) {
                    int ii = N - 1 - j;
                    int jj = N - 1 - i;
                    int tmp = A[i][j];
                    A[i][j] = A[ii][jj];
                    A[ii][jj] = tmp;
                }
            }
        }

        System.out.println("\nMatriz Traspuesta sobre la diagonal secundaria:");
        imprimirMatriz(A);

        sc.close();
    }

    public static void imprimirMatriz(int[][] M) {
        for (int[] fila : M) {
            for (int val : fila) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }
}
