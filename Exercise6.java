/**
 * Day : 21
 * Exercise : 1
 * Chapter : 5
 * Book: Think Java
 *
 * @author (Jani Iresha)
 * @version (19/12/2018)
 * 
 */public class Exercise6{

    public static void baffle(String blimp) {
        System.out.println(blimp);
        zippo("ping", -5);
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zoop");
        } else {
            System.out.println("ik");
            baffle(quince);
            System.out.println("boo-wa-ha-ha");
        }
    }

    public static void main(String[] args) {
        zippo("rattle", 13);
    }

}