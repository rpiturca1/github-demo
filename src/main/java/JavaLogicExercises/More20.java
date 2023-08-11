package JavaLogicExercises;

public class More20 {

    public static void main(String[] args) {
        System.out.println(more20(20)); // Output: false
        System.out.println(more20(21)); // Output: true
        System.out.println(more20(22));  // Output: true
    }
    public static boolean more20(int n) {

        if (n % 20 == 1 || n % 20 == 2)
            return true;

        else
            return false;
    }
}
