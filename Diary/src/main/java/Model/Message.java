package Model;

/**
 * Menyns meddelande till användaren
 */

public class Message {
    public static void menu() {
        System.out.println("1. Läs upp dagboken" + "\n2. Skriv något om din fina dag" + "\n3. Avsluta Programmet");
    }
    public static void welcomeMessage() {
        System.out.println("Välkommen till din personliga dagbok, vad vill du göra?");
    }
}
