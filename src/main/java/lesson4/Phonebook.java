package lesson4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Phonebook {
    private String surname;
    private Integer number;

    public Phonebook(String surname, Integer number) {
        this.surname = surname;
        this.number = number;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    private Map<Integer, String> phonebook;

    Phonebook() {
        phonebook = new HashMap<>();
    }

    public void add(int number, String surname) {
        phonebook.put(number, surname);
    }

    public void setPhonebook(Map<Integer, String> phonebook) {
        this.phonebook = phonebook;
    }

    public void get(String surname) {
        if(phonebook.containsValue(surname)) {
            Set<Map.Entry<Integer, String>> set = phonebook.entrySet();
            for(Map.Entry<Integer, String> temp : set) {
                if(temp.getValue().equals(surname)) {
                    System.out.println("Фамилия: " + temp.getValue() + ",  Номер телефона: " + temp.getKey());
                }
            }
        } else {
            System.out.println("В телефонной книге нет такой фамилии как:" + " " + surname);
        }
    }

}
