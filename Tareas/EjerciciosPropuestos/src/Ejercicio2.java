public class Ejercicio2 {
    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;  

    public Ejercicio2() {
        head = null;
    }

    public void addLast(int data) {
        Node nuevo = new Node(data);
        if (head == null) {
            head = nuevo;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = nuevo;
        }
    }

    public void insertAfter(int target, int newData) {
        Node curr = head;
        while (curr != null && curr.data != target) {
            curr = curr.next;
        }
        if (curr != null) {
            Node nuevo = new Node(newData);
            nuevo.next = curr.next;
            curr.next = nuevo;
        } else {
            System.out.println("Valor " + target + " no encontrado en la lista.");
        }
    }

    public double average() {
        if (head == null) {
            return 0.0;
        }
        double sum = 0.0;
        int count = 0;
        Node curr = head;
        while (curr != null) {
            sum += curr.data;
            count++;
            curr = curr.next;
        }
        return sum / count;
    }

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

// Ejemplo de uso
    public static void main(String[] args) {
        Ejercicio2 lista = new Ejercicio2();
        lista.addLast(10);
        lista.addLast(20);
        lista.addLast(30);
        lista.addLast(40);

        System.out.print("Lista: ");
        lista.printList();               
        System.out.println("Promedio: " + lista.average());  

        Ejercicio2 vacia = new Ejercicio2();
        System.out.println("Promedio lista vacía: " + vacia.average()); 
    }
}
//By Juan Tacuri