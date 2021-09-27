package Decorator;

public class AndroidPhone extends SmartPhoneWrapper{

    public AndroidPhone(Phone phone) {
        super(phone);
    }
   
    @Override
    public String build(){
        return super.build() + addOS();
    }
  
    public String addOS() {
        return " android";
    }    
}
