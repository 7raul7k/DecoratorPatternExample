package ro.myClass;

import ro.myClass.input.LowerInputStream;
import ro.myClass.models.Car;
import ro.myClass.models.Vehicle;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1,"Alexandru popescu","rosu",2500,"Audi",2008);
        int c;
        try{
            InputStream in = new LowerInputStream(new BufferedInputStream(new FileInputStream("C:\\mycode\\JavaBasics\\Collections\\DecoratorPattern\\src\\ro\\myClass\\resources\\vehicle.txt")));
            while((c=in.read()>=0)){
                System.out.println(((char) c));
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}