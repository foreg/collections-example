package ru.sbt.collections;


import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashSet;

/**
 * Подсчитайте количество различных слов в файле.
 */
public class Counter1DifferentWords {

    public static void main( String[] args ) throws IOException, URISyntaxException {
        String[] words = Reader.readWords();
        HashSet<String> unique = new HashSet<>();
        for (String word :words) {
            unique.add(word);
        }

        System.out.println(unique.size());
    }
}
