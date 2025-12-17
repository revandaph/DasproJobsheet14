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
