import java.util.Scanner;

public class FreeOrWorkTime {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int input = 0;

        System.out.println("Please tell me the hour?");
        input = s.nextInt();

        if ((input >= 8 && input < 12) || (input >= 13 && input < 16)) {
            System.out.println("Its still working time.");
        } else if (input == 12) {
            System.out.println("Lunch break");
        } else {
            System.out.println("Free time ;)");
        }
    }
}