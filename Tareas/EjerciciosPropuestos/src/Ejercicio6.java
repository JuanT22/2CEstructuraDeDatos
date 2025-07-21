public class Ejercicio6 {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;  

    public Ejercicio6() {
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

    public void printReverseRecursive() {
        printReverseRecursive(head);
        System.out.println("null");
    }
    private void printReverseRecursive(Node node) {
        if (node == null) return;
        printReverseRecursive(node.next);
        System.out.print(node.data + " -> ");
    }

    public void printReverseStack() {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (Node curr = head; curr != null; curr = curr.next) {
            stack.push(curr.data);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " -> ");
        }
        System.out.println("null");
    }

// Ejemplo de uso
    public static void main(String[] args) {
        Ejercicio6 lista = new Ejercicio6();
        int[] valores = {10, 20, 30, 40, 50};
        for (int v : valores) lista.addLast(v);

        System.out.print("Lista normal:      ");
        lista.printList();                

        System.out.print("Reversa (recursión): ");
        lista.printReverseRecursive(); 

        System.out.print("Reversa (pila):      ");
        lista.printReverseStack();       
    }
}
//By Juan Tacuri