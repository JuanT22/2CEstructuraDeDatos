import java.util.Random;

public class EstadisticasNotas {

    public static void main(String[] args) {
        final int NUM_ALUMNOS   = 20;
        final int NUM_ASIGNATURAS = 4;
        double[][] notas = new double[NUM_ALUMNOS][NUM_ASIGNATURAS];
        Random rnd = new Random();

        for (int i = 0; i < NUM_ALUMNOS; i++) {
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                notas[i][j] = Math.round(rnd.nextDouble() * 10 * 100.0) / 100.0;
            }
        }

        double[] mediaAlumno = new double[NUM_ALUMNOS];
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            double suma = 0;
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                suma += notas[i][j];
            }
            mediaAlumno[i] = suma / NUM_ASIGNATURAS;
        }

        double[] mediaAsignatura = new double[NUM_ASIGNATURAS];
        for (int j = 0; j < NUM_ASIGNATURAS; j++) {
            double suma = 0;
            for (int i = 0; i < NUM_ALUMNOS; i++) {
                suma += notas[i][j];
            }
            mediaAsignatura[j] = suma / NUM_ALUMNOS;
        }

        double sumaTotal = 0;
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            sumaTotal += mediaAlumno[i];
        }
        double mediaClase = sumaTotal / NUM_ALUMNOS;

        System.out.println("Notas generadas (alumno x asignatura):");
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.printf("Alumno %2d: ", i);
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                System.out.printf("%5.2f", notas[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMedias por alumno:");
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.printf("  Alumno %2d → %.2f%n", i, mediaAlumno[i]);
        }

        System.out.println("\nMedias por asignatura:");
        for (int j = 0; j < NUM_ASIGNATURAS; j++) {
            System.out.printf("  Asignatura %d → %.2f%n", j, mediaAsignatura[j]);
        }

        System.out.printf("%nMedia de toda la clase: %.2f%n", mediaClase);
    }
}
