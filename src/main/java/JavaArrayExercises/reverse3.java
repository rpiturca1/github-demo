package JavaArrayExercises;

public class reverse3 {

    public static void main(String[] args) {
        int[] result = reverse3(new int[]{1, 2, 3});
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] reverse3(int[] nums)
    {

        int[] myArray =  new int[3];

        myArray[0] = nums[2];

        myArray[1] = nums[1];

        myArray[2] = nums[0];

        return myArray;


    }

}
