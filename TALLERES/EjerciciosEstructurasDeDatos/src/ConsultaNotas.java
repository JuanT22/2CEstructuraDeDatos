import java.util.Scanner;

public class ConsultaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos alumnos hay? ");
        int numAlumnos = sc.nextInt();
        System.out.print("¿Cuántos cursos hay? ");
        int numCursos = sc.nextInt();
        sc.nextLine();

        String[] alumnos = new String[numAlumnos];
        for (int i = 0; i < numAlumnos; i++) {
            System.out.printf("Nombre del alumno %d: ", i+1);
            alumnos[i] = sc.nextLine().trim();
        }

        String[] cursos = new String[numCursos];
        for (int j = 0; j < numCursos; j++) {
            System.out.printf("Nombre del curso %d: ", j+1);
            cursos[j] = sc.nextLine().trim();
        }

        int[][] notas = new int[numAlumnos][numCursos];
        for (int i = 0; i < numAlumnos; i++) {
            for (int j = 0; j < numCursos; j++) {
                System.out.printf("Nota de %s en %s: ", alumnos[i], cursos[j]);
                notas[i][j] = sc.nextInt();
                while (notas[i][j] < 0 || notas[i][j] > 10) {
                    System.out.print("  Nota inválida, introduce un valor entre 0 y 10: ");
                    notas[i][j] = sc.nextInt();
                }
            }
        }

        System.out.println("\nLista de alumnos (índice : nombre):");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.printf("  %d : %s%n", i, alumnos[i]);
        }
        System.out.println("Lista de cursos (índice : nombre):");
        for (int j = 0; j < numCursos; j++) {
            System.out.printf("  %d : %s%n", j, cursos[j]);
        }

        System.out.print("\nIntroduce el índice del alumno a consultar: ");
        int idxAlumno = sc.nextInt();
        System.out.print("Introduce el índice del curso a consultar: ");
        int idxCurso  = sc.nextInt();

        if (idxAlumno >= 0 && idxAlumno < numAlumnos
         && idxCurso  >= 0 && idxCurso  < numCursos) {
            System.out.printf(
                "%s tiene %d en %s%n",
                alumnos[idxAlumno],
                notas[idxAlumno][idxCurso],
                cursos[idxCurso]
            );
        } else {
            System.out.println("Índice de alumno o curso fuera de rango.");
        }

        sc.close();
    }
}
