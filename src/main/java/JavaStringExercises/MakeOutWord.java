package JavaStringExercises;
//Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
public class MakeOutWord {

    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
    }

    public static  String makeOutWord(String out, String word) {

        String start = out.substring(0,2);
        String end = out.substring(2,4);
        String outWord = start + word + end;
        return outWord;

    }
}
