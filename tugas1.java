public class tugas1 {
    public static void main(String[] args) {
        int tarifPerKg = 4500;
        double diskon = 0.05;

        String[] pelanggan = {"Ani", "Budi", "Bina", "Cita"};
        int[] berat = {4, 15, 6, 11};  

        int totalPendapatan = 0;

        for (int i = 0; i < pelanggan.length; i++) {
            int beratPakaian = berat[i]; 
            int biaya = tarifPerKg * beratPakaian;

            if (beratPakaian > 10) {
                double jumlahDiskon = biaya * diskon;
                biaya -= jumlahDiskon;
            }

            totalPendapatan += biaya;
            System.out.println("------------------------------------------");
            System.out.println("Pelanggan     : " + pelanggan[i]);
            System.out.println("Berat Pakaian : " + beratPakaian + " kg");
            System.out.println("Biaya         : Rp." + biaya);
        }
        System.out.println("------------------------------------------");
        System.out.println("Total Pendapatan Hari Ini: Rp. " + totalPendapatan);
    }
}
