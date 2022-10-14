package ro.myClass.models;

public class CoolingSystem extends PartsDecorator{
    private Vehicle vehicle;

    public CoolingSystem(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void getDescription() {
        vehicle.afisare();System.out.print("new Fuel System");

    }

    @Override
    public void setSize() {
        int price = vehicle.getPrice();
        if(vehicle.getSize() == Size.SMALL){
            vehicle.setPrice(price + 300);
        }
        if(vehicle.getSize() == Size.MEDIUM){
            vehicle.setPrice(price + 600);
        }
        if(vehicle.getSize() == Size.BIG){
            vehicle.setPrice(price + 700);
        }

    }
}
