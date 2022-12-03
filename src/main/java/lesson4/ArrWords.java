package lesson4;

import java.util.*;

public class ArrWords {

    public static void main(String[] args) {

        List<String> words = Arrays.asList(
                "Слово1", "Слово2", "Слово3", "Слово4", "Слово5",
                "Слово1", "Слово6", "Слово5", "Слово8", "Слово9",
                "Слово10", "Слово11", "Слово3", "Слово13", "Слово14"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Массив слов");
        System.out.println(words.toString());
        System.out.println();
        System.out.println("Список уникальных слов");
        System.out.println(unique.toString());
        System.out.println();
        System.out.println("Количество повторений слов");
        for (String key : unique) {
            System.out.println(key + ", количество раз(ов): " + Collections.frequency(words,key));
        }
    }

}
