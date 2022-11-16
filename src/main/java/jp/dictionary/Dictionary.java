package jp.dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private final Map<String, Word> wordMap;

    public Dictionary() {
        wordMap = new HashMap<>();
    }

    public Word searchVocabulary(String searchedWord) {
        Word searchResult = wordMap.get(searchedWord);
        if (notExistedInDictionary(searchResult)) {
            searchResult = DictionaryWebService.getWord(searchedWord);
            savedToDictionary(searchedWord, searchResult);
            return searchResult;
        }
        return searchResult;
    }

    private boolean notExistedInDictionary(Word wantedWord) {
        return wantedWord == null;
    }

    private void savedToDictionary(String searchedWord, Word wantedWord) {
        wordMap.put(searchedWord, wantedWord);
    }
}
