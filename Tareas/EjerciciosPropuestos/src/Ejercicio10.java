public class Ejercicio10 {
    public static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; this.next = null; }
    }

    public Node head;  
    public Ejercicio10() {
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

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
        System.out.println();
    }

    public void bubbleSort() {
        if (head == null || head.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            Node curr = head;
            while (curr.next != null) {
                if (curr.data > curr.next.data) {
                    int tmp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = tmp;
                    swapped = true;
                }
                curr = curr.next;
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        Ejercicio10 lista = new Ejercicio10();
        int[] valores = {4, 2, 5, 1, 3};
        for (int v : valores) lista.addLast(v);

        System.out.print("Antes de bubbleSort: ");
        lista.printList();  

        lista.bubbleSort();

        System.out.print("Después de bubbleSort: ");
        lista.printList();  
    }
}
//By Juan Tacuri