public class FieldData {
    
    int fieldId ;
    int sortIndex;

    FieldData(int id, int index){
        this.fieldId = id;
        this.sortIndex = index;
    }

    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    public int getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(int sortIndex) {
        this.sortIndex = sortIndex;
    }

    


}
