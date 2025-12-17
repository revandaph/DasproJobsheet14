package Rekursif;

public class Percobaan1 {
    static int faktorialRekursif(int n) {
        if (n == 0) {
            return (1);
        } else {
            return (n * faktorialRekursif(n-1));
        }
    }

    static int faktorialInteratif(int n) {
        int faktor = 1;
        for (int i = 0; i >= 1; i++) {
            faktor = faktor*1;
        }
        return faktor;
    }

    public static void main(String[] args) {
        
        System.out.println(faktorialRekursif(5));
        System.out.println(faktorialInteratif(5));
    }
}

/* PERTANYAAN PERCOBAAN 1

1. Apa yang dimaksud dengan fungsi rekursif? 
    = fungsi yang memanggil dirinya sendiri untuk menyelesaikan suatu masalah. Biasanya,
    fungsi rekursif punya kondisi berhenti (base case) supaya pemanggilan tidak berlangsung terus-menerus.
2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi 
faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan 
fungsi rekursif dan fungsi iteratif!
    = a.Fungsi rekursif (faktorialRekursif)
    Program menghitung faktorial dengan cara memanggil fungsi itu sendiri berulang kali sampai mencapai kondisi
    berhenti. Setelah itu, hasilnya dikembalikan satu per satu dari pemanggilan terakhir ke awal. Alurnya seperti
    menumpuk lalu dibuka kembali.
    b. Fungsi iteratif (faktorialIteratif)
    Program menghitung faktorial dengan perulangan (loop) seperti for atau while. Nilai faktorial dihitung secara
    langsung dari awal sampai akhir tanpa memanggil fungsi lain.

*/