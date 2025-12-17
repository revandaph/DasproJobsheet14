package Rekursif;

import java.util.Scanner;

public class Percobaan3 {
    static double HitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * HitungLaba(saldo, tahun - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah saldo awal: ");
        int saldoAwal = sc.nextInt();
        System.out.print("Lamanya investasi (tahun): ");
        int tahun = sc.nextInt();

        System.out.print("Jumlah saldo setelah " + " tahun: ");
        System.out.print(HitungLaba(saldoAwal, tahun));
    }
}

/* PERTANYAAN PERCOBAAN 3

1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” 
dan “recursion call”! 
    base case => if (tahun == 0) { return saldo;}
    recrusion call => return (1.11 * HitungLaba(saldo, tahun - 1));

2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika 
diberikan nilai hitungLaba(100000,3)
    HitungLaba(100000, 0) = 100000

    HitungLaba(100000, 1)
    = 1.11 × 100000
    = 111000

    HitungLaba(100000, 2)
    = 1.11 × 111000
    = 123210

    HitungLaba(100000, 3)
    = 1.11 × 123210
    = 136763.1


*/
