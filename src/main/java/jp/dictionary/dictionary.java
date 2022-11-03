public class Dictionary {
  public Map<String, Word> dictionary;
  public dictionary(String eng,String chi){
    Word word = new Vocabulary(eng,chi);
    dictionary.put(eng, word);
  }
}
