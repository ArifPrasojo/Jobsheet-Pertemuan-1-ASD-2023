import java.util.Scanner;

public class pemilihanDay1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas (0-100): ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS (0-100): ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan nilai UAS (0-100): ");
        double nilaiUAS = input.nextDouble();

        double nilaiAkhir = (0.2 * nilaiTugas) + (0.35 * nilaiUTS) + (0.45 * nilaiUAS);
        String status;
        String nilaiHuruf;

        if (nilaiAkhir >= 100) {
            nilaiHuruf = "A";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 80) {
            nilaiHuruf = "B+";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "C+";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "D";
            status = "ANDA TIDAK LULUS";
        } else {
            nilaiHuruf = "E";
            status = " ANDA TIDAK LULUS";
        }
        
        System.out.println("---------------------------");
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("Keterangan : " + status);
        System.out.println("---------------------------");

        input.close();
    }
}