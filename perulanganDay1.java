import java.util.Scanner;

public class perulanganDay1 {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String nim = SC.nextLine();

        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        int n = nim.length(); 
        System.out.println("Nilai N = " + n);

        for (int i = 0; i < n; i++) {
            System.out.print(hari[i % 7] + " ");
        }

        System.out.println();
    }
}
