package Rekursif;

import java.util.Scanner;

public class Percobaan2 {

    static int HitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            System.out.print(x + "x");
            return (x*HitungPangkat(x, y-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();

        System.out.print ("Hasil: ");
        int hasil= HitungPangkat(bilangan, pangkat);
        System.out.println(" = " + hasil);
    }
}

/* PERTANYAAN PERCOBAAN 2

1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, 
pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() 
secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan 
dijalankan! 
    = Pemanggilan fungsi rekursif HitungPangkat(x, y) akan terus dilakukan selama nilai y belum bernilai 0.
    Setiap kali fungsi dipanggil, nilai y akan dikurangi satu (y - 1), sehingga proses perhitungan berjalan secara bertahap.
    Pemanggilan fungsi akan berhenti ketika nilai y sama dengan 0. Pada kondisi ini, fungsi tidak lagi memanggil dirinya sendiri
    dan langsung mengembalikan nilai 1. Kondisi tersebut disebut sebagai kondisi dasar (base case) yang berfungsi untuk menghentikan proses rekursi.
    Jika kondisi dasar ini tidak dibuat, maka fungsi akan terus memanggil dirinya sendiri tanpa henti dan dapat menyebabkan kesalahan pada program,
    seperti stack overflow.

2. Tambahkan kode program untuk mencetak deret perhitungan pangkatnya. Contoh: 
hitungPangkat(2,5) dicetak 2x2x2x2x2x1 = 32. Done

*/