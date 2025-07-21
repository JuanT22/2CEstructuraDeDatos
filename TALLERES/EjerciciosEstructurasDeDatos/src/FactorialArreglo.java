public class FactorialArreglo {
    public static void main(String[] args) {
        
        // Definir el arreglo A con 10 números
        int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        long[] B = new long[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = factorial(A[i]);
        }

        System.out.println("Arreglo A y sus factoriales en arreglo B:");
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "] = " + A[i] + ", B[" + i + "] = " + B[i]);
        }
    }
    
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
