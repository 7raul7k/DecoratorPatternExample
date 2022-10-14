package ro.myClass.models;

public class Engine extends PartsDecorator {
    private Vehicle vehicle;

    public Engine(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void getDescription() {
        vehicle.afisare();System.out.print("new Engine");

    }

    @Override
    public void setSize() {
        int price = vehicle.getPrice();
        if(vehicle.getSize() == Size.SMALL){
            vehicle.setPrice(price + 500);
        }
        if(vehicle.getSize() == Size.MEDIUM){
            vehicle.setPrice(price + 800);
        }
        if(vehicle.getSize() == Size.BIG){
            vehicle.setPrice(price + 1000);
        }

    }
}
