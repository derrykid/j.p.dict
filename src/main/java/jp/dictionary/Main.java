package jp.dictionary;

public class Main{
    public static void main(String[] args) {

        Word word = new Vocabulary("water", "n.水,水域,领海,困境;v.灌溉,流泪，流口水");

        // this will print:
        // n.水,水域,领海,困境;v.灌溉,流泪，流口水
        System.out.println(word.getChinese());

        // this will print:
        // water
        System.out.println(word.getEnglish());

        // this will print:
        // "water": 意思是 n.水,水域,领海,困境;v.灌溉,流泪，流口水
        System.out.println(word);

    }
}