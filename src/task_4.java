import java.util.Arrays;

public class task_4 {
    /*
    4) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен частному элементов двух
    входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
    оповестить пользователя.
    Важно:
    При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
     */
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{5, 4, 3, 2, 1};
        int[] res = arrayQuotient(arr1, arr2);
        String resAsString = Arrays.toString(res);
        System.out.println(resAsString);
    }
        public static int[] arrayQuotient(int[] arr1, int[] arr2) {
            if (arr1.length != arr2.length) {
                throw new RuntimeException("Arrays are not equal in size");
            }
            int[] res = new int[arr1.length];
            for (int i = 0; i < res.length; i++) {
                if (arr2[i] == 0) {
                    throw new RuntimeException("Divisor cannot be 0!");
                }
                res[i] = arr1[i] / arr2[i];
            }
            return res;
        }
}
