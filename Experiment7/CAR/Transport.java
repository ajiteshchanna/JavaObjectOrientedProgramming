package CAR;
class Vehicle{
    String model;
    String color;
    Vehicle(String model,String color){
        this.model = model;
        this.color = color;
    }
    void maxSpeed(){
        System.out.println("Max speed of this vehicle is not known!");
    }
}
class Car extends Vehicle{
    int horsePower;
    int maxSpeed;
    Car(String model,String color,int horsePower,int maxSpeed){
        super(model,color);
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }
    void maxSpeed(){
        System.out.println("The maximum speed of this car is " + maxSpeed + "km/hr");
    }
}
class Bicycle extends Vehicle{
    int gearCount;
    int maxSpeed;
    Bicycle(String model,String color,int gearCount,int maxSpeed){
        super(model, color);
        this.gearCount = gearCount;
        this.maxSpeed = maxSpeed;
    }
    void maxSpeed(){
        System.out.println("The maximum speed of this bycicle is " + maxSpeed + "km/hr");
    }
}
class Scooter extends Vehicle{
    boolean hasCarrier;
    int maxSpeed;
    public Scooter(String model, String color, boolean hasCarrier,int maxSpeed) {
        super(model, color);
        this.hasCarrier = hasCarrier;
        this.maxSpeed = maxSpeed;
    }

    public void maxSpeed() {
        System.out.println("The maximum speed of the scooter is 90 km/h.");
    }
}
public class Transport{
    public static void main(String[] args) {
        Vehicle car = new Car("Sedan", "Red", 150,120);
        Vehicle bicycle = new Bicycle("Mountain Bike", "Blue", 18,14);
        Vehicle scooter = new Scooter("Vespa", "Black", true,50);

        System.out.println("Car:");
        car.maxSpeed();
        System.out.println("\nBicycle:");
        bicycle.maxSpeed();
        System.out.println("\nScooter:");
        scooter.maxSpeed();
    }
}