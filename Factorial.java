public class Factorial {
    // Metode untuk menghitung faktorial secara rekursif
    public static int factorial(int n) {
        if (n == 1) {
            return 1; // Basis kasus: 1! = 1
        }
        return n * factorial(n - 1); // Rekursif: n! = n * (n-1)!
    }

    // Metode utama untuk menguji fungsi factorial
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Faktorial dari " + n + " adalah: " + factorial(n));
    }
}