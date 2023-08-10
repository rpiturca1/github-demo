public class CigarParty {


    public static void main(String[] args) {
        System.out.println(cigarParty(30, false)); // Output: false
        System.out.println(cigarParty(50, false)); // Output: true
        System.out.println(cigarParty(70, true));  // Output: true

    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;
        } else {
            return cigars >= 40 && cigars <= 60;
        }
    }


}



