package jobsheet7;
import java.util.Scanner;
public class tugas1_18 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTiket = 0;
        double totalPendapatan = 0;
        final double hargaTiket = 50000;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli = ");
            int jml = sc.nextInt();

            if (jml == 0) break;
            if (jml < 0) {
                System.out.println("Jumlah tiket tidak valid!\n");
                continue;
            }

            double diskon = 0;
            if (jml > 10)
                diskon = 0.15;
            else if (jml > 4)
                diskon = 0.10;

            double total = jml * hargaTiket * (1 - diskon);
            System.out.println("Total harga = Rp " + total + "\n");

            totalTiket += jml;
            totalPendapatan += total;
        }

        System.out.println("=== REKAP PENJUALAN ===");
        System.out.println("Total tiket terjual = " + totalTiket);
        System.out.println("Total pendapatan = Rp " + totalPendapatan);
        sc.close();
    }
}