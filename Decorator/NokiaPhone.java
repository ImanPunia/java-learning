package Decorator;

public class NokiaPhone extends SmartPhoneWrapper{

    public NokiaPhone(Phone phone) {
        super(phone);
    }
    
    @Override
    public String build(){
        return super.build() + addBranding();
    }
  
    private String addBranding() {
        return " Microsift ";
    }

}
