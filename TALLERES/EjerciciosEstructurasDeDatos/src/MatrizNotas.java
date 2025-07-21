import java.util.Scanner;

public class MatrizNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de cursos (columnas): ");
        int numCursos = sc.nextInt();

        System.out.print("Introduce el número de alumnos por curso (filas): ");
        int numAlumnos = sc.nextInt();

        int[][] notas = new int[numAlumnos][numCursos];

        for (int fila = 0; fila < numAlumnos; fila++) {
            for (int col = 0; col < numCursos; col++) {
                System.out.printf("Nota del alumno %d en el curso %d: ", fila + 1, col + 1);
                notas[fila][col] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz de notas:");
        System.out.print("      ");
        for (int col = 0; col < numCursos; col++) {
            System.out.printf(" C%d ", col + 1);
        }
        System.out.println();

        for (int fila = 0; fila < numAlumnos; fila++) {
            System.out.printf("A%d  | ", fila + 1);
            for (int col = 0; col < numCursos; col++) {
                System.out.printf(" %d  ", notas[fila][col]);
            }
            System.out.println();
        }

        sc.close();
    }
}