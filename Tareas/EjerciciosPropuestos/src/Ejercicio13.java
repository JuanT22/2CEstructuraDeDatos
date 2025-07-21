import java.util.HashSet;

public class Ejercicio13 {
    public static class Node {
        int data;
        Node next;
        Node(int data) { 
            this.data = data; 
            this.next = null; 
        }
    }

    public Node head;  

    public Ejercicio13() {
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

    public void removeDuplicates() {
        HashSet<Integer> seen = new HashSet<>();
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            if (seen.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                seen.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
    }

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
        System.out.println();
    }

// Ejemplo de uso
    public static void main(String[] args) {
        Ejercicio13 lista = new Ejercicio13();
        for (int v : new int[]{5, 2, 7, 2, 5, 5, 1}) {
            lista.addLast(v);
        }

        System.out.print("Antes:    ");
        lista.printList();  

        lista.removeDuplicates();

        System.out.print("Después:  ");
        lista.printList();  
    }
}
//By Juan Tacuri
