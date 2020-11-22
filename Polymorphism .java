class Vehicle{
        public void move(){
            System.out.println("Vehicle move");
        }
}

class HondaAccord extends Vehicle{

    @Override
    public void move(){
        System.out.println("depress accelerator");
    }
}

class Cycle extends Vehicle{

    @Override
    public void move(){
        System.out.println("pedal");
    }
}

class Polymorphism  {
    
    public static void main(String[] arg){
        Vehicle vh = new Cycle();
        vh.move();
        vh = new Vehicle();
        vh.move();
        vh = new HondaAccord();
        vh.move();

        StaticPolymorphism staticPoly = new StaticPolymorphism();
              System.out.println(staticPoly.addition(8, 9));
              System.out.println(staticPoly.addition(5, 7, 4));
              System.out.println(staticPoly.addition(4, 7.6));
    }
}


 class StaticPolymorphism {

    public int addition(int a, double b) {
           return a + (int) b;
    }

    public int addition(int a, int b, int c) {
           return a + b + c;
    }

    public int addition(int a, int b) {
         return   addition(a, b , 0);
    }

}