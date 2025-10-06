import java.util.Scanner;

public class PositifNegatif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positif = 0;
        int negatif = 0;

        // Input 4 bilangan bulat
        for (int i = 0; i < 4; i++) {
            int bil = input.nextInt();
            if (bil > 0) {
                positif++;
            } else if (bil < 0) {
                negatif++;
            }
        }

        // Output: jumlah bilangan positif dan negatif
        System.out.println(positif + " " + negatif);

        input.close();
    }
}
