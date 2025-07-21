import java.util.HashMap;
import java.util.HashSet;

public class Ejercicio5 {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;  

    public Ejercicio5() {
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

    public Ejercicio5 getRepeatedElements() {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (Node curr = head; curr != null; curr = curr.next) {
            freq.put(curr.data, freq.getOrDefault(curr.data, 0) + 1);
        }

        Ejercicio5 result = new Ejercicio5();
        HashSet<Integer> added = new HashSet<>();
        for (Node curr = head; curr != null; curr = curr.next) {
            int v = curr.data;
            if (freq.get(v) > 1 && !added.contains(v)) {
                result.addLast(v);
                added.add(v);
            }
        }
        return result;
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
        Ejercicio5 L = new Ejercicio5();
        int[] valores = {5, 2, 7, 2, 5, 5, 1};
        for (int v : valores) L.addLast(v);

        System.out.print("L: ");
        L.printList();  

        Ejercicio5 R = L.getRepeatedElements();
        System.out.print("R (repetidos): ");
        R.printList();  
    }
}
//By Juan Tacuri
