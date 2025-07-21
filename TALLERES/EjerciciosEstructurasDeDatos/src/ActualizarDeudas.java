import java.io.*;

public class ActualizarDeudas {
    public static void main(String[] args) {
        String archivoEntrada = "C:\\Users\\juani\\OneDrive\\Desktop\\UTPL\\SEGUNDO CICLO\\ESTRUCTURA DE DATOS\\TALLERES\\ArchivosProgramas\\Deudas.txt";
        String archivoSalida = "C:\\Users\\juani\\OneDrive\\Desktop\\UTPL\\SEGUNDO CICLO\\ESTRUCTURA DE DATOS\\TALLERES\\ArchivosProgramas\\Deudas_actualizadas.txt";

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivoEntrada));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoSalida));

            String linea;
            while ((linea = lector.readLine()) != null) {
                String lineaModificada = linea.replaceAll("Central de Riesgo", "Liberado");
                escritor.write(lineaModificada);
                escritor.newLine();
            }

            lector.close();
            escritor.close();

            System.out.println("El archivo ha sido actualizado exitosamente.");
        } catch (IOException e) {
            System.err.println("Ocurrió un error al procesar el archivo: " + e.getMessage());
        }
    }
}
