package logUtils;

public class CSVLogger {
    public static String logCSV(String fileName, Log input){
        Object[][] data = flipArray(input.asArray());

        String[] keys = input.getKeys();

        StringBuilder outputString = new StringBuilder();

        for (int i = 0; i < keys.length; i++){
            outputString.append(keys[i]);
            if (i+2 <= keys.length)
                outputString.append(",");

        }

        for (Object[] dataset : data){
            outputString.append("\n");
            for (int i = 0; i < dataset.length; i++){
                outputString.append(dataset[i].toString());
                if (i+2 <= keys.length)
                    outputString.append(",");
            }
        }

        return outputString.toString();

    }

    private static Object[][] flipArray(Object[][] input){
        Object[][] temp = new Object[input[0].length][input.length];

        for (int i = 0; i < input.length; i++){
            for (int j = 0; j < input[0].length; j++){
                temp[j][i] = input[i][j];
            }
        }

        return temp;
    }
}
