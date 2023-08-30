import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n : ");
        int n = scanner.nextInt();

        int hitungAngka = 0;
        int nomor = 2;

        while (hitungAngka < n) {
            if (nomor % 4 != 0) {
                System.out.print(nomor + (hitungAngka< n - 1 ? ", " : ""));
                hitungAngka++;
            }
            nomor += 2;
        }

        System.out.println();
    }
}
