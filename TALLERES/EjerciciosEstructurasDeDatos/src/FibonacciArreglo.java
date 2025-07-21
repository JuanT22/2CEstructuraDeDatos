import java.util.Scanner;

public class FibonacciArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();

        int[] serie = new int[n];

        for (int i = 0; i < n; i++) {
            serie[i] = fib(i);
        }

        System.out.println("Serie Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(serie[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        sc.close();
    }
    
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
