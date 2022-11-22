package jp.project;

import jp.project.dictionary.Dictionary;
import jp.project.word.Word;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Dictionary engChineseDictionary = new Dictionary();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String searchedWord = scanner.nextLine();
            if (searchedWord.equals("stop")) {
                break;
            }
            Word word = engChineseDictionary.searchVocabulary(searchedWord);
            System.out.println(word);
        }


    }
}