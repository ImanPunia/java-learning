package Decorator;

public class Iphone extends SmartPhoneWrapper{

    public Iphone(Phone phone) {
        super(phone);
    }
    
    @Override
    public String build(){
        return super.build() + addOS();
    }
  
    public String addOS() {
        return " IOS";
    }
}
