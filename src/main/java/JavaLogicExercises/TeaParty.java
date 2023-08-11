package JavaLogicExercises;

public class TeaParty {

    public static void main(String[] args) {
        System.out.println(teaParty(6,8)); // Output: 1
        System.out.println(teaParty(3,8)); // Output: 0
        System.out.println(teaParty(20,6));  // Output: 2
    }

    public static int teaParty(int tea, int candy) {

        if( tea < 5 || candy < 5){
            return 0;

        }

        else if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2;
        }

        if ( tea + candy >= 5){
            return 1;
        }

    return 0;

    }

}
