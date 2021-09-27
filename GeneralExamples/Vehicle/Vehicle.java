package GeneralExamples.Vehicle;

public class Vehicle {
    
    public String name;
    public String type;

    public Vehicle(String name, String type){
        this.name = name;
        this.type = type;
    }

    protected void getName(){
        System.out.println("Name of car"+name);
    }

    public void getType(){
        System.out.println("Type "+ type);
    }
}
