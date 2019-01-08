package Base.task4;

public class MainBaseTask4 {
    public static void main(String[] args) {
        Car car = new Car();

        car.start();
        car.isGoes();
        System.out.println("Бензина осталось: " + car.getFuelLevel() + " л");
        car.refuel(6);
        System.out.println("Бензина осталось: " + car.getFuelLevel() + " л");
        //while (car.getFuelLevel() > 10){}
        car.stop();
        car.isGoes();
        System.out.println("Бензина осталось: " + car.getFuelLevel() + " л");
    }
}
