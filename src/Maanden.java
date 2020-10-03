import java.util.Scanner;

public class Maanden {
    public static void main(String[] args) {

        // Noem maand volgens getal input d.m.v. switch input.

        System.out.printf("%nAf en toe vergeet je wel eens welke maand bij welke kalender getal hoort.%n");

        var input = new Scanner(System.in);

        // Do-While initiatie.
        int month;
        System.out.printf("%nVoer maar een getal in tussen 1 en 12 en vervolgens vertel ik je welke maand erbij hoort:%n");
        do {
            // Invoer maand.
            month = input.nextInt();

            // Selectie maand d.m.v. switch.
            switch (month) {
                case 1 -> System.out.printf("Maand 1: Net het nieuwe jaar ingedoken met januari!%n");
                case 2 -> System.out.printf("Maand 2: Februari, de kortste maand van het jaar.%n");
                case 3 -> System.out.printf("Maand 3: Een droge maart, is een zomer te paard.%n");
                case 4 -> System.out.printf("Maand 4: April doet wat hij wil.%n");
                case 5 -> System.out.printf("Maand 5: Het is zo stil in mei.%n");
                case 6 -> System.out.printf("Maand 6: Zomerse dagen in juni.%n");
                case 7 -> System.out.printf("Maand 7: Heerlijk op vakantie in juli!%n");
                case 8 -> System.out.printf("Maand 8: Geniet van het laatste warme weer in augustus.%n");
                case 9 -> System.out.printf("Maand 9: De scholen beginnen weer in september.%n");
                case 10 -> System.out.printf("Maand 10: Halloween en guur weer in oktober.%n");
                case 11 -> System.out.printf("Maand 11: Misschien valt er wel sneeuw in november.%n");
                case 12 -> System.out.printf("Maand 12: Sinterklaas, kerst en het einde van het jaar in december!%n");
                default -> System.out.printf("Incorrecte invoer. Vul a.u.b. een getal tussen 1 en 12:%n");
            }
        } while (!(month >= 1 && month <= 12));
// Einde opdracht.
    }
}
