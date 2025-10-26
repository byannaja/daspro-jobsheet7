package jobsheet7;
import java.util.Scanner;
public class tugas2_18 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPembayaran = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan = ");
            String jenis = sc.nextLine();

            if (jenis.equals("0")) break;

            System.out.print("Masukkan durasi parkir (jam) = ");
            int jam = sc.nextInt();
            sc.nextLine();

            int tarif = 0;
            if (jam > 5) {
                tarif = 12500;
            } else if (jenis.equalsIgnoreCase("mobil")) {
                tarif = 3000 * jam;
            } else if (jenis.equalsIgnoreCase("motor")) {
                tarif = 2000 * jam;
            } else {
                System.out.println("Jenis kendaraan tidak valid!\n");
                continue;
            }

            System.out.println("Total bayar: Rp " + tarif + "\n");
            totalPembayaran += tarif;
        }

        System.out.println("Total seluruh pembayaran parkir hari ini = Rp " + totalPembayaran);
        sc.close();
    }
}