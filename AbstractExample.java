abstract class Appliance{
    abstract void turnOn();
}

class Fan extends Appliance{
    @Override
    void turnOn(){
        System.out.println("The fan is ON");
    }
}

class TV extends Appliance{
    @Override
    void turnOn(){
        System.out.println("The TV is ON");
    }
}

public class AbstractExample {
    public static void main(String[]args){
        Appliance myFan=new Fan();
        Appliance myTV=new TV();

        myFan.turnOn();
        myTV.turnOn();
    }
}