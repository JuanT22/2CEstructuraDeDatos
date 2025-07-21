import java.util.Scanner;

public class GestionAsientosAvion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de filas (N): ");
        int N = sc.nextInt();
        System.out.print("Número de asientos por fila (M): ");
        int M = sc.nextInt();
        sc.nextLine(); 

        boolean[][] asientos = new boolean[N][M];

        boolean salir = false;
        while (!salir) {

            System.out.println("\n--- Menú de gestión de asientos ---");
            System.out.println("1. Mostrar estado de asientos");
            System.out.println("2. Reservar un asiento");
            System.out.println("3. Liberar un asiento");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción (1–4): ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mostrarAsientos(asientos);
                    break;
                case 2:
                    modificarAsiento(asientos, sc, true);
                    break;
                case 3:
                    modificarAsiento(asientos, sc, false);
                    break;
                case 4:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }

        sc.close();
    }

    public static void mostrarAsientos(boolean[][] asientos) {
        System.out.println("\nEstado de los asientos:");
        System.out.print("        ");
        for (int j = 0; j < asientos[0].length; j++) {
            System.out.printf(" %2d ", j + 1);
        }
        System.out.println();
        for (int i = 0; i < asientos.length; i++) {
            System.out.printf("Fila %2d:", i + 1);
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print("  " + (asientos[i][j] ? "X" : "O") + " ");
            }
            System.out.println();
        }
    }

    public static void modificarAsiento(boolean[][] asientos, Scanner sc, boolean ocupar) {
        String accion = ocupar ? "reservar" : "liberar";
        System.out.printf("\nIngrese la fila a %s: ", accion);
        int fila = sc.nextInt();
        System.out.printf("Ingrese el número de asiento a %s: ", accion);
        int asiento = sc.nextInt();

        if (fila < 1 || fila > asientos.length ||
            asiento < 1 || asiento > asientos[0].length) {
            System.out.println("¡Error! Fila o asiento fuera de rango.");
            return;
        }

        int i = fila - 1;
        int j = asiento - 1;

        if (ocupar) {
            if (asientos[i][j]) {
                System.out.println("Ese asiento ya está ocupado.");
            } else {
                asientos[i][j] = true;
                System.out.println("Asiento reservado con éxito.");
            }
        } else {
            if (!asientos[i][j]) {
                System.out.println("Ese asiento ya está libre.");
            } else {
                asientos[i][j] = false;
                System.out.println("Asiento liberado con éxito.");
            }
        }
    }
}
