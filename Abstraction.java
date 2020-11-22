abstract class Wrestler{

    public void paymentForWork(int hours){
        System.out.println("The wrestler will make $"+hours*250.00);
    }
    public abstract void themeMusic();
    public abstract void finisher();
}

class Kane extends Wrestler{
    @Override
    public void themeMusic(){
        System.out.println("Kane's Intro music...");
    }

    @Override
    public void finisher() {
        System.out.println("Kane's finishing TombStone...");
    }
}


interface Wrestlers {

    public  abstract void paymentForWork (int hours);
    public abstract void themeMusic();
    public abstract void finisher();
}

class StoneCold implements Wrestlers {
    @Override
    public void paymentForWork(int hours) {
        System.out.println("Stone cold will make $" + hours*300.00);
    }
    @Override
    public void themeMusic() {       
        System.out.println("Stone cold's music playing...");
    }

    @Override
    public void finisher() {        
        System.out.println("Stone cold's finishing stunner...");
    }
}

public class Abstraction {
    public static void main (String [] args) {
        Wrestler wrestler1= new Kane();

        wrestler1.themeMusic();
        wrestler1.paymentForWork(5);
        wrestler1.finisher();

        Wrestlers wrestler2= new StoneCold();

        wrestler2.themeMusic();
        wrestler2.paymentForWork(5);
        wrestler2.finisher();
    }
}
