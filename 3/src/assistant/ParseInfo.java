package assistant;

public class ParseInfo {
    private final String dataBase;
    private final String[] parsersInfo;
    private final char parserSymbol;

    public ParseInfo(String dataBase, char parserSymbol) {
        this.parserSymbol = parserSymbol;
        this.parsersInfo = new String[checkParserSymbol(dataBase) + 1];
        this.dataBase = dataBase;
        doParse();
    }

    private void doParse() {
        int arrInfo = 0;
        for (int i = 0; i < dataBase.length(); i++) {
            if (dataBase.charAt(i) != parserSymbol) {
                if (parsersInfo[arrInfo] == null) {
                    parsersInfo[arrInfo] = String.valueOf(dataBase.charAt(i));
                } else {
                    parsersInfo[arrInfo] += dataBase.charAt(i);
                }
            } else {
                arrInfo ++;
            }
        }
    }

    private int checkParserSymbol(String dataBase) {
        int symbolCount = 0;
        for (int i = 0; i < dataBase.length(); i++) {
            if (dataBase.charAt(i) == parserSymbol) symbolCount++;
        }
        return symbolCount;
    }

    public String[] getParsersInfo() {
        return parsersInfo.clone();
    }
}
