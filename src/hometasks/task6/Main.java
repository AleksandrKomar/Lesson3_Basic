package hometasks.task6;

public class Main extends Printer {
    public static void main(String[] args) {

        Printer main = new Main();
        Printer printer = new Printer();

        main.print("Это строка Main.");
        printer.print("Данная строка ", "Printer.");

    }
}
