package ro.myClass.models;

public class Car extends Vehicle{

    private String model;
    private int an;

    public Car(int id,String owner ,String color,int price,String model,int an){
        super("car", id, owner, color, price);
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

    @Override
    public void setPret() {
        super.setPret();

    }

}
