public class tugas2 {
    public static void main(String[] args) {
        int saldoAwalmasuk = 1000000;  
        int Target = 1500000; 
        double bungaBulanan = 0.02; 

        int bulan = 0;
        while (saldoAwalmasuk < Target) {
            saldoAwalmasuk += saldoAwalmasuk * bungaBulanan;  
            bulan++;
        }
        System.out.println("--------------------------------------------------");
        System.out.println("anda mencapai 1.5 juta rupiah pada bulan ke-" + bulan);
        System.out.println("--------------------------------------------------");
    }
}
