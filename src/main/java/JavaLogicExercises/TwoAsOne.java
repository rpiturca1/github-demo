package JavaLogicExercises;

public class TwoAsOne {

    public static void main(String[] args) {
        System.out.println(twoAsOne(1, 2, 3)); // Output: true
        System.out.println(twoAsOne(3, 1, 2)); // Output: true
        System.out.println(twoAsOne(3, 2, 2));  // Output: false
    }

    public static boolean twoAsOne(int a, int b, int c) {


        if (a == b+c || b == a+c || c == a+b)
            return true;
        else
            return false;
    }

}
