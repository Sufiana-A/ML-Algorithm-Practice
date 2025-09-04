public class Recursive {
   // Metode untuk menghitung a^n secara rekursif
   public static int power(int a, int n) {
       if (n == 0) {
           return 1; // Basis kasus: a^0 = 1
       } else {
           return a * power(a, n - 1); // Rekursif: a^n = a * a^(n-1)
       }
   }

   // Metode utama untuk menguji fungsi power
   public static void main(String[] args) {
       int a = 2;
       int n = 3;
       System.out.println(a + " pangkat " + n + " adalah: " + power(a, n));
   }
}