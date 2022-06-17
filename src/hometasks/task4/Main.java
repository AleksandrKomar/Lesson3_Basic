package hometasks.task4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DocumentWorker docWorker;

        Scanner ipput = new Scanner(System.in);
        System.out.print("Введите номер ключа - ");

        String key = ipput.next();

        if (key.toLowerCase().equals("exp")) {
            docWorker = new ExpertDocumentWorker();
        } else if (key.toLowerCase().equals("pro")) {
            docWorker = new ProDocumentWorker();
        } else {
            docWorker = new DocumentWorker();
        }

        if (docWorker != null) {

            docWorker.openDocument();
            docWorker.editDocument();
            docWorker.saveDocument();
        }
    }

}
