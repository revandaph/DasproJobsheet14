package Rekursif;

import java.util.Scanner;

public class Percobaan2 {

    static int HitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x*HitungPangkat(x, y-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();

        System.out.println(HitungPangkat(bilangan, pangkat));
    }
}
