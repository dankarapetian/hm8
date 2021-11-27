package lesson7;

public class Factory implements UniversalFactory {
    @Override
    public void work() {
        System.out.println("Фабрика работает.......");
    }

    @Override
    public void stopWorking() {
        System.out.println("Фабрика перестала работать.......");
    }

    @Override
    public void startWorking() {
        System.out.println("Фабрика начала работать.......");
    }

    @Override
    public void produceCar() {
        System.out.println("Фабрика произвела машину.......");
    }
}