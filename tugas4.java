import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("+===============================+");
            System.out.println("|Menu:                          |");
            System.out.println("|1. Luas Segitiga               |");
            System.out.println("|2. Luas Persegi Panjang        |");
            System.out.println("|3. Luas Lingkaran              |");
            System.out.println("|4. Keluar                      |");
            System.out.println("|Pilih :                        |");
            System.out.println("+===============================+");
            int Pilihan = scanner.nextInt();
            double luas;
            if (Pilihan == 4) {
                System.out.println("Keluar dari program.");
                break;
            }

            switch (Pilihan) {
                case 1:
                    luas = hitungLuasSegitiga();
                    System.out.println("Luas Segitiga: " + luas);
                    break;
                case 2:
                    luas = hitungLuasPersegiPanjang();
                    System.out.println("Luas Persegi Panjang: " + luas);
                    break;
                case 3:
                    luas = hitungLuasLingkaran();
                    System.out.println("Luas Lingkaran: " + luas);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
    
    public static double hitungLuasSegitiga() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input alas segitiga : ");
        double alas = scanner.nextDouble();
        System.out.print("Input tinggi segitiga : ");
        double tinggi = scanner.nextDouble();
        return 0.5 * alas * tinggi;
    }

    public static double hitungLuasLingkaran() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inputjari-jari lingkaran : ");
        double jariJari = scanner.nextDouble();
       return Math.PI * jariJari * jariJari;
    }

      public static double hitungLuasPersegiPanjang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input panjang persegi panjang : ");
        double panjang = scanner.nextDouble();
        System.out.print("Input lebar persegi panjang : ");
        double lebar = scanner.nextDouble();
        return panjang * lebar;
    }
}
