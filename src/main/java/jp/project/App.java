package jp.project;

import jp.project.dictionary.Dictionary;
import jp.project.word.Word;

public class App {
    public static void main(String[] args) {

        Dictionary engChineseDictionary = new Dictionary();

        String searchedWord = "water";

        Word water = engChineseDictionary.searchVocabulary(searchedWord);

        System.out.println(water);
    }
}