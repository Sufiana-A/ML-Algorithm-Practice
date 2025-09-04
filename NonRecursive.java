public class NonRecursive {
    // Metode untuk menghitung a^n secara iteratif (non-rekursif)
    public static int power(int a, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= a; // Kalikan a sebanyak n kali
        }
        return result;
    }

    // Metode utama untuk menguji fungsi power
    public static void main(String[] args) {
        int a = 2;
        int n = 3;
        System.out.println(a + " pangkat " + n + " adalah: " + power(a, n));
    }
}