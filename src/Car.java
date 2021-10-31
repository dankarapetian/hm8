
public class Car{

    int volume;
    int weight;
    String model;
    int maxSpeed;

    public boolean equals(Car car) {
        if (this.maxSpeed > car.maxSpeed)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.model = "Ferrari";
        car1.maxSpeed = 630;
        car1.volume = 6;
        car1.weight = 650;

        Car car2 = new Car();
        car2.model = "Lada";
        car2.maxSpeed = 120;
        car2.volume = 4;
        car2.weight = 490;

        System.out.println(car1.equals(car2));
        if (car1.equals(car2))
            System.out.println("Ferrari автомобиль скорее всего выиграет гонку.");
        else
            System.out.println("Lada автомобиль скорее всего выиграет гонку.");

    }
}
