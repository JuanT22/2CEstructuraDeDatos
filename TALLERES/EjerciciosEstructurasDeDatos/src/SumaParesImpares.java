import java.util.Scanner;

public class SumaParesImpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de elementos (n): ");
        int n = sc.nextInt();

        int[] L = new int[n];
        System.out.println("Ingrese los " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print("L[" + i + "] = ");
            L[i] = sc.nextInt();
        }

        int sumaPares = 0;
        int sumaImpares = 0;
        for (int x : L) {
            if (x % 2 == 0) {
                sumaPares += x;
            } else {
                sumaImpares += x;
            }
        }

        System.out.println("\nResultado:");
        System.out.println("Suma de los números pares   = " + sumaPares);
        System.out.println("Suma de los números impares = " + sumaImpares);

        sc.close();
    }
}
