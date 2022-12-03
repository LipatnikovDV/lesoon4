package lesson4;

public class MainPhonebook {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add(123456, "Petrov");
        phonebook.add(321654, "Kozlov");

        phonebook.get("Petrov");
        phonebook.get("Ivanov");
    }
}
