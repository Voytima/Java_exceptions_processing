import java.util.Scanner;

public class task_2 {
    /*
    Если необходимо, исправьте данный код
     */
    public static void main(String[] args) {
        checkedMethod();
    }
    public static double checkedMethod() {
        int[] intArray = new int[5];
        if (intArray.length <= 8) {
            throw new ArrayIndexOutOfBoundsException("Array length should be greater than 8");
        }
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
            return catchedRes1;
        } catch (ArithmeticException e) {
            System.err.println("Catching exception: " + e);
        }
        return 1;
    }
}
