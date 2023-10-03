import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("inserisci una frase a tua scelta");
        String frase = input.nextLine();
        while (!frase.equals(":q")) {
            for (int i = 0; i < frase.length(); i++) {
                String frase2 = frase.charAt(i) + ",";
                System.out.println(frase2);
            }
            System.out.println("scrivi qualcos'altro");
            frase = input.nextLine();
        }

        input.close();
    }
}
