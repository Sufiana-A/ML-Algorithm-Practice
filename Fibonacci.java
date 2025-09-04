public class Fibonacci {
    // Metode untuk menghitung bilangan Fibonacci secara rekursif
    public static int fibonacci(int x) {
        if (x < 2) {
            return 1; // Basis kasus: Fibonacci(0) = 1, Fibonacci(1) = 1
        } else {
            return fibonacci(x - 1) + fibonacci(x - 2); // Rekursif: Fibonacci(x) = Fibonacci(x-1) + Fibonacci(x-2)
        }
    }

    // Metode utama untuk menguji fungsi fibonacci
    public static void main(String[] args) {
        int x = 7;
        System.out.println("Fibonacci ke-" + x + " adalah: " + fibonacci(x));
    }
}