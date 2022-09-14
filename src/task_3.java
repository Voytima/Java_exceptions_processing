import java.util.Arrays;

/*
* 3) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
* и возвращающий новый массив, каждый элемент которого равен разности элементов
* двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
* оповестить пользователя.
* */
public class task_3 {
    public static void main(String[] args) {
    int[] arr1 = new int[]{1, 2, 3, 4, 5};
    int[] arr2 = new int[]{5, 4, 3, 2, 1};
    int[] res = arrayDiff(arr1, arr2);
    String resAsString = Arrays.toString(res);
    System.out.println(resAsString);
    }

    public static int[] arrayDiff(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays are not equal in size");
        }
        int[] res = new int[arr1.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr1[i] - arr2[i];
        }
        return res;
    }
}
