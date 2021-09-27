package Decorator;

public class DecoratorExample {
    
    public static void main(String args[]){

        Phone androidPhone = new AndroidPhone(new BasicPhone());
        Phone iPhone = new Iphone(new BasicPhone());

        System.out.println(androidPhone.build());
        System.out.println(iPhone.build());

        Phone nokiaPhone = new NokiaPhone(new WindowPhone(new BasicPhone()));
        System.out.println(nokiaPhone.build());
    }

}
