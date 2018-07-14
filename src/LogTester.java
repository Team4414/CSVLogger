import logUtils.Loggable;

/**
 * LogTester Class.
 *
 * <P> Written as a driver class to test the functionality of {@link Loggable}</P>
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
