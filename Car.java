public class Car {
    //Car Class has: a code, a fixed route, a maximum capacity of passengers per trip.
    private String code;
    public Route route;
    private int maximum_capacity;


    public Car(String code, Route route, int maximum_capacity) {
        this.code = code;
        this.route = route;
        this.maximum_capacity = maximum_capacity;

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getMaximum_capacity() {
        return maximum_capacity;
    }

    public void setMaximum_capacity(int maximum_capacity) {
        this.maximum_capacity = maximum_capacity;
    }


}
