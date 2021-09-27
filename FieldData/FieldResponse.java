package FieldData;

public class FieldResponse {
    
    public int FieldId;

    public FieldResponse(){}

    public FieldResponse(int FieldId){
        this.FieldId = FieldId;   
    }

    public int getId(){
        return this.FieldId;
    }
}
