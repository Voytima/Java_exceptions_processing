public class task_2 {
    public static void main(String[] args) {

    }
    /*
    1) Проверку на равенство рядов и колонок;
    2) Проверку на то, что и i и j не больше 5;
    3) Проверку на тип вводимых данных
    * */
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
