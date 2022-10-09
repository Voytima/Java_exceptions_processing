import exceptionPack.InvalidCountNumberData;
import exceptionPack.InvalidSymbolException;
import java.io.IOException;
import assistant.FileManager;
import assistant.ParseInfo;

public class DataBaseFill {
    private String surname;
    private String firstName;
    private String middleName;
    private String dateBirth;
    private String telephonNumber;
    private String gender;

    private final ParseInfo parseInfo;
    private final FormatTypeTextCheck formatTypeTextCheck;

    public DataBaseFill(String dataBase) {
        this.parseInfo = new ParseInfo(dataBase, ' ');
        this.formatTypeTextCheck = new FormatTypeTextCheck();
        if (addParseInfo() && ckeckFormatTypeText(formatTypeTextCheck)) {
            try {
                FileManager.fileWriterFile(parseInfo.getParsersInfo(), parseInfo.getParsersInfo()[0], ".txt", "<>");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean addParseInfo() {
        try {
            if (parseInfo.getParsersInfo().length != 6) throw new InvalidCountNumberData();
            this.surname = parseInfo.getParsersInfo()[0];
            this.firstName = parseInfo.getParsersInfo()[1];
            this.middleName = parseInfo.getParsersInfo()[2];
            this.dateBirth = parseInfo.getParsersInfo()[3];
            this.telephonNumber = parseInfo.getParsersInfo()[4];
            this.gender = parseInfo.getParsersInfo()[5];
            return true;
        } catch (InvalidCountNumberData e) {
            System.err.println(e);
            return false;
        }
    }

    private boolean ckeckFormatTypeText(FormatTypeTextCheck formatTypeTextCheck) {
        boolean check = true;
        try {
            formatTypeTextCheck.checkSurname(surname);
        } catch (InvalidSymbolException e) {
            System.err.println(e);
            check = false;
        }

        try {
            formatTypeTextCheck.checkFirstName(firstName);
        } catch (InvalidSymbolException e) {
            System.err.println(e);
            check = false;
        }

        try {
            formatTypeTextCheck.checkMiddleName(middleName);
        } catch (InvalidSymbolException e) {
            System.err.println(e);
            check = false;
        }

        try {
            formatTypeTextCheck.checkDateBirth(dateBirth);
        } catch (InvalidSymbolException e) {
            System.err.println(e);
            check = false;
        }

        try {
            formatTypeTextCheck.checkTelephonNumber(telephonNumber);
        } catch (InvalidSymbolException e) {
            System.err.println(e);
            check = false;
        }

        try {
            formatTypeTextCheck.checkGender(gender);
        } catch (InvalidSymbolException e) {
            System.err.println(e);
            check = false;
        }
        return check;
    }
}
