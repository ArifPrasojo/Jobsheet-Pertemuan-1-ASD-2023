public class fungsiDay1{
    public static void main(String[] args) {
        int n = 10;
        
        System.out.println("Deret Fibonacci menggunakan perulangan:");
        for (int i = 0; i < n; i++) {
            System.out.print(perulangan(i) + " ");
        }
        
        System.out.println("\n\nDeret Fibonacci menggunakan rekursi:");
        for (int i = 0; i < n; i++) {
            System.out.print(perulangan(i) + " ");
        }
    }

    public static int perulangan(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int prev = 0;
        int current = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }

    public static int Recursive(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return Recursive(n - 1) + Recursive(n - 2);
    }
}