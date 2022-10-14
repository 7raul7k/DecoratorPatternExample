package ro.myClass.models;

public class FuelSystem extends PartsDecorator {
    private Vehicle vehicle;
    @Override
    public void getDescription() {
        vehicle.afisare();System.out.print("new Fuel System");

    }

    @Override
    public void setSize() {
        int price = vehicle.getPrice();
        if(vehicle.getSize() == Size.SMALL){
            vehicle.setPrice(price + 150);
        }
        if(vehicle.getSize() == Size.MEDIUM){
            vehicle.setPrice(price + 300);
        }
        if(vehicle.getSize() == Size.BIG){
            vehicle.setPrice(price + 400);
        }

    }
}
