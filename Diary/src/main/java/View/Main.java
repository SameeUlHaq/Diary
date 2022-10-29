package View;

import Model.Diary;
import Model.Message;
import Controller.Methods;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author samee
 * Här har jag main som presenterar programmet.
 * Den kallar på klassen "Methods"
 */
public class Main {
    static Methods methods = new Methods();

    /**
     * Här ser man att programmet vill visa upp och interagera med menyn med hjälp av en switch-case.
     * Den har även en "Exception" om användaren råkat trycka på fel val.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        var userChoice = 0;
        Message.welcomeMessage();
        do {
            Message.menu();
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1 -> showEntries();
                case 2 -> createEntry();
                case 3 -> System.out.println("Hej då!");
                default -> System.out.println("Det här är ett inkorrekt val!\nFörsök igen....");
            }
        } while (userChoice != 3);
    }

    /**
     * Funktionen "createPost" finns inlagd i klassen "Methods".
     * "createEntry" används med hjälp av "createPost".
     * Visas bara när användaren vill skriva i dagboken.
     */
    public static void createEntry() {
        var scanner = new Scanner(System.in);
        System.out.println("Skriv in titeln för dagen:");
        var title = scanner.nextLine();
        System.out.println("Skriv om din fina dag:");
        var postOfTheDay = scanner.nextLine();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        var date = dateFormat.format(new Date());
        methods.createPost(new Diary(title, postOfTheDay, date));
    }

    /**
     * Återigen tar denna funktionen hjälp av klassen "Methods"
     * Visas bara när användaren vill läsa dagboken.
     */
    public static void showEntries() {
        var entries = methods.getPosts();

        for (Diary p : entries) {
            System.out.println("\nTitel: " + p.getTitle());
            System.out.println("Datum: " + p.getDate());
            System.out.println("Dagens händelser: " + p.getDiaryInput());
        }
    }
}