package jp.dictionary;

public class Main{
    public static void main(String[] args) {

        Dictionary engChineseDictionary = new Dictionary();

        String searchedWord = "water";

        Word water = engChineseDictionary.searchVocabulary(searchedWord);

        System.out.println(water);
    }
}