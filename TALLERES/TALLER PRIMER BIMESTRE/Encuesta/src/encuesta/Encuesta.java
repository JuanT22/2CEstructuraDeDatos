package encuesta;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Encuesta {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\juani\\OneDrive\\Desktop\\UTPL\\SEGUNDO CICLO\\ESTRUCTURA DE DATOS\\TALLERES\\TALLER PRIMER BIMESTRE\\Encuesta\\src\\encuesta\\miEncuesta.txt";
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("¿Cuántos estudiantes tomarán la encuesta?");
            int numEstudiantes = scanner.nextInt();
            scanner.nextLine();

            try (PrintWriter writer = new PrintWriter(new FileWriter(ruta, true))) {
                for (int i = 0; i < numEstudiantes; i++) {
                    System.out.println("Estudiante " + (i + 1));
                    System.out.println("¿Ingrese su cédula?");
                    String cedula = scanner.nextLine();
                    writer.println(cedula);
                    System.out.println("¿Cuál es el nombre de su profesor?");
                    String profesor = scanner.nextLine();
                    writer.println(profesor);
                    System.out.println("¿En cuántas asignaturas está matriculado actualmente?");
                    String asignaturas = scanner.nextLine();
                    writer.println(asignaturas);
                    System.out.println("¿Qué tema(s) tiene dificultad en la asignatura de estructuras de datos?");
                    String temas = scanner.nextLine();
                    writer.println(temas);
                }
            }

            ArrayList<String> lineas = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    lineas.add(linea);
                }
            }

            System.out.println("Datos ingresados:");
            for (String linea : lineas) {
                System.out.println(linea);
            }

            String[] miEncuesta = lineas.toArray(new String[0]);

            System.out.println("Recorrido del arreglo:");
            for (String elemento : miEncuesta) {
                System.out.println(elemento);
            }

        } catch (IOException e) {
            System.out.println("Error al manejar el archivo: " + e.getMessage());
        }
    }
}