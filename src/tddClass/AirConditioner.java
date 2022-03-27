package tddClass;

public class AirConditioner {
    private boolean turnOn;
    public void turnOn() {turnOn = !turnOn;
    }

    public boolean getOn(){return turnOn;}
}
