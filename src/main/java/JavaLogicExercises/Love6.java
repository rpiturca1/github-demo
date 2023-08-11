package JavaLogicExercises;

public class Love6 {

    public static void main(String[] args) {
        System.out.println(love6(6, 4)); // Output: true
        System.out.println(love6(4, 5)); // Output: false
        System.out.println(love6(1, 5));  // Output: true
    }

    public static boolean love6(int a, int b) {

        if  (a == 6 || b == 6)
            return true;

        int sum = a+b;
        int diff = Math.abs(a-b);

        if (sum == 6 || diff == 6)
            return true;
        else
            return false;


    }
}
