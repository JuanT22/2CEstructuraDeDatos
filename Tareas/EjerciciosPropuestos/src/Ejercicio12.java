public class Ejercicio12 {
    public static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; this.next = null; }
    }

    public Node head;  

    public Ejercicio12() {
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

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public Ejercicio12[] splitAlternate() {
        // Si la lista está vacía o tiene un solo nodo:
        if (head == null) {
            return new Ejercicio12[]{ new Ejercicio12(), new Ejercicio12() };
        }
        if (head.next == null) {
            Ejercicio12 l1 = new Ejercicio12();
            l1.head = head;
            return new Ejercicio12[]{ l1, new Ejercicio12() };
        }

        Node head1 = head;
        Node head2 = head.next;
        Node p1 = head1;
        Node p2 = head2;

        while (p2 != null && p2.next != null) {
            p1.next = p2.next;  
            p1 = p1.next;        
            p2.next = p1.next;   
            p2 = p2.next;       
        }
        p1.next = null;

        Ejercicio12 list1 = new Ejercicio12();
        Ejercicio12 list2 = new Ejercicio12();
        list1.head = head1;
        list2.head = head2;
        return new Ejercicio12[]{ list1, list2 };
    }

// Ejemplo de uso
    public static void main(String[] args) {
        Ejercicio12 lista = new Ejercicio12();
        for (int v : new int[]{10, 20, 30, 40, 50, 60, 70}) {
            lista.addLast(v);
        }

        System.out.print("Original: ");
        lista.printList();  

        Ejercicio12[] partes = lista.splitAlternate();
        System.out.print("Lista 1 (índices impares):   ");
        partes[0].printList();  

        System.out.print("Lista 2 (índices pares):     ");
        partes[1].printList();  
    }
}
//By Juan Tacuri