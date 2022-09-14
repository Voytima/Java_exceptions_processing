import java.util.InputMismatchException;
import java.util.Scanner;
    /*
    1) Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */
public class task_1 {

        public static void main(String[] args) {
            inputMethod();
        }
        public static float inputMethod() {
            System.out.println("Enter float num");
            Scanner scanner = new Scanner(System.in);
            float f = 0;

            while (true) {
                try {
                    f = scanner.nextFloat();
                    return f;
                } catch (InputMismatchException e) {
                    System.err.println("Wrong data type");
                    String line = scanner.nextLine();
                }
            }
        }
}
