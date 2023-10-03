import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("inserisci un numero INTERO a tua scelta e premi invio");
        int numero = Integer.parseInt(input.nextLine());

        switch (numero) {
            case 0: {
                System.out.println("zero");
                break;
            }
            case 1: {
                System.out.println("uno");
                break;
            }
            case 2: {
                System.out.println("due");
                break;
            }
            case 3: {
                System.out.println("tre");
                break;
            }
            default: {
                System.out.println("oops, si è verificato un errore");
            }
        }

        input.close();
    }
}
