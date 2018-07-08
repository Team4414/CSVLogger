package logUtils;

import logUtils.Log;

public abstract class Loggable {

    Log log;

    public Loggable(){
        log = new Log();
    }

    //to be interpreted on a case by case basis
    protected abstract Object[] collectData();

    public void log(){
        log.append(collectData());
    }

    public void clear(){
        //clears the collectData
        log.clear();
    }

    public Log get(){
        //returns a copy
        return new Log(log);
    }

}
