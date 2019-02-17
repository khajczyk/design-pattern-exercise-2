package account;

public class Logger {

    public void log(String log){
        System.out.println(log);
    }

    private Logger() {

    }

    private static Logger instance;

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    return new Logger();
                }
            }
        }
        return instance;
    }

}
