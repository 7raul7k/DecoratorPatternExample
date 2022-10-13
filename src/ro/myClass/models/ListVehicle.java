package ro.myClass.models;

import java.util.ArrayList;

public class ListVehicle {
    public ArrayList<Vehicle> vehicles;

    public ListVehicle(ArrayList<Vehicle> vehicle) {
        this.vehicles = vehicle;
    }

    public void afisare() {
        for(int i =  0 ; i < vehicles.size();i++){
            vehicles.get(i).afisare();
        }

    }

    public ArrayList<Vehicle> duplicare(Vehicle vehicle) {
        for (int i = 0 ; i < vehicles.size();i++){


        }
        return vehicles;

    }
    public void setPret(){

    }
}
