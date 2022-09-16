import exceptionPack.InvalidSymbolException;
import assistant.ParseInfo;

public class FormatTypeTextCheck {

    public boolean checkSurname(String str) throws InvalidSymbolException {
        if (checkInvalidSymbolRusAlphabet(str)) {
            return true;
        } else {
            throw new InvalidSymbolException("Ошибка заполнения Фамилии");
        }
    }

    public boolean checkFirstName(String str) throws InvalidSymbolException {
        if (checkInvalidSymbolRusAlphabet(str)) {
            return true;
        } else {
            throw new InvalidSymbolException("Ошибка заполнения Имени");
        }
    }

    public boolean checkMiddleName(String str) throws InvalidSymbolException {
        if (checkInvalidSymbolRusAlphabet(str)) {
            return true;
        } else {
            throw new InvalidSymbolException("Ошибка заполнения Отчества");
        }
    }

    public boolean checkDateBirth(String str) throws InvalidSymbolException {
        if (checkInvalidDateBirth(str)) {
            return true;
        } else {
            throw new InvalidSymbolException("Ошибка заполнения Даты рождения");
        }
    }

    public boolean checkTelephonNumber(String str) throws InvalidSymbolException {
        if (checkInvalidTelephonNumber(str)) {
            return true;
        } else {
            throw new InvalidSymbolException("Ошибка заполнения Номера телефона");
        }
    }

    public boolean checkGender(String str) throws InvalidSymbolException {
        if (checkInvalidGender(str)) {
            return true;
        } else {
            throw new InvalidSymbolException("Ошибка заполнения Пола");
        }
    }

    private boolean checkInvalidSymbolRusAlphabet(String str) {
        boolean check;
        char[] rusAlphabet = {
                'А','а','Б','б','В','в','Г','г','Д','д','Е','е','Ё','ё','Ж','ж','З','з','И','и','Й','й',
                'К','к','Л','л','М','м','Н','н','О','о','П','п','Р','р','С','с','Т','т','У','у','Ф','ф',
                'Х','х','Ц','ц','Ч','ч','Ш','ш','Щ','щ','Ъ','ъ','Ы','ы','Ь','ь','Э','э','Ю','ю','Я','я'};
        for (int i = 0; i < str.length(); i++) {
            check = false;
            for (char c : rusAlphabet) {
                if (str.charAt(i) == c) {
                    check = true;
                    break;
                }
            }
            if (!check) return false;
        }
        return true;
    }

    private boolean checkInvalidDateBirth(String str) throws InvalidSymbolException {
        ParseInfo parseInfo = new ParseInfo(str, '.');
        String[] dataArr = parseInfo.getParsersInfo();
        try {
            if (Integer.parseInt(dataArr[0]) < 0 || Integer.parseInt(dataArr[0]) > 31) {
                System.out.println("SOSISKA 1");
                return false;
            } else if (Integer.parseInt(dataArr[1]) < 0 || Integer.parseInt(dataArr[1]) > 12) {
                System.out.println("SOSISKA 2");
                return false;
            } else if (Integer.parseInt(dataArr[2]) < 1900 || Integer.parseInt(dataArr[2]) > 2022) {
                System.out.println("SOSISKA 3");
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private boolean checkInvalidTelephonNumber(String str) {
        boolean check;
        char[] counterNumber = {'0','1','2','3','4','5','6','7','8','9'};
        for (int i = 0; i < str.length(); i++) {
            check = false;
            for (char c : counterNumber) {
                if (str.charAt(i) == c) {
                    check = true;
                    break;
                }
            }
            if (!check) return false;
        }
        return true;
    }

    private boolean checkInvalidGender(String str) {
        return str.equals("M") || str.equals("m") || str.equals("F") || str.equals("f");
    }
}
