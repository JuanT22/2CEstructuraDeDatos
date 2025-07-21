public class Ejercicio7 {
    public static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; this.next = null; }
    }

    public Node head;  

    public Ejercicio7() {
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

    public int checkOrder() {
        if (head == null || head.next == null) {
            return 1;
        }
        boolean asc = true;
        boolean desc = true;
        Node curr = head;
        while (curr.next != null) {
            if (curr.data > curr.next.data) {
                asc = false;
            }
            if (curr.data < curr.next.data) {
                desc = false;
            }
            curr = curr.next;
        }
        if (asc) {
            return 1;
        } else if (desc) {
            return 2;
        } else {
            return 0;
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

    public static void main(String[] args) {
        Ejercicio7 l1 = new Ejercicio7();
        for (int v : new int[]{1, 2, 2, 4, 5}) l1.addLast(v);
        System.out.print("L1: "); l1.printList();
        System.out.println("Orden L1: " + l1.checkOrder());

        Ejercicio7 l2 = new Ejercicio7();
        for (int v : new int[]{9, 7, 7, 3, 0}) l2.addLast(v);
        System.out.print("L2: "); l2.printList();
        System.out.println("Orden L2: " + l2.checkOrder());

        Ejercicio7 l3 = new Ejercicio7();
        for (int v : new int[]{1, 3, 2, 4}) l3.addLast(v);
        System.out.print("L3: "); l3.printList();
        System.out.println("Orden L3: " + l3.checkOrder());
    }
}
//By Juan Tacuri