package activities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
        plane.onboard("Person1");
        plane.onboard("Person2");
        plane.onboard("Person3");
        plane.onboard("Person4");
        plane.onboard("Person5");
        plane.onboard("Person6");
        plane.onboard("Person7");
        plane.onboard("Person8");
        System.out.println("Plane took off at: " + plane.takeOff());
        System.out.println("PassengerList: " + plane.getPassengers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());

    }
}
class Plane {

    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passenger) {
        this.passengers.add(passenger);
    }

    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }

    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}