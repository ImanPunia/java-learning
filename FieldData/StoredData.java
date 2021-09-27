package FieldData;

import java.util.ArrayList;

public class StoredData {
    
    public  ArrayList<Integer> existingField = new ArrayList<>();
    public  ArrayList<Integer> newField = new ArrayList<>();


    public ArrayList<Integer> getExistingFields(){
        existingField.add(1);
        existingField.add(2);
        existingField.add(3);
        existingField.add(4);
        existingField.add(5);

        return existingField;
    }

    public ArrayList<Integer> getNewFileds(){
        
        newField.add(1);
        newField.add(2);
        newField.add(3);
        newField.add(6);
        newField.add(7);

        return newField;
    }

    public void setNewField(Integer i){
        newField.add(i);
    }

    public void removeNewField(){
        int size = newField.size();
        newField.remove(size);
    }

}
