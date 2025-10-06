import java.util.Scanner;

public class BuburAyam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 6000;

        boolean suwiran = input.nextBoolean(); 
        boolean cakue = input.nextBoolean();   
        boolean atiAmpela = input.nextBoolean(); 
        boolean telur = input.nextBoolean();   

        
        if (suwiran) {
            total += 3000;
        }
        if (cakue) {
            total += 1500;
        }
        if (atiAmpela) {
            total += 4500;
        }
        if (telur) {
            total += 4000;
        }

        System.out.println(total);

    }
}
