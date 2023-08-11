public class CaughtSpeed {

    public static void main(String[] args) {
        System.out.println(caughtSpeeding(60, false));
        System.out.println(caughtSpeeding(65, false));
        System.out.println(caughtSpeeding(65, true));

    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {

        if (isBirthday) {
            if (speed <= 65)
                return 0;
            if (speed > 65 && speed <= 85)
                return 1;
            if (speed >= 86)
                return 2;
        } else {
            if (speed <= 60)
                return 0;
            if (speed > 60 && speed <= 80)
                return 1;
            if (speed >= 81)
                return 2;
            }
        return 1;
    }}








