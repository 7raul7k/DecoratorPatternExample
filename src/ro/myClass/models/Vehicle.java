package ro.myClass.models;

public abstract class Vehicle {

    public enum Size{BIG,SMALL,MEDIUM};
    Size size = Size.BIG;
    private int id;
    private String owner;
    private String color;
    private int price;
    private String type;
    public void afisare(){
        System.out.println("Im a vehicle");
    };
    public  Vehicle duplicare(){
        return this;
    }

    public  void setSize(){
        if(hasAirplane()){
            this.price = price +100;
        }else if(hasBike()){
            this.price=price+50;
        }else if(hasAirplane()){
            this.price = price+300;
        }
    }
    public boolean hasCar(){
        if(this.type.equals("car")){
            return true;
        }
        return false;
    }
    public boolean hasBike(){
        if(this.type.equals("bike")){
            return true;
        }
        return false;
    }
    public boolean hasAirplane(){
        if(this.type.equals("airplane")){
            return true;
        }
        return false;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
