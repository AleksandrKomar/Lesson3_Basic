package hometasks.task6;

public class Printer {

    void print(String value) {
        System.out.println("\u001B[36m" + value);
    }

    void print(String value1, String value2) {
        System.out.println("\u001B[31m" + value1 + "\u001B[35m" + value2);
    }

}
