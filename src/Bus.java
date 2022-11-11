public class Bus extends Transport {


    public Bus(String brand, String model, int year, String country, String color, double maxMovementSpeed) {
        super(brand, model, year, country, color, maxMovementSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Можно заправиться бензином или дизелем.");
    }

    public void printBus() {
        System.out.println("Бренд: "+getBrand()+", модель: "+getModel()+ ", сборка: " +getCountry()+
                ", цвет кузова: " +getColor()+", год выпуска: "+getYear()+
                ", максимальная скорость - " +getMaxMovementSpeed()+ "км.ч.");
    }

}
