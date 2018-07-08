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

    private Log log;

    public LogTester(){
        log = new Log();
    }


    @Override
    protected Object[] collectData() {
        Object[] log = new Object[TEST_LOG_X_SIZE];

        for (int i = 0; i < TEST_LOG_X_SIZE; i++){
            if (i == 0){
                log[0] = i;
            }else{
                switch ((int)(Math.random() * 6) + 1){
                    case 1:
                        log[i] = new Test_A();
                        break;
                    case 2:
                        log[i] = new Test_B();
                        break;
                    case 3:
                        log[i] = new Test_C();
                        break;
                    case 4:
                        log[i] = "Hello";
                        break;
                    case 5:
                        log[i] = 69.420;
                        break;
                    case 6:
                        log[i] = 7404;
                        break;

                }
            }
        }

        return log;
    }

    public class Test_A{
        String content = "Content";
        double value = 1720;

        @Override
        public String toString() {
            return "TEST_A";
        }
    }

    public class Test_B{
        double value = 1234;
        boolean flag = true;

        @Override
        public String toString() {
            return "TEST_B";
        }
    }

    public class Test_C{
        Test_A testA = new Test_A();
        Test_B testB = new Test_B();

        @Override
        public String toString() {
            return "TEST_C";
        }
    }
}
