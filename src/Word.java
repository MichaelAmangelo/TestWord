public class Word extends Sentence {

    private String noVowelsWord;

    public Word(String s, String w) {
        super(s);
       noVowelsWord = w.replaceAll("[aeiouAEIOU]","");

    }

    public String getNoVowelsWord() {
        return noVowelsWord;
    }
    public boolean isSubstring(){

        return getSentence().contains(noVowelsWord);

    }
}

