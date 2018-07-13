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

    public double one, two, three, four, five;


    public LogTester(){
        one = 0;
        two = 1;
        three = 2;
        four = 3;
        five = 4;
    }

    @Override
    protected LogObject[] collectData() {

        one++;
        two++;
        three++;
        four++;
        five++;

        return new LogObject[]{
                new LogObject("One", one),
                new LogObject("Two", two),
                new LogObject("Three", three),
                new LogObject("Four", four),
                new LogObject("Five", five)
        };
    }
}
