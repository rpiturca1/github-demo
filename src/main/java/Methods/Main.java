package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("Tim's car");
        Car anotherCar = new Car("The Batmobile");

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.brake();
        myCar.accelerate();

        anotherCar.brake();
    }
}

class Car {

    private int speed = 0;
    private String name;

    public Car(String carName) {
        name = carName;
    }

    public void accelerate() {
        speed++;
        showSpeed();
    }

    public void brake() {
        speed--;
        showSpeed();
    }

    private void showSpeed() {
        System.out.printf("%s is going %d miles per hour.%n", name, speed);
    }
}
