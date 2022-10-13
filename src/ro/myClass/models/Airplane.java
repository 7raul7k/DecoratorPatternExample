package ro.myClass.models;

public class Airplane extends Vehicle{
    private int numberofEngine;
    public Airplane(int id,String owner ,String color,int price,int numberofEngine){
        super("airplane", id, owner, color, price);
        this.numberofEngine = numberofEngine;
    }
    @Override
    public void afisare() {

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
    @Override
    public void setPret(){
        super.setPret();
    }

    public int getNumberofEngine() {
        return numberofEngine;
    }

    public void setNumberofEngine(int numberofEngine) {
        this.numberofEngine = numberofEngine;
    }
}
