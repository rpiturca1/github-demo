package JavaStringExercises;

public class HelloName {

    public static void main(String[] args) {
        System.out.println(helloName("Bob"));

    }

        public static String helloName(String name) {

            String result;
            result = "Hello " + name + "!";
            return result;
        }
}


