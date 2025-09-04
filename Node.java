// Kelas Node merepresentasikan sebuah node dalam binary tree
public class Node {
    int data;       // Data yang disimpan dalam node
    Node left;      // Referensi ke anak kiri
    Node right;     // Referensi ke anak kanan

    // Konstruktor untuk membuat node dengan data tertentu
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // Metode untuk mengatur anak kiri
    public void setLeft(Node node) {
        this.left = node;
    }

    // Metode untuk mengatur anak kanan
    public void setRight(Node node) {
        this.right = node;
    }

    // Metode untuk mendapatkan anak kiri
    public Node getLeft() {
        return this.left;
    }

    // Metode untuk mendapatkan anak kanan
    public Node getRight() {
        return this.right;
    }

    // Metode untuk mendapatkan data yang disimpan dalam node
    public int getData() {
        return this.data;
    }

    // Metode untuk mengatur data yang disimpan dalam node
    public void setData(int data) {
        this.data = data;
    }

    // Metode untuk traversal pre-order
    public void printPreorder(Node node) {
        if (node == null) return; // Basis kasus: jika node null, berhenti
        System.out.print(node.data + " "); // Cetak data node
        printPreorder(node.left);  // Kunjungi anak kiri
        printPreorder(node.right); // Kunjungi anak kanan
    }

    // Metode untuk traversal in-order
    public void printInorder(Node node) {
        if (node == null) return; // Basis kasus: jika node null, berhenti
        printInorder(node.left);  // Kunjungi anak kiri
        System.out.print(node.data + " "); // Cetak data node
        printInorder(node.right); // Kunjungi anak kanan
    }

    // Metode untuk traversal post-order
    public void printPostorder(Node node) {
        if (node == null) return; // Basis kasus: jika node null, berhenti
        printPostorder(node.left);  // Kunjungi anak kiri
        printPostorder(node.right); // Kunjungi anak kanan
        System.out.print(node.data + " "); // Cetak data node
    }

    // Metode print untuk tree diagram
    public String print() {
        return this.print("",true,"");
    }

    public String print(String prefix, boolean isTail, String sb) {
        // Jika node saat ini memiliki anak kanan, cetak anak kanan terlebih dahulu
        if (right != null) {
            // Rekursif: panggil metode print untuk anak kanan
            // - prefix ditambahkan dengan "│   " jika ini bukan tail (node terakhir di levelnya), 
            //   atau "    " (spasi) jika ini adalah tail.
            // - Parameter isTail diatur ke false karena anak kanan bukan tail.
            right.print(prefix + (isTail ? "│   " : "    "), false, sb);
        }
    
        // Cetak node saat ini
        // - prefix adalah indentasi yang sudah dibangun.
        // - Jika ini adalah tail (node terakhir di levelnya), gunakan "└── ".
        // - Jika bukan tail, gunakan "┌── ".
        // - data adalah nilai dari node saat ini.
        System.out.println(prefix + (isTail ? "└── " : "┌── ") + data);
    
        // Jika node saat ini memiliki anak kiri, cetak anak kiri
        if (left != null) {
            // Rekursif: panggil metode print untuk anak kiri
            // - prefix ditambahkan dengan "    " (spasi) jika ini adalah tail,
            //   atau "│   " jika ini bukan tail.
            // - Parameter isTail diatur ke true karena anak kiri adalah tail.
            left.print(prefix + (isTail ? "    " : "│   "), true, sb);
        }
    
        // Kembalikan sb (StringBuilder) yang berisi hasil cetakan
        // Catatan: Pada implementasi ini, sb tidak benar-benar digunakan, 
        // karena kita langsung mencetak ke konsol menggunakan System.out.println.
        return sb;
    }
}