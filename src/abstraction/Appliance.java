package abstraction;

abstract class Appliance {
    abstract void turnOn();
}

class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Fan is now running.");
    }
}

class TV extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("TV is now on.");
    }
}

