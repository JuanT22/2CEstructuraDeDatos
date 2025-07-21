public class Ejercicio3 {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;  

    public Ejercicio3() {
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
        if (head == null) return 0.0;
        double sum = 0;
        int count = 0;
        for (Node curr = head; curr != null; curr = curr.next) {
            sum += curr.data;
            count++;
        }
        return sum / count;
    }

    public void removeMax() {
        if (head == null) return;

        int maxVal = head.data;
        for (Node curr = head.next; curr != null; curr = curr.next) {
            if (curr.data > maxVal) {
                maxVal = curr.data;
            }
        }

        if (head.data == maxVal) {
            head = head.next;
            return;
        }

        Node prev = head;
        Node curr = head.next;
        while (curr != null && curr.data != maxVal) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
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
        Ejercicio3 lista = new Ejercicio3();
        lista.addLast(7);
        lista.addLast(3);
        lista.addLast(9);
        lista.addLast(5);
        lista.addLast(9);

        System.out.print("Lista original: ");
        lista.printList();  

        lista.removeMax();
        System.out.print("Después de removeMax(): ");
        lista.printList();  

        lista.removeMax();
        System.out.print("Una segunda vez: ");
        lista.printList();  
    }
}
//By Juan Tacuri