import java.security.PublicKey;
import java.util.logging.Logger;

public class task_1 {
    public static void main(String[] args) {

        f1();
    }

    /* ArrayStorageException*/
    public static void f1() {
        Object arr[] = new String[3];
        arr[0] = new Integer(0);
    }
    /* NegativeArraySizeException*/
    public static void f2() {
        int[] arr = new int[-2];
        System.out.println(arr.length);

    }
    /*StringIndexOutOfBoundsException*/
    public static void f3() {
        String str = "abcde";
        int i = 0;
        while (i <= str.length()) {
            char c = str.charAt(i);
            int code = (int)c;
            System.out.println(c + code);
            i++;
        }
    }
}
