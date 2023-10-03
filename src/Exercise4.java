import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("inserisci un numero intero e premi invio");
        int numero = Integer.parseInt(input.nextLine());

        for (int i = numero; i > -1; i--) {

            System.out.println(i);

        }

        input.close();
    }
}
