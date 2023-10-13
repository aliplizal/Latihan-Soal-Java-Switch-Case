import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String tujuan = input.next().toLowerCase();
        int jumlahPenumpang = input.nextInt();
        int harga = 0;
        int total;

        switch (tujuan) {
            case "jakarta":
                harga = 145_000;
                break;
            case "bogor":
                harga = 200_000;
                 if (jumlahPenumpang > 2) {
                    harga = (harga * 9) / 10;
                }
                break;
            case "garut":
                harga = 75_000;
                break;
            case "purwakarta":
                harga = 75_000;
                break;
        }

            total = jumlahPenumpang * harga;
            System.out.println(total);

    }
}
