package jp.dictionary;

public interface Word {
    
    Vocabulary(getEnglish(),getChinese()){
        this.english=getEnglish();
        this.chinese=getChinese();
    }
    //String getEnglish();

    //String getChinese();

    String toString();
    System.out.println(toString());

}
