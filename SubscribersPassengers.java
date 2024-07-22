public class SubscribersPassengers extends Passenger{
    //Subscribers passengers: take 50% discount on trip cost when they reserve a car .
    public SubscribersPassengers(String id, String name) {
        super(id, name);
    }

    @Override
    public void setTripCost(double trip_cost) {
        super.setTripCost(trip_cost);
    }

    @Override
    public double getTripCost() {
        return super.getTripCost();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }



    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.getMaximum_capacity()==0) {
     throw new Exception("Cannot reserve a car with 0 maximum capacity");
   }
    this.reservedCar =car;
   tripCost = car.route.getTrip_price() * 0.5;

    }


    @Override
    public void displayPassengerInfo() {
        System.out.println();
        System.out.println("Subscribers Passenger Information:");
        System.out.println("Passenger Name: " + getName());
        System.out.println("Passenger ID: " + getId());
        System.out.println("Trip Cost: " + tripCost);
        System.out.println("Reserved Car Code: " + reservedCar.getCode());
        System.out.println("Route Price: " +   reservedCar.getRoute().getTrip_price());

    }



}
