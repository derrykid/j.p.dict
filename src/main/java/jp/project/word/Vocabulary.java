package jp.project.word;

public class Vocabulary implements Word {

    private final String english;
    private final String chinese;

    public Vocabulary(String english, String chinese) {

        this.english = english;
        this.chinese = chinese;

    }

    @Override
    public String getEnglish() {
        return english;
    }

    @Override
    public String getChinese() {
        return chinese;
    }

    @Override
    public String toString() {
        // "water": 意思是 n.水,水域,领海,困境;v.灌溉,流泪，流口水
        return this.english + ": 意思是 " + this.chinese;
    }
}
