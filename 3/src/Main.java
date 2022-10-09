import assistant.Scn;

public class Main {
    public static void main(String[] args) {
        System.out.println("Напишите свои данные разделяя пробелами в формате: Фамилия | Имя | Отчество | Дата рождения | Номер телефона без форматирования | Пол латиницей f/m");
        //DataBaseFill dataBase = new DataBaseFill(Scn.scn());
        DataBaseFill dataBase = new DataBaseFill(("Журавлев Владислав Михаилович 09.04.1999 79426664388 M"));
    }
}
