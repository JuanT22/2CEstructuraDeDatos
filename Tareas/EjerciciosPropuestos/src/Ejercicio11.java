public class Ejercicio11 {
    public static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; this.next = null; }
    }

    public Node head;

    public Ejercicio11() {
        head = null;
    }

    public void addLast(int data) {
        Node nuevo = new Node(data);
        if (head == null) {
            head = nuevo;
        } else {
            Node curr = head;
            while (curr.next != null) curr = curr.next;
            curr.next = nuevo;
        }
    }

    public void removeFromPosition(int x, int n) {
        if (n <= 0 || head == null) return;

        if (x <= 1) {
            Node curr = head;
            int count = 0;
            while (curr != null && count < n) {
                curr = curr.next;
                count++;
            }
            head = curr;
            return;
        }

        Node prev = head;
        for (int i = 1; i < x - 1 && prev != null; i++) {
            prev = prev.next;
        }
        // Si no existe posición x, nada que hacer
        if (prev == null || prev.next == null) return;

        Node curr = prev.next;
        int count = 0;
        while (curr != null && count < n) {
            curr = curr.next;
            count++;
        }
        prev.next = curr;
    }

    /** Imprime la lista */
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
        Ejercicio11 lista = new Ejercicio11();
        for (int v : new int[]{10, 20, 30, 40, 50, 60, 70}) {
            lista.addLast(v);
        }

        System.out.print("Original:       ");
        lista.printList();  

        lista.removeFromPosition(2, 3);
        System.out.print("Después (x=2,n=3): ");
        lista.printList();  

        lista.removeFromPosition(1, 2);
        System.out.print("Después (x=1,n=2): ");
        lista.printList();  

        lista.removeFromPosition(2, 5);
        System.out.print("Después (x=2,n=5): ");
        lista.printList();  
    }
}
//By Juan Tacuri