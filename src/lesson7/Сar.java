package lesson7;

public class Сar implements UniversalCar {
    boolean itIsAutomaticTransmission;

    public Сar(boolean itIsAutomaticTransmission) {
        this.itIsAutomaticTransmission = itIsAutomaticTransmission;
    }

    public Сar() {
    }

    @Override
    public void whatTransmission() {
        if (itIsAutomaticTransmission)
            System.out.println("Машина c автоматической коробкой передач.......");
        else
            System.out.println("Машина c механической коробкой передач.......");
    }

    @Override
    public void drive() {
        System.out.println("Машина едет.......");
    }

    @Override
    public void getStarted() {
        System.out.println("Машина завелась.......");
    }

    @Override
    public void stop() {
        System.out.println("Машина остановилась.......");
    }

    @Override
    public void openDoors() {
        System.out.println("Машина открыла двери.......");
    }

    @Override
    public void changeDirection() {
        System.out.println("Машина поменяла направление.......");
    }

    @Override
    public void closeDoors() {
        System.out.println("Машина закрыла двери.......");
    }

    @Override
    public void carIsReady() {
        System.out.println("Машина готова к работе.......");
    }

    @Override
    public void setTransmission(boolean itIsAutomaticTransmission) {
        this.itIsAutomaticTransmission = itIsAutomaticTransmission;
    }
}

