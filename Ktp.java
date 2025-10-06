import java.util.Scanner;

public class Ktp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: umur dan status fasih berbahasa Java
        int umur = input.nextInt();
        boolean fasih = input.nextBoolean();

        // Syarat: umur minimal 10 tahun dan fasih berbahasa Java
        boolean dapatKTP = (umur >= 10 && fasih);

        // Output hasil boolean
        System.out.println(dapatKTP);

        input.close();
    }
}
