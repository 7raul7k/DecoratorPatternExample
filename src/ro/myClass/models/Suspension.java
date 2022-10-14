package ro.myClass.models;

public class Suspension extends PartsDecorator{
    private Vehicle vehicle;
    @Override
    public void getDescription() {
        vehicle.afisare();System.out.print("new suspension");

    }

    @Override
    public void setSize() {
        int price = vehicle.getPrice();
        if(vehicle.getSize() == Size.SMALL){
          vehicle.setPrice(price + 100);
        }
        if(vehicle.getSize() == Size.MEDIUM){
            vehicle.setPrice(price + 250);
        }
        if(vehicle.getSize() == Size.BIG){
            vehicle.setPrice(price + 550);
        }

    }
}
