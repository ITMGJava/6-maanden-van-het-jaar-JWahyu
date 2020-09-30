import java.util.Scanner;

public class Maanden {
    public static void main(String[] args) {

        // Maand volgens switch input.

        System.out.printf("%nAf en toe vergeet je wel eens welke maand bij welke kalender getal hoort.%n" +
                "Het maakt niet uit, voer maar een getal in tussen 1-12 en vervolgens vertel ik je welke maand erbij hoort:%n");

        var input = new Scanner(System.in);

        var month = input.nextInt();

        switch (month) {
            case 1:
                System.out.printf("%nMaand 1: Net het nieuwe jaar ingedoken met januari!%n");
                break;
            case 2:
                System.out.printf("%nMaand 2: Februari, de kortste maand van het jaar.%n");
                break;
            case 3:
                System.out.printf("%nMaand 3: Een droge maart, is een zomer te paard.%n");
                break;
            case 4:
                System.out.printf("%nMaand 4: April doet wat hij wil.%n");
                break;
            case 5:
                System.out.printf("%nMaand 5: Het is zo stil in mei.%n");
                break;
            case 6:
                System.out.printf("%nMaand 6: Zomerse dagen in juni.%n");
                break;
            case 7:
                System.out.printf("%nMaand 7: Heerlijk op vakantie in juli!%n");
                break;
            case 8:
                System.out.printf("%nMaand 8: Geniet van het laatste warme weer in augustus.%n");
                break;
            case 9:
                System.out.printf("%nMaand 9: De scholen beginnen weer in september.%n");
                break;
            case 10:
                System.out.printf("%nMaand 10: Halloween en guur weer in oktober.%n");
                break;
            case 11:
                System.out.printf("%nMaand 11: Misschien valt er wel sneeuw in november.%n");
                break;
            case 12:
                System.out.printf("%nMaand 12:Sinterklaas, kerst en het einde van het jaar in december!%n");
                break;
            default:
                System.out.printf("... We hebben maar 12 maanden in ons kalenderjaar.%n");
        }
// Einde opdracht.
    }
}
