package Base.task4;

public class Car {
    private static int fuel = 35;
    private boolean carStarted = false;

    public void start(){
        System.out.println("Легковой автомобиль начал движение");
        carStarted = true;
    }

    public void stop(){
        System.out.println("Легковой автомобиль остановился");
        carStarted = false;
    }

    public void isGoes(){
        if (!carStarted){
            System.out.println("Легковой автомобиль стоит на месте");
        } else {
            System.out.println("Легковой автомобиль сейчас движется");
        }
    }

    public void refuel(int f){
        System.out.println("Легковой автомобиль заправлен на " + f + " л");
        fuel = fuel + f;
    }

    public int getFuelLevel(){
        return fuel;
    }
}
