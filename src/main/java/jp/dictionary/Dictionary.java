package jp.dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private static final Map<String, Word> Eng_Chinese_Dictionary = new HashMap<>();

    public static Word searchVocabulary(String word) {
        return Eng_Chinese_Dictionary.getOrDefault(word, DictionaryWebService.getWord(word));
    }
}
