import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GimnasioDescuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos clientes inscritos hay? ");
        int numClientes = sc.nextInt();
        sc.nextLine(); 
        String[] clientes = new String[numClientes];
        for (int i = 0; i < numClientes; i++) {
            System.out.print("Nombre del cliente " + (i+1) + ": ");
            clientes[i] = sc.nextLine().trim();
        }

        boolean[][] asistencia = new boolean[numClientes][6];

        System.out.println("\nRegistra asistencia (s = si, n = no):");
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        for (int i = 0; i < numClientes; i++) {
            System.out.println("\nCliente: " + clientes[i]);
            for (int d = 0; d < 6; d++) {
                System.out.print("  ¿Asistió el " + dias[d] + "? (s/n): ");
                char r = sc.next().toLowerCase().charAt(0);
                asistencia[i][d] = (r == 's');
            }
        }

        List<String> conDescuento = new ArrayList<>();
        for (int i = 0; i < numClientes; i++) {
            int cuenta = 0;
            for (int d = 0; d < 6; d++) {
                if (asistencia[i][d]) cuenta++;
            }
            if (cuenta >= 3) {
                conDescuento.add(clientes[i]);
            }
        }

        System.out.println("\nClientes con 20% de descuento (>= 3 asistencias):");
        if (conDescuento.isEmpty()) {
            System.out.println("  Ninguno.");
        } else {
            for (String nombre : conDescuento) {
                System.out.println("  - " + nombre);
            }
        }

        sc.close();
    }
}
