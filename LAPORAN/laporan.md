# 💻 Jobsheet 7 – PERULANGAN 1
Politeknik Negeri Malang  
Mata Kuliah: Dasar Pemrograman  
Tahun: 2025  
Nama : Muhammad Abyan Andhi Putra
Absen: 18
---

##  Percobaan 1 – FOR

### Pertanyaan dan Jawaban

1. **Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!**  
   **Jawaban:**  
   - Inisialisasi: `int i = 1`  
   - Kondisi: `i <= 10`  
   - Update: `i++`  

2. **Mengapa variabel `tertinggi` diinisialisasi 0 dan `terendah` diinisialisasi 100? Apa yang terjadi jika kebalikannya?**  
   **Jawaban:**  
   Karena nilai awal 0 dan 100 digunakan agar proses perbandingan bisa berjalan benar. Jika dibalik, maka nilai tertinggi dan terendah tidak akan sesuai hasil sebenarnya.

3. **Jelaskan fungsi dan alur kerja dari potongan kode perulangan!**  
   **Jawaban:**  
   Perulangan meminta input nilai sebanyak 10 kali, lalu setiap nilai dibandingkan dengan nilai sebelumnya untuk menentukan yang tertinggi dan terendah.

4. **Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa mahasiswa yang lulus dan tidak lulus berdasarkan batas kelulusan (nilai minimal 60).**  
   **Jawaban:**  
   Tambahkan kondisi berikut:
   ```java
   if (nilai >= 60)
       lulus++;
   else
       tidakLulus++;
    ```

#  Percobaan 2 – Studi Kasus Nilai Mahasiswa di SIAKAD (Perulangan WHILE)

##  Pertanyaan dan Jawaban



### 1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
a. `nilai < 0 || nilai > 100`  
b. `continue`  

**Jawaban:**  
a. Kondisi `nilai < 0 || nilai > 100` digunakan untuk memeriksa apakah nilai yang dimasukkan tidak valid, yaitu 0–100. Jika kondisi ini benar, maka input akan diabaikan.  
b. `continue` berfungsi untuk melewati sisa perintah dalam satu iterasi dan langsung melanjutkan ke iterasi berikutnya dari perulangan WHILE.


### 2. Mengapa sintaks `i++` dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?  

**Jawaban:**  
`i++` diletakkan di akhir karena proses input dan pemeriksaan nilai dilakukan terlebih dahulu.  
Jika `i++` ditulis di awal, maka nilai penghitung `i` akan bertambah sebelum proses input dilakukan, sehingga jumlah perulangan akan berkurang satu kali dari seharusnya.


### 3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?  

**Jawaban:**  
Perulangan WHILE akan berjalan sebanyak 19 kali, karena kondisi berhenti adalah `i < jml`, yang berarti perulangan akan terus dijalankan hingga `i` mencapai nilai 19.


### 4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan “Bagus, pertahankan nilainya”!  

**Jawaban:**  
Tambahkan kondisi berikut setelah pengecekan nilai huruf:  
```java
if (nilai > 80) {
    System.out.println("Nilai huruf: A");
    System.out.println("Bagus, pertahankan nilainya!");
} else if (nilai > 73) {
    System.out.println("Nilai huruf: B+");
} else if (nilai > 65) {
    System.out.println("Nilai huruf: B");
} else if (nilai > 60) {
    System.out.println("Nilai huruf: C+");
} else if (nilai > 50) {
    System.out.println("Nilai huruf: C");
} else if (nilai > 39) {
    System.out.println("Nilai huruf: D");
} else {
    System.out.println("Nilai huruf: E");
}
```
#  Percobaan 3 – Studi Kasus Transaksi di Kafe (Perulangan DO-WHILE)

##  Pertanyaan dan Jawaban


### 1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah “batal”, maka berapa kali perulangan dilakukan?  
**Jawaban:**  
Perulangan tetap dilakukan 1 kali, karena struktur `do-while` selalu menjalankan blok perintah minimal satu kali sebelum melakukan pengecekan kondisi di bagian `while`.


### 2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!  
**Jawaban:**  
Kondisi berhenti adalah ketika nama pelanggan yang dimasukkan bernilai `"batal"`, sehingga program menjalankan perintah `break;` untuk keluar dari perulangan.


### 3. Apa fungsi dari penggunaan nilai `true` pada kondisi DO-WHILE?  
**Jawaban:**  
Kata `true` digunakan agar perulangan berjalan tanpa batas sampai ditemukan kondisi penghentian.  
program terus menerima input sampai pengguna mengetik `"batal"`.


### 4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?  
**Jawaban:**  
Karena perulangan dikontrol menggunakan kondisi `true` dan perintah `break`, bukan dengan variabel penghitung seperti pada `for` atau `while`.  
Proses berhenti hanya jika syarat penghentian terpenuhi.