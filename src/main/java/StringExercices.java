
public class StringExercices {

     public static void main(String[] args) {

        public String helloName(String name) {

            String result;

            result = "Hello " + name + "!";

            return result;

        }
        public String makeOutWord(String out, String word) {

            String start = out.substring(0,2);
            String end = out.substring(2,4);
            String outWord = start + word + end;
            return outWord;

        }

    }
}

