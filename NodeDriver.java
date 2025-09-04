public class NodeDriver {
    public static void main(String[] args) {
        // Membuat node-node untuk membangun tree
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        // Membangun struktur tree
        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node5.setLeft(node7);
        node3.setRight(node6);

        // Menampilkan hasil traversal
        System.out.println("In-order traversal:");
        root.printInorder(root);
        System.out.println();

        System.out.println("Post-order traversal:");
        root.printPostorder(root);
        System.out.println();

        System.out.println("Pre-order traversal:");
        root.printPreorder(root);
        System.out.println();

        System.out.println();
        root.print();
    }
}