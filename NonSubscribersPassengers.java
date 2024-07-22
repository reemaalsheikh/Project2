public class NonSubscribersPassengers extends Passenger{
    //Non-Subscribers passengers:
    // have boolean value named discount coupon and gets a 10% discount on the trip cost if they have it.
    private boolean  discount_coupon;

    public NonSubscribersPassengers(String id, String name, boolean discount_coupon) {
        super(id, name);
        this.discount_coupon = discount_coupon;
    }

    public boolean isDiscount_coupon() {
        return discount_coupon;
    }

    public void setDiscount_coupon(boolean discount_coupon) {
        this.discount_coupon = discount_coupon;
    }

    //Trip cost = car_object.route_object.price - (car_object.route_object.price 0.1) --> in case the non-subscribers passengers have a discount coupon.
    //Trip cost = car_object.route_object.price --> in case the non-subscribers passengers don’t have a discount coupon.
    @Override
   public void reserveCar(Car car) throws Exception{

        if(car.getMaximum_capacity() == 0){
           throw new Exception("Cannot reserve a car with 0 maximum capacity");
        }
        this.reservedCar = car;

      if (discount_coupon) {
           tripCost= car.route.getTrip_price() - car.route.getTrip_price()*0.1;
        }
        else{
            tripCost =car.route.getTrip_price();}

    //tripCost = discount_coupon ? (car.route.getTrip_price() - car.route.getTrip_price()*0.1) : car.route.getTrip_price();
    }

    @Override
    public void displayPassengerInfo() {
        System.out.println();
        System.out.println("Non-Subscribers Passenger Information:");
        System.out.println("Passenger Name: " + getName());
        System.out.println("Passenger ID: " + getId());
        System.out.println("Trip Cost: " + tripCost);
        System.out.println("Reserved Car code:"+ reservedCar.getCode());
        System.out.println("Route Price: " + reservedCar.getRoute().getTrip_price());


    }
}
