//parent class
class Bike {

    public int gear;
    public int speed;

    // Bike(int gear , int speed){
    //     this.gear = gear;
    //     this.speed = speed;
    // }

    public void applyBrake(int value){
        speed =- value;
    }

    public void IncreaseSpeed(int value){
        speed =+ value;
    }

    public String toString(){
        return "no. of gears are "+ gear + "speed of bicycle is "+ speed ;
    }
}

//derived class
class MountainBike extends Bike{

    public int seatHeight;

    //Bike() constuctor of super class is being called implicitly
    MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
    
    //Bike() constuctor of super class is being called implicitly
    public MountainBike(int gear,int speed,int startHeight) 
    { 
        this.gear = gear;
        this.speed = speed;
        // super(gear, speed); 
        seatHeight = startHeight; 
    }  
          
    public void setHeight(int newValue) 
    { 
        seatHeight = newValue; 
    }  
     
    @Override
    public String toString() 
    { 
        return (super.toString()+ "\nseat height is "+seatHeight); 
    } 

}

public class Inheritance {
    public static void main(String args[])  
    { 
          
        MountainBike mb = new MountainBike(3, 100, 25); 
        System.out.println(mb.toString()); 
              
    } 
}
