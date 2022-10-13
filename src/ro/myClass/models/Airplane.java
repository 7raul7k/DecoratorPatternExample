package ro.myClass.models;

public class Airplane extends VehicleDecorator{

    private int numberofEngine;
    private Vehicle vehicle;
    public Airplane(int id,String owner ,String color,int price,int numberofEngine){
        super.setId(id);
        super.setOwner(owner);
        super.setColor(color);
        super.setPrice(price);
        this.numberofEngine = numberofEngine;
    }
    @Override
    public void afisare() {
        System.out.println("Type: " + super.getType());
        System.out.println("ID:" + super.getId());
        System.out.println("Owner:" + super.getOwner());
        System.out.println("Color: " + super.getColor());
        System.out.println("Price: " + super.getPrice());
        System.out.println("Number of engine: " + numberofEngine);
        System.out.println("\n==================================\n");

    }

    @Override
    public Vehicle duplicare() {
        int id = super.getId();
        String owner = super.getOwner();
        String color = super.getColor();
        int price = super.getPrice();
        int numberofEngine = this.numberofEngine;
        Airplane airplane = new Airplane(id,owner,color,price,numberofEngine);
        return airplane;
    }

   public void setPrice(){
        int price = this.getPrice();
        if(vehicle.getSize() == Size.BIG){
            this.setPrice(price+400);
        }else if(vehicle.getSize() == Size.MEDIUM){
            this.setPrice(price+200);
        }else if(vehicle.getSize() == Size.SMALL){
            this.setPrice(price+100);
        }

    }

    public int getNumberofEngine() {
        return numberofEngine;
    }

    public void setNumberofEngine(int numberofEngine) {
        this.numberofEngine = numberofEngine;
    }

    @Override
    public void getDescription() {
        this.afisare();
    }
}
