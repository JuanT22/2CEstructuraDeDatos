public class Ejercicio1 {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head; 

    public Ejercicio1() {
        head = null;
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
        Ejercicio1 lista = new Ejercicio1();
        lista.addLast(1);
        lista.addLast(3);
        lista.addLast(5);

        System.out.print("Antes: ");
        lista.printList(); 

        lista.insertAfter(3, 4);

        System.out.print("Después: ");
        lista.printList();  

        lista.insertAfter(10, 99); 
    }
}
//By Juan Tacuri
