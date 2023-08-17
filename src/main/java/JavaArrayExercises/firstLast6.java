package JavaArrayExercises;

public class firstLast6 {

    public static void main(String[] args) {
        System.out.println(firstLast6([1, 2, 3])); //3,2,1
        System.out.println(firstLast6([6, 1, 2, 3]);
        System.out.println(firstLast6([13, 6, 1, 2, 3]);

    }

    public static boolean firstLast6(int[] nums) {

        if ( nums[0] == 6 || nums[nums.length - 1] == 6)
            return true;
        else
            return false;

    }
}
