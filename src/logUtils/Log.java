package logUtils;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Log Class.
 *
 * <P>Represents a log of the changes to a certain set of provided objects over time</P>
 *
 * @author Avidh Bavkar (Team 7404: HighTide) [avidhbavkar@gmail.com]
 * @version 2.0
 * @since   1.0
 */
public class Log {

    /**
     * The raw contents of the log.
     */
    private HashMap<String, ArrayList<Object>> contents;


    /**
     * Default Constructor.
     */
    public Log(){
        contents = new HashMap<>();
    }

    /**
     * Copy Constructor.
     *
     * <P> Initializes a log as a copy of a provided log.</P>
     *
     * @param copyFrom the log object to create a copy of.
     */
    public Log(Log copyFrom){
        contents = copyFrom.getRaw();
    }

    /**
     * Append Method.
     *
     * <P> Appends an individual value to the log. </P>
     *
     * @param key The "key" of the data to log.
     * @param object The actual data to write to that key.
     */
    public void append(String key, Object object){
        if (!contents.containsKey(key))
            contents.put(key, new ArrayList<>());
        contents.get(key).add(object);
    }

    /**
     * As Raw Method.
     *
     * <P> Returns a raw copy of the contents of the log, useful for creating copies but perhaps not much else</P>
     *
     * @return A copy of the contents of the log in it's raw hashmap form.
     */
    private HashMap<String, ArrayList<Object>> getRaw(){
        return (HashMap<String, ArrayList<Object>>) contents.clone();
    }


    /**
     * As Array List Method.
     *
     * @return The contents of this log file in the form of a 2 dimensional {@link ArrayList}
     */
    public ArrayList<ArrayList<Object>> asArrayList(){
        return null;

        //TODO: Implement!!!
    }

    /**
     * As Array Method.
     *
     * @return The contents of this log file in the form of a 2 dimensional {@link Object} array
     */
    public Object[][] asArray(){
        return null;

        //TODO: Implement!!!
    }
}
