public class Ejercicio4 {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;  

    public Ejercicio4() {
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

    public static Ejercicio4 merge(Ejercicio4 l1, Ejercicio4 l2) {
        Node p = l1.head;
        Node q = l2.head;
        Ejercicio4 result = new Ejercicio4();
        Integer lastAdded = null;

        while (p != null && q != null) {
            int candidate;
            if (p.data < q.data) {
                candidate = p.data;
                p = p.next;
            } else if (p.data > q.data) {
                candidate = q.data;
                q = q.next;
            } else { 
                candidate = p.data;
                p = p.next;
                q = q.next;
            }
            if (lastAdded == null || candidate != lastAdded) {
                result.addLast(candidate);
                lastAdded = candidate;
            }
        }

        while (p != null) {
            int candidate = p.data;
            p = p.next;
            if (lastAdded == null || candidate != lastAdded) {
                result.addLast(candidate);
                lastAdded = candidate;
            }
        }

        while (q != null) {
            int candidate = q.data;
            q = q.next;
            if (lastAdded == null || candidate != lastAdded) {
                result.addLast(candidate);
                lastAdded = candidate;
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
        Ejercicio4 lista1 = new Ejercicio4();
        lista1.addLast(1);
        lista1.addLast(3);
        lista1.addLast(5);
        lista1.addLast(7);

        Ejercicio4 lista2 = new Ejercicio4();
        lista2.addLast(2);
        lista2.addLast(3);
        lista2.addLast(6);
        lista2.addLast(8);

        System.out.print("Lista 1: ");
        lista1.printList();  

        System.out.print("Lista 2: ");
        lista2.printList();  

        Ejercicio4 fusion = Ejercicio4.merge(lista1, lista2);
        System.out.print("Fusión: ");
        fusion.printList(); 
    }
}
//By Juan Tacuri