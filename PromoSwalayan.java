import java.util.Scanner;

public class PromoSwalayan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] poin = new int[5];
        for (int i = 0; i < 5; i++) {
            poin[i] = input.nextInt();
        }

        int totalAwal = poin[0] + poin[1] + poin[2];
        int totalAkhir = poin[2] + poin[3] + poin[4];

        boolean dapatCashback = false;
        boolean dapatDiskon = false;

        if (totalAwal == totalAkhir) {
            dapatCashback = true;
        }

        int totalLain = poin[1] + poin[2] + poin[3];
        int faktor = poin[0] + poin[4];

        if (faktor != 0 && totalLain % faktor == 0) {
            dapatDiskon = true;
        }

        if (dapatCashback) {
            System.out.println("cashback");
        }
        if (dapatDiskon) {
            System.out.println("diskon");
        }
        if (!dapatCashback && !dapatDiskon) {
            System.out.println("");
        }

    }
}
