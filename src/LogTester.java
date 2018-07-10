import logUtils.Log;
import logUtils.Loggable;

/**
 * LogTester Class.
 *
 * <P> Written as a driver class to test the functionality of {@link Loggable}</P>
 *
 * @author Avidh Bavkar (Team 7404: HighTide) [avidhbavkar@gmail.com]
 * @version 1.0
 * @since   1.0
 */
public class LogTester extends Loggable {

    public static final int TEST_LOG_X_SIZE = 5;
    int count = 0;

    private Log log;

    public LogTester(){
        super(new String[]{ "One", "Two", "Three", "Four", "Five"});
        log = new Log();
    }

    @Override
    protected Object[] collectData() {

        Double[] content = new Double[TEST_LOG_X_SIZE];
        int subcount = 0;

        for (int i = 0; i < content.length; i++){
            content[i] = (count * 10d) + subcount;
            subcount ++;
        }

        count++;

        return content;
    }

    public Log grabLog(){
        return this.log;
    }
}
