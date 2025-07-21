package arreglosc;

public class ArreglosC {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int opc;
        do{
            opc = metodos.menu();
            switch(opc){
//                case 1 -> metodos.leerCompleto();
//                case 1 -> metodos.insInicio();
                case 1 -> metodos.insOrden();
                case 2 -> metodos.presentar();
                case 3 -> metodos.buscar();
            }
        }while(opc != 0);
    }
}