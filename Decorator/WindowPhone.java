package Decorator;

public class WindowPhone extends SmartPhoneWrapper{

    public WindowPhone(Phone phone) {
        super(phone);
    }
       
    @Override
    public String build(){
        return super.build() + addOS();
    }
  
    public String addOS() {
        return " Window";
    }
}
