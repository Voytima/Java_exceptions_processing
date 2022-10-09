package assistant;

import java.util.Scanner;

public class Scn {
    public static String scn() {
        try(Scanner scn = new Scanner(System.in)) {
            return scn.nextLine();
        }
    }
}
