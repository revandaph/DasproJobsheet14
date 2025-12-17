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
