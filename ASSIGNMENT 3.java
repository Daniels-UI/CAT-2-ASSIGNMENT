
abstract class Appliance {
    
    abstract void turnOn();
}


class Fan extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Fan is now spinning!");
    }
}


class TV extends Appliance {
    @Override
    void turnOn() {
        System.out.println("TV is now displaying channels!");
    }
}


public class ApplianceDemo {
    public static void main(String[] args) {
        Appliance myFan = new Fan(); 
        Appliance myTV = new TV();   

        myFan.turnOn(); 
        myTV.turnOn();  
    }
}