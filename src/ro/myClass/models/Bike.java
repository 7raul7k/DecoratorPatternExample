package ro.myClass.models;

public class Bike extends Vehicle{
    private String tipBicicleta;
    private Vehicle vehicle;

    public Bike(int id,String owner ,String color,int price,String tipBicicleta){
        super.setId(id);
        super.setOwner(owner);
        super.setColor(color);
        super.setPrice(price);
        this.tipBicicleta = tipBicicleta;
    }

    @Override
    public void afisare() {
        System.out.println("Type: " + super.getType());
        System.out.println("ID:" + super.getId());
        System.out.println("Owner:" + super.getOwner());
        System.out.println("Color: " + super.getColor());
        System.out.println("Price: " + super.getPrice());
        System.out.println("Type bike: " + tipBicicleta);
        System.out.println("\n==================================\n");

    }

    @Override
    public Vehicle duplicare() {
        int id = super.getId();
        String owner = super.getOwner();
        String color = super.getColor();
        int price = super.getPrice();
        String tipBicicleta = this.tipBicicleta;
        Bike bike = new Bike(id,owner,color,price,tipBicicleta);
        return bike;
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


    public String getTipBicicleta() {
        return tipBicicleta;
    }

    public void setTipBicicleta(String tipBicicleta) {
        this.tipBicicleta = tipBicicleta;
    }


}
