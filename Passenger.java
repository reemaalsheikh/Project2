public abstract class  Passenger {
    //Passenger (parent class) has: name, ID, reserved Car object, trip cost.
    private String name;
    private String id;
    public Car reservedCar;
    public double tripCost;


    public Passenger(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }


    //an abstract function that takes a car object
    public abstract void reserveCar (Car car) throws Exception;

    //a function that should be overridden to display their information along with the car code and route price .
    public abstract void displayPassengerInfo();


}
