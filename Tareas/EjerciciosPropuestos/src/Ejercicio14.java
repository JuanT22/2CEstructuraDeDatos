public class Ejercicio14 {
    public static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public Node root;

    public Ejercicio14() {
        this.root = null;
    }

    public void buildExampleTree() {
        root = new Node(1);
        root.left  = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
    }

    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        int leftH  = height(node.left);
        int rightH = height(node.right);
        return 1 + Math.max(leftH, rightH);
    }

    public int height() {
        return height(root);
    }

    public static void main(String[] args) {
        Ejercicio14 tree = new Ejercicio14();
        tree.buildExampleTree();

        System.out.println("Altura del árbol: " + tree.height());
    }
}
//By Juan Tacuri