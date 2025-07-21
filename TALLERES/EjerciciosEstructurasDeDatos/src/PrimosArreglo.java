import java.util.Scanner;

public class PrimosArreglo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();

        int[] primos = new int[n];
        for (int i = 0; i < n; i++) {
            primos[i] = primoEn(i);
        }

        System.out.println("Arreglo de primos:");
        for (int i = 0; i < n; i++) {
            System.out.print(primos[i] + (i < n-1 ? ", " : ""));
        }
        System.out.println();
        sc.close();
    }

    public static int primoEn(int n) {
        if (n == 0) {
            return 1;
        }
        int contador = 1;      
        int candidato = 2;     
        while (contador < n) {
            candidato++;
            if (esPrimo(candidato)) {
                contador++;
            }
        }
        return candidato;
    }

    public static boolean esPrimo(int x) {
        if (x < 2) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;
        int raiz = (int)Math.sqrt(x);
        for (int i = 3; i <= raiz; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
