package Decorator;

//Decorator
public abstract class SmartPhoneWrapper implements Phone{

    private final Phone phone;

    public SmartPhoneWrapper(Phone phone) {
        this.phone = phone;
    }

    public String build(){
        return phone.build();
    }
    
}
