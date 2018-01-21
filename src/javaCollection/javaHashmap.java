package javaCollection;

import java.util.HashMap;
import java.util.Map;

public class javaHashmap {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "hello");
        map.put(2, "ni hao");
        map.put(3, "wo hao");
        for(Map.Entry m:map.entrySet()){
            System.out.println("Entry is: " + m.getKey() +", " + m.getValue());
        }
    }
}
