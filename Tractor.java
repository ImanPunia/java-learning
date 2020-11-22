import Vehicle.Vehicle;


public class Tractor extends Vehicle{
    
    String purpose;

    Tractor(String name, String type, String purpose){
        super(name, type);
        this.purpose = purpose;
    }

    public void getPurpose(){
        System.out.println("Purpose" + purpose);
    }

    public static void main(String[] arg){
        Tractor v = new Tractor("Ford","four wheeler","Farming");
        v.getName();
        v.getType();
        v.getPurpose();
    }

}
