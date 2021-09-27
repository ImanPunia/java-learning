package ListComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import FieldData.FieldResponse;
import FieldData.StoredData;

public class CompareLists {
    
    public static ArrayList<Integer> existingData = new ArrayList<>();
    public static ArrayList<Integer> newData = new ArrayList<>();

    public static void returnAdditionalFields(){
        newData.removeAll(existingData);
    }

    //return diabled field using lmabda expression
    public static List<FieldResponse> returDisabledFields(){
       List<FieldResponse> difference =  existingData.stream().filter(element ->!newData.contains(element))
       .map(element -> new FieldResponse(element))
       .collect(Collectors.toList());
        return difference;
    }

    //return enabled field using lambda expression
    public static List<Integer> returEnabledFields(){
        List<Integer> difference =  newData.stream().filter(element -> !existingData.contains(element))
        .collect(Collectors.toList());
         return difference;  
     }
     
     //finds enabled values by comparing two lists
     public static void enabledIds(){
         List<Integer> addition = new ArrayList<>();

         for(Integer a: newData){
            for(Integer b: existingData){
                if(a != b){
                    addition.add(b);
                }
            }
        }
        
      if(addition.size() == 0 ){
          existingData.addAll(newData);
      } else {
        newData.removeAll(addition);
        newData.forEach(data -> System.out.println("enabled"+data));
      }
     }

     //finds disabled values by comparing to lists
     public static void disabledList(){

        List<Integer> difference = new ArrayList<>();
        List<Integer> copy = new ArrayList<>();

        copy = existingData.stream().collect(Collectors.toList());

        for(Integer a: existingData){
            for(Integer b: newData){
                if(a == b){
                    difference.add(a);
                }
            }
        }

        if(difference.size() == 0){
            existingData.clear();
        } else {
            copy.removeAll(difference);
            copy.forEach(data -> {System.out.println("disabled"+data);});
            existingData.removeAll(copy);
        }
        
     }

    public static void main(String args[]) {

        StoredData std = new StoredData();
        existingData = std.getExistingFields();
        newData = std.getNewFileds();

        disabledList();
        enabledIds();

        List<FieldResponse> disabledFields = returDisabledFields();
        disabledFields.forEach(field -> System.out.println(field.getId() + "disabled"));
        
        List<Integer> enabledFields = returEnabledFields();
        enabledFields.forEach(field -> System.out.println(field + "enabled"));
    }

}
