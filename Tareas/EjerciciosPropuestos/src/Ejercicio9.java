public class Ejercicio9 {
    public static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; this.next = null; }
    }

    public Node head;  

    public Ejercicio9() {
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
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next; 
            curr.next = prev;       
            prev = curr;            
            curr = next;            
        }
        head = prev; 
    }

// Ejemplo de uso
    public static void main(String[] args) {
        Ejercicio9 lista = new Ejercicio9();
        int[] valores = {1,2,3,4}; 
        for (int v : new int[]{1,2,3,4}) lista.addLast(v);

        System.out.print("Original: "); 
        lista.printList();

        lista.reverse();

        System.out.print("Invertida: "); 
        lista.printList();
    }
}
//By Juan Tacuri