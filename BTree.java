public class BTree {
    private Node root;
    private Node currentNode;

    // Konstruktor untuk membuat BTree dengan root null
    public BTree() {
        root = null;
    }

    // Metode untuk mencari data di tree
    public boolean search(int data) {
        return search(root, data);
    }

    // Metode rekursif untuk mencari data di tree
    private boolean search(Node node, int data) {
        if (node == null) {
            return false; // Basis kasus: jika node null, kembalikan false
        }
        if (node.getData() == data) {
            return true; // Data ditemukan
        }
        // Cari di subtree kiri
        if (search(node.getLeft(), data)) {
            return true;
        }
        // Cari di subtree kanan
        return search(node.getRight(), data);
    }

    // Metode untuk mencetak tree secara in-order
    public void printInorder() {
        if (root != null) {
            root.printInorder(root);
        }
    }

    // Metode untuk mencetak tree secara pre-order
    public void printPreorder() {
        if (root != null) {
            root.printPreorder(root);
        }
    }

    // Metode untuk mencetak tree secara post-order
    public void printPostorder() {
        if (root != null) {
            root.printPostorder(root);
        }
    }

    // Metode untuk mendapatkan root
    public Node getRoot() {
        return root;
    }

    // Metode untuk mengecek apakah tree kosong
    public boolean isEmpty() {
        return root == null;
    }

    // Metode untuk menghitung jumlah node di tree
    public int countNodes() {
        return countNodes(root);
    }

    // Metode rekursif untuk menghitung jumlah node di tree
    private int countNodes(Node node) {
        if (node == null) {
            return 0; // Basis kasus: jika node null, kembalikan 0
        }
        // Hitung node di subtree kiri dan kanan, tambahkan 1 untuk node saat ini
        return 1 + countNodes(node.getLeft()) + countNodes(node.getRight());
    }

    // Metode untuk mencetak struktur tree secara visual
    public void print() {
        if (root != null) {
            root.print();
        }
    }

    // Metode untuk mendapatkan current node
    public Node getCurrent() {
        return currentNode;
    }

    // Metode untuk mengatur current node
    public void setCurrent(Node node) {
        this.currentNode = node;
    }

    // Metode untuk mengatur root
    public void setRoot(Node root) {
        this.root = root;
    }
}