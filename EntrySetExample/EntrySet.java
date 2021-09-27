package EntrySetExample;

import java.util.*;

public class EntrySet {

    public static void main(String args[]){
        Map<String, Object> map = new HashMap<String, Object>(); 

        map.put("abc", "jkjk");
        map.put("def",6);
        map.put("ghi",new FieldData(3, 4));
        map.put("jkl",new FieldData(4, 5));

        map.entrySet().stream().forEach(abc -> {
            System.out.println(abc);
            System.out.println(abc.getValue());
        });
    }   
}
