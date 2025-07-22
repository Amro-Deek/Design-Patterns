package org.example.designpattternscode.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance ;
    private List<String> logHistory = new ArrayList<>();

    public static synchronized Logger getInstance(){
        if (instance==null){
            instance =new Logger();
        }
        return instance;
    }
    public void log(String log){
        String entry = "[LOG] :"+log;
        logHistory.add(entry);

    }
    public List<String> getLogHistory(){
        return logHistory;
    }
    public void removeHistory(){
        logHistory.clear();;
    }
}
