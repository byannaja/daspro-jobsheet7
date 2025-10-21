package jobsheet7;
import java.util.Scanner;

public class SiakadFor18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int i = 1;
        while (i <= 10) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input.nextDouble();
            if (nilai > tertinggi)
                tertinggi = nilai;
            if (nilai < terendah)
                terendah = nilai;
            i++;
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}
