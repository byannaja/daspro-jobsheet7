package jobsheet7;
import java.util.Scanner;

public class SiakadFor18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");

           
            String input = sc.nextLine();

            try {
                nilai = Double.parseDouble(input);

                if (nilai > tertinggi)
                    tertinggi = nilai;
                if (nilai < terendah)
                    terendah = nilai;

                if (nilai >= 60)
                    lulus++;
                else
                    tidakLulus++;
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid, ulangi mahasiswa ke-" + i);
                i--; 
            }
        }

        System.out.println("\nNilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
        sc.close();
    }
}
