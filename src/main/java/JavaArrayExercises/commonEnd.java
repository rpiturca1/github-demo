package JavaArrayExercises;

public class commonEnd {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        System.out.println(commonEnd(array1, array2));
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }
}
