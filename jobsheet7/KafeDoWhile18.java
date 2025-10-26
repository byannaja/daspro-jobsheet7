package jobsheet7;
import java.util.Scanner;
public class KafeDoWhile18 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                break;
            }

            System.out.print("Jumlah kopi: ");
            int kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            int teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            int roti = sc.nextInt();

            int total = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga untuk " + namaPelanggan + ": Rp " + total + "\n");

            sc.nextLine(); 
        } while (true);

        System.out.println("Transaksi selesai.");
        sc.close();
    }
}

    

