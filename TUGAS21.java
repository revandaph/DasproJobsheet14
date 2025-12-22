import java.util.Scanner;

public class TUGAS21 {

    static int totalIteratif(int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total;
    }

    static int totalRekursif(int[] data, int index) {
        if (index == data.length) {
            return 0;
        }
        return data[index] + totalRekursif(data, index + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = input.nextInt();

        int[] angka = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        if (N > 0) {
            int totalLoop = totalIteratif(angka);
            int totalRekursi = totalRekursif(angka, 0);

            System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + totalLoop);
        } else {
            System.out.println("Tidak ada angka yang dihitung.");
        }

        input.close();
    }
}
