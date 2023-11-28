import java.util.Scanner;

public class Main2 {

    public static void stampaInLettere(int numero) {
        String numeroInLettere;
        switch (numero) {
            case 0:
                numeroInLettere = "zero";
                break;
            case 1:
                numeroInLettere = "uno";
                break;
            case 2:
                numeroInLettere = "due";
                break;
            case 3:
                numeroInLettere = "tre";
                break;
            default:
                numeroInLettere = "Errore: il numero non è compreso tra 0 e 3";
                break;
        }
        System.out.println(numeroInLettere);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero tra 0 e 3: ");
        int input = scanner.nextInt();

        stampaInLettere(input);
        scanner.close();
    }
}