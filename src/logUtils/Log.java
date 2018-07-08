package logUtils;

import java.util.ArrayList;

/**
 * Log Class.
 *
 * <P>Represents a log of the changes to a certain set of provided objects over time</P>
 *
 * @author Avidh Bavkar (Team 7404: HighTide) [avidhbavkar@gmail.com]
 * @version 1.0
 * @since   1.0
 */
public class Log {

    /**
     * The raw contents of the log.
     */
    private ArrayList<Object[]> contents;

    /**
     * Default Constructor.
     */
    public Log(){
        contents = new ArrayList<>();
    }

    /**
     * Copy Constructor.
     *
     * <P> Initializes a log as a copy of a provided log.</P>
     *
     * @param copyFrom the log object to create a copy of.
     */
    public Log(Log copyFrom){
        contents = copyFrom.asRaw();
    }

    /**
     * Append Method.
     *
     * <P> Appends a "snapshot" to the log. </P>
     *
     * @param objects The "snapshot" of data to log.
     */
    public void append(Object[] objects){
        contents.add(objects);
    }

    /**
     * As Raw Method.
     *
     * <P> Returns a raw copy of the contents of the log, useful for creating copies but perhaps not much else</P>
     *
     * @return A copy of the contents of the log in it's rather unwieldy raw form
     */
    public ArrayList<Object[]> asRaw(){
        return new ArrayList<>(contents);
    }

    /**
     * Clear Method.
     *
     * <P> Deletes all log values from the log </P>
     */
    public void clear(){
        contents.clear();
    }

    /**
     * As Array List Method.
     *
     * @return The contents of this log file in the form of a 2 dimensional {@link ArrayList}
     */
    public ArrayList<ArrayList<Object>> asArrayList(){
        ArrayList<ArrayList<Object>> returnMe = new ArrayList<>();
        ArrayList<Object> temp = new ArrayList<>();

        for (Object[] content: contents){
            temp.clear();
            for (Object val: content){
                temp.add(val);
            }
            returnMe.add(temp);
        }

        return returnMe;
    }

    /**
     * As Array Method.
     *
     * @return The contents of this log file in the form of a 2 dimensional {@link Object} array
     */
    public Object[][] asArray(){
        Object[][] returnMe = new Object[contents.size()][contents.get(0).length];

        for (int i = 0; i < contents.size(); i++){
            returnMe[i] = contents.get(i);
        }

        return returnMe;
    }
}
