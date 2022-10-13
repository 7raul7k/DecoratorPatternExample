package ro.myClass.models;

public class Bike extends Vehicle{
    private String tipBicicleta;

    public Bike(int id,String owner ,String color,int price,String tipBicicleta){
        super("bike", id, owner, color, price);
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

    @Override
    public void setPret() {
        super.setPret();
    }

    public String getTipBicicleta() {
        return tipBicicleta;
    }

    public void setTipBicicleta(String tipBicicleta) {
        this.tipBicicleta = tipBicicleta;
    }
}
