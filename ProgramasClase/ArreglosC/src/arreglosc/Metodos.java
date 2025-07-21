package arreglosc;

import java.util.Scanner;

public class Metodos {
    Scanner sc;
    int[] arreglo;
    int ev;
    public Metodos(){
        this.sc = new Scanner(System.in);
        this.arreglo = new int[8];
        this.ev = 0;
    }
    public int menu(){
        System.out.println("\n MENU PRINCIPAL");
        System.out.println("[1] Leer completo");
        System.out.println("[2] Insertar completo");
        System.out.println("[3] Presentar");
        System.out.println("[4] Buscar Datos");
        System.out.println("[5] Eliminar valor");
        System.out.println("[6] Insertar Ordenado");
        System.out.println("[7] Ordenar");
        System.out.println("[8] Buscar");
        System.out.println("[0] SALIR");
        return sc.nextInt();
    }
    public int leerDato(){
        System.out.print("Ingrese dato: ");
        return sc.nextInt();
    }
    public void leercompleto(){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = leerDato();
        }
        ev = arreglo.length;
    }
    public void presentar(){
        for (int i = 0; i < ev; i++) {
            System.out.print(arreglo[i] + " ");
            
        }
    }
    public int secuencial(int num){
        for (int i = 0; i < ev; i++) {
            if(num == arreglo[i])
                return i;
        }
        return -1;
    }
    public void buscar(){
        int num, resp;
        num = leerDato();
        resp = secuencial(num);
        if(resp != -1)
            System.out.println("El " + num + "esta en la poscion " + resp);
        else
            System.out.println("No existe el: " + num);
    }
    public void recorrerDer(int pos){
        for (int i = ev; i < pos; i++) {
            arreglo[i] = arreglo [i-1];
            
        }
    }
    public void insInicio(){
        if(ev < arreglo.length){
            recorrerDer(0);
            arreglo[0] = leerDato();
            ev++;
        }else{
            System.out.println("No hay espacio...");
        }
    }
    public void insertOrden(){
        if (ev < arreglo.length){
            int num = leerDato();
            int pos = 0;
            while((pos < ev) && (num > arreglo[pos]))
                pos++;
            recorrerDer(pos);
            arreglo[pos] = num;
            ev++;
        }else
            System.out.println("No hay espacio...");
    }
    public void recorrerIzq(int pos){
        for (int i = pos; i < ev-1; i++) {
            arreglo[i] = arreglo[i + 1];
        }
    }
    public void eliminarValor(){
        int num = leerDato();
        int resp;
        resp = secuencial(num);
        if(resp != 1){
            recorrerIzq(resp);
            ev --;
        }else
            System.out.println("No esta...");
    }
    public void burbuja(){
        int aux;
        for (int i = 0; i < ev-1; i++) {
            for (int j = i+1; j < ev; j++) {
                if (arreglo[i] > arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
    }
    public int binario(int num, int ini, int fin){
        if(ini<=fin){
            int medio =(ini+fin)/2;
            if( num == arreglo[medio])
                return medio;
            else if (num>arreglo[medio])
                return binario(num, medio+1, fin);
            else
                return binario(num,ini, medio-1);
        }else
            return -1;
    }
    
    public void buscar(){
        int num = leerDato();
        int pos = binario(num, 0, ev-1);
        if(pos != -1)
            System.out.println("Esta en ala posisicion "+pos);
        else
            System.out.println("No existe...");
    }
}