package ro.myClass.models;

public abstract class Vehicle {
    private int id;
    private String type;
    private String owner;
    private String color;
    private int price;
    public Vehicle(String type,int id,String owner ,String color,int price){
        this.type = type;
        this.id = id;
        this.owner = owner;
        this.color = color;
        this.price = price;
    }
    public abstract void afisare();
    public abstract Vehicle duplicare();
    public  void setPret(){
        int calcularePret = 0 ;
        if(hasCar()){
            this.price = 4000;
        }
        if(hasBike()){
            this.price = 1300;
        }
        if(hasAirplane()){
            this.price = 8000;
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
