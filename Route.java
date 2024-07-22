public class Route {
    //Route Class has: start pick up address, destination address, and trip price .
    private String startpickUp_address;
    private String destination_address;
    private double trip_price;

    public Route(String startpickUp_address, String destination_address, double trip_price) {
        this.startpickUp_address = startpickUp_address;
        this.destination_address = destination_address;
        this.trip_price = trip_price;
    }

    public String getStartpickUp_address() {
        return startpickUp_address;
    }

    public void setStartpickUp_address(String startpickUp_address) {
        this.startpickUp_address = startpickUp_address;
    }

    public String getDestination_address() {
        return destination_address;
    }

    public void setDestination_address(String destination_address) {
        this.destination_address = destination_address;
    }

    public double getTrip_price() {
        return trip_price;
    }

    public void setTrip_price(double trip_price) {
        this.trip_price = trip_price;
    }


}
