package JavaStringExercises;

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
