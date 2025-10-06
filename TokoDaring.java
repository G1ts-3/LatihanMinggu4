import java.util.Scanner;

public class TokoDaring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nomorProduk = input.nextInt();
        int jumlah = input.nextInt();

        int hargaSatuan = 0;

        switch (nomorProduk) {
            case 1:
                hargaSatuan = 2980;
                break;
            case 2:
                hargaSatuan = 4500;
                break;
            case 3:
                hargaSatuan = 9980;
                break;
            case 4:
                hargaSatuan = 4490;
                break;
            case 5:
                hargaSatuan = 6870;
                break;
            default:
                System.out.println("Nomor produk tidak valid");
                input.close();
                return; 
        }

        // Hitung total harga
        int total = hargaSatuan * jumlah;

        // Tampilkan total harga
        System.out.println(total);

        input.close();
    }
}
