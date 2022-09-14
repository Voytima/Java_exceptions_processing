import java.io.FileNotFoundException;

/*
Дан следующий код, исправьте его там, где требуется
 */
public class task_3 {

        public static void main(String[] args) throws Exception{
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[2] = 9;
        } catch (ArithmeticException ex) {
            throw new Exception("Zero division is not allowed!");
        } catch (NullPointerException ex) {
            throw new Exception("Pointer cannot point to null!");
        } catch (IndexOutOfBoundsException ex) {
            throw new Exception("Array is out of range!");
        } catch (Throwable ex) {
            throw new Exception("Something went wrong...");
        }
        System.out.println("All good!");
    }

    public static void printSum(Integer a, Integer b) {
            System.out.println(a + b);
    }
}

