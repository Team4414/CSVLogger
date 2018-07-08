package logUtils;

import java.util.ArrayList;

public class Log {

    private ArrayList<Object[]> contents;

    public Log(){
        contents = new ArrayList<>();
    }

    public Log(Log copyFrom){
        contents = copyFrom.asRaw();
        //returns a copy.
    }

    public void append(Object[] objects){
        contents.add(objects);
    }

    public ArrayList<Object[]> asRaw(){
        return new ArrayList<>(contents);
    }

    public void clear(){
        contents.clear();
    }

    public ArrayList<ArrayList<Object>> asArrayList(){
        ArrayList<ArrayList<Object>> returnMe = new ArrayList<>();
        ArrayList<Object> temp = new ArrayList<>();

        for (Object[] content: contents){
            temp.clear();
            for (Object val: content){
                temp.add(val);
            }
            returnMe.add(temp);
        }

        return returnMe;
    }

    public Object[][] asArray(){
        Object[][] returnMe = new Object[contents.size()][contents.get(0).length];

        for (int i = 0; i < contents.size(); i++){
            returnMe[i] = contents.get(i);
        }

        return returnMe;
    }
}
