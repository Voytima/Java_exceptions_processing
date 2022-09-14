import java.util.Scanner;
    /*
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
public class task_4 {
    public static void main(String[] args) throws Exception {
        System.out.println("You should type anything:");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        string = string.trim(); // Пробелы тоже считаем за пустоту
        if (string.isEmpty())
            throw new Exception("String shouldn't be an empty string!");
        else
            System.out.println(string);
    }
}