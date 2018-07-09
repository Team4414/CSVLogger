package logUtils;

/**
 * Loggable Class.
 *
 * <P>Provides a framework for extending classes to log values to a {@link Log} object </P>
 *
 * @author Avidh Bavkar (Team 7404: HighTide) [avidhbavkar@gmail.com]
 * @version 1.1
 * @since   1.0
 */
public abstract class Loggable {

    String[] keys;

    /**
     * The {@link Log} object that stores all logged values for this class.
     */
    Log log;

    /**
     * Constructor
     *
     * @param keys The labels to the data in the order that they will be passed in on "collectData()".
     */
    public Loggable(String[] keys){
        this.keys = keys;
        log = new Log();
    }

    /**
     * Collect Data Abstract Method.
     *
     * <P> Must return a "snapshot" of values to be logged</P>
     * @return an array of {@link Object} that represent a "snapshot" of the values to be logged
     */
    protected abstract Object[] collectData();

    /**
     * Log Method.
     *
     * <P> Must be called at a periodic interval to capture and write a "snapshot" to the log </P>
     */
    public void log(){
        Object[] logMe = collectData();

        if (logMe.length != keys.length){
            System.err.println("!!!!! NUMBER OF PASSED KEYS DOES NOT MATCH AMOUNT OF DATA !!!!!");
        }else {
            for (int i = 0; i < logMe.length; i++)
                log.append(keys[i], logMe[i]);
        }
    }


    /**
     * Get Method.
     *
     * <P> Returns a copy of the log at the time it is called, perhaps useful for CSV publishing</P>
     * @return a copy of the Log object.
     */
    public Log get(){
        return new Log(log);
    }

}
