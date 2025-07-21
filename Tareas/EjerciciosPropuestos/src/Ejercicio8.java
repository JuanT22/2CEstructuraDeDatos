public class Ejercicio8 {
    public static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; this.next = null; }
    }

    public Node head;  

    public Ejercicio8() {
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

    public void removeGreaterThan(int limit) {
        // Avanzar la cabeza mientras deba eliminarse
        while (head != null && head.data > limit) {
            head = head.next;
        }
        // Ahora head es null o su data <= limit
        Node prev = head;
        if (prev == null) return;
        Node curr = head.next;
        while (curr != null) {
            if (curr.data > limit) {
                // eliminar curr
                prev.next = curr.next;
                curr = prev.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
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
        Ejercicio8 lista = new Ejercicio8();
        int[] valores = {56, 36, 95, 13, 25, 69};
        for (int v : valores) {
            lista.addLast(v);
        }

        System.out.print("Antes:  ");
        lista.printList();  

        int limite = 43;
        lista.removeGreaterThan(limite);

        System.out.print("Después (límite=" + limite + "): ");
        lista.printList();  
    }
}
//By Juan Tacuri