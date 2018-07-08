public class Main {
    public static void main(String[] args){
        LogTester logTester = new LogTester();

        for (int i = 0; i < 10; i ++){
            logTester.log();
        }

        Object[][] log = logTester.get().asArray();
        for (Object[] row : log){
            for (Object obj: row){
                System.out.print(obj + "\t");
            }
            System.out.print("\n");
        }
    }
}
