package combinado;
import java.util.Scanner;

public class Metodos {
    public Metodos(int lim){
        this.sc = new Scanner(System.in);
        this.aula = new Alumno(lim);
        this.ev = 0;
    }
    
    public int menu(){
        System.out.println("\n[1] Insertar en arreglo : ");
        System.out.println("[2] Recorrer arreglo: ");
        System.out.println("[3] Generar lista: ");
        System.out.println("[4] Reporte chicas que aprueban: ");
        System.out.println("[5] Reporte chicos que aprueban: ");
        System.out.println("[0] Salir: ");
        return sc.nextInt();
    }
    
    public Alumno leerDato(){
        int Id;
        String nombre;
        char sexo;
        float[] notas = new float[3];
        System.out.println("Ingrese el Id: ");
        Id = sc.nextInt();
        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese sexo: ");
        sexo = sc.next().charAt(0);
        System.out.println("Ingrese primera calificaion: ");
        notas[0] = sc.nextFloat;
        System.out.println("Ingrese segunda calificacion: ");
        notas[1] = sc.nextFloat;
        System.out.println("Ingrese tercera calificacion: ");
        notas[2] = sc.nextFloat;
        Alumno nuevo = new Alumno(Id,nombre,sexo,notas);
        return nuevo;
    }
    
    public void insertarArreglo(){
        if(ev < aula.lenght){
            aula[ev] = leerDato();
            ev++;
        }else   
            System.out.println("Aula llena...");
    }
    
    public void recorrerArreglo(){
        for(int i=0; i<ev; i++){
            System.out.println("Id: "+aula[i].Id+"Nombre: "+aula[i].nombre);
        }
    }
    
    public boolean nodoVacio(Nodo actual){
        return actual == null;
    }
    
    public void insertar(int Id, String nombre, char sexo, float promedio){
        Nodo nuevo = new Nodo(Id,nombre,sexo,promedio);
        if(nodoVacio(head)){
            head = nuevo;
            tail = nuevo;
        }else{
            tail.sig = nuevo;
            tail = nuevo;
        }
    }
    
    public void generarLista(){
        if(ev != 0){
            for(int i=0; i<ev; i++){
                insertar(aula[i].Id.aula[i].nombre.aula[i].sexo.aula[i].getPromedio());
            }
        }else
            System.out.println("No hay datos...");
    }
    
    public void reporte(char sexo){
        if(!nodoVacio(head)){
            Nodo actual = head;
            while(!nodoVacio(actual)){
                if((actual.sexo == sexo)&&(actual.promedio >= 7))
                    System.out.println("Nombre: "+actual.nombre
                            +"APROBADO/A con "+actual.promedio);
            }
        }else
            System.out.println("No hay datos...");
    }
}   
