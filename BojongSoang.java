import java.util.Scanner;

public class BojongSoang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input curah hujan: "tinggi" atau "rendah"
        String curah = input.nextLine();

        // Jika curah hujan tinggi, maka Moch Toha banjir -> Bojongsoang macet
        if (curah.equalsIgnoreCase("tinggi")) {
            System.out.println("macet");
        } else {
            System.out.println("tidak macet");
        }

        input.close();
    }
}
