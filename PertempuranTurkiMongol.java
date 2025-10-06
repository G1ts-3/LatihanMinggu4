import java.util.Scanner;

public class PertempuranTurkiMongol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int turki = input.nextInt();
        int mongol = input.nextInt();

        
        int kekuatanTurki = turki * 3;
        int kekuatanMongol = mongol;

        
        if (kekuatanTurki > kekuatanMongol) {
            System.out.println("turki menang");
        } else if (kekuatanTurki < kekuatanMongol) {
            System.out.println("mongol menang");
        } else {
            System.out.println("imbang");
        }

    }
}
