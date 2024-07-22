import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//Car Pooling System is an application that helps managing cars scheduling and bookings.

//Create 2 routes
    Route route1 = new Route("PickUp Address:Hotel", "Desstination Address: Museum", 100);
    Route route2 = new Route("PickUp Address: Park", "Desstination Address: Hotel", 200);



//Assign each of them to a different Car object.
//Note: one of those cars should have a maximum capacity equal to zero.

    Car car1 = new Car("C123a4567r", route1, 0);
    Car car2 = new Car("C325a0092r", route2, 3);


//Create an array of Passengers containing 1 Subscriber and 1 non-Subscriber.
     ArrayList<Passenger> passengers = new ArrayList<>();

    passengers.add(new SubscribersPassengers("800128456", "Reema"));

    passengers.add(new NonSubscribersPassengers("123986546", "Saud", false));
    passengers.add(new NonSubscribersPassengers("125678900", "Khalid", true));
    passengers.add(new NonSubscribersPassengers("125999900", "Reema", true));



//Assign a different car object to each passenger and then display their information.

for (Passenger passenger : passengers) {
    try {
    passenger.reserveCar(passenger instanceof SubscribersPassengers ? car1: car2);

    }catch (Exception e) {
        System.out.println(e.getMessage());
        continue;
    }
    passenger.displayPassengerInfo();


}


    }
}