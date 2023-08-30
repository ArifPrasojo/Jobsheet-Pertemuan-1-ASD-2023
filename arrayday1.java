public class arrayday1 {
    public static void main(String[] args) {
        int[][] stok = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int[] hargaBunga = {75000, 50000, 60000, 10000};

        int[] totalStokPerBunga = hitungTotalStokPerBunga(stok);
        tampilkanTotalStokPerBunga(totalStokPerBunga);

        int[] penguranganStok = {-1, -2, 0, -5};
        kurangiStok(stok, penguranganStok);

        int totalPendapatan = hitungTotalPendapatan(stok[0], hargaBunga);
        tampilkanTotalPendapatan(totalPendapatan);
    }

    public static int[] hitungTotalStokPerBunga(int[][] stok) {
        int[] totalStokPerBunga = new int[stok[0].length];
        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                totalStokPerBunga[j] += stok[i][j];
            }
        }
        return totalStokPerBunga;
    }

    public static void tampilkanTotalStokPerBunga(int[] totalStokPerBunga) {
        System.out.println("A. Jumlah Stock berdasarkan jenis bunganya di seluruh Cabang:");
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

        for (int i = 0; i < totalStokPerBunga.length; i++) {
            System.out.println(jenisBunga[i] + ": " + totalStokPerBunga[i]);
        }
    }

    public static void kurangiStok(int[][] stok, int[] penguranganStok) {
        
        for (int i = 0; i < penguranganStok.length; i++) {
            stok[0][i] += penguranganStok[i];
        }
    }

    public static int hitungTotalPendapatan(int[] stok, int[] hargaBunga) {
        int totalPendapatan = 0;
        for (int i = 0; i < hargaBunga.length; i++) {
            totalPendapatan += hargaBunga[i] * stok[i];
        }
        return totalPendapatan;
    }

    public static void tampilkanTotalPendapatan(int totalPendapatan) {
        System.out.println("\nB. Total pendapatan dari RoyalGarden 1 jika semua bunga terjual habis:");
        System.out.println("Total Pendapatan : Rp" + totalPendapatan);
    }
}
