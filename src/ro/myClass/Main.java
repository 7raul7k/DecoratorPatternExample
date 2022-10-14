package ro.myClass;

import ro.myClass.input.LowerInputStream;
import ro.myClass.models.*;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(1,"Alexandru popescu","rosu",2500,"Audi",2008);
        car = new FuelSystem(car);
        car = new CoolingSystem(car);
        car = new Engine(car);

        Vehicle airplane = new Airplane(2,"Mihaescu Eduard","galben",60000,5);
        airplane = new CoolingSystem(airplane);

    }
}