package ro.myClass.models;

public class Car extends Vehicle{
    private Vehicle vehicle;

    private String model;
    private int an;

    public Car(int id,String owner ,String color,int price,String model,int an){
        super.setId(id);
        super.setOwner(owner);
        super.setColor(color);
        super.setPrice(price);
        this.model = model;
        this.an = an;

    }

    @Override
    public void afisare() {
        System.out.println("Type: " + super.getType());
        System.out.println("ID:" + super.getId());
        System.out.println("Owner:" + super.getOwner());
        System.out.println("Color:" + super.getColor());
        System.out.println("Price: " + super.getPrice());
        System.out.println("Model: " + model);
        System.out.println("Year: " + an);
        System.out.println("\n==================================\n");

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

    @Override
    public Vehicle duplicare() {
        int id = super.getId();
        String owner = super.getOwner();
        String color = super.getColor();
        int price = super.getPrice();
        String model = this.model;
        int an = this.an;
        Car car = new Car(id,owner,color,price,model,an);
        return car;


    }




}
