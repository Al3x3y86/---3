import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача Car");

        Car Lada = new Car("Lada","Granta", 1.7,"желтый",2015,"Россия",
                "МКПП", "", "к123кк123", 4, false,
                new Car.Key(false,false), new Car.Insurance(LocalDate.now(),7000,"9876543231"));
        Lada.printCar();
        Lada.getInsurance().checkInsuranceNumber();
        Lada.getInsurance().checkValidity();

        Car Audi = new Car("Audi","A8 50L TDI quattro", 3.0,"черный",
                2020,"Германия");
        Audi.printCar();
        Audi.getInsurance().checkInsuranceNumber();
        Audi.getInsurance().getValidity();

        Car BMW = new Car("BMW","Z8", 3.0,"черный",2021,"Германия");
        BMW.printCar();
        BMW.getInsurance().checkInsuranceNumber();
        BMW.getInsurance().getValidity();

        Car KIA = new Car("KIA","Sportage 4-го поколения", 2.4,"красный",
                2018,"Южная Корея", "", "кроссовер", "с186с186",
                -4, true,new Car.Key(true, true),
                new Car.Insurance(LocalDate.of(2022,11,18), 13000, "123459876"));
        KIA.printCar();
        KIA.getInsurance().checkInsuranceNumber();
        KIA.getInsurance().getValidity();

        Car Hyundai = new Car("Hyundai","Avante", 1.6,"оранжевый",
                2016,"Южная Корея");
        Hyundai.printCar();
        Hyundai.getInsurance().checkInsuranceNumber();
        Hyundai.getInsurance().getValidity();
        BMW.refill();

        System.out.println("Задача Train");

        Train Lastochka = new Train("Ласточка","В-902",2011,"России",301,3500,
                "1 день","Белорусского","Минск-Пассажирский", 11);
        Lastochka.printTrain();

        Train Leningrad = new Train("Ленинград","D-125",2019,"России",270,1700,
                "3 часа","Ленинградского","Ленинград-Пассажирский", 8);
        Leningrad.printTrain();
        Lastochka.refill();

        System.out.println("Задача Bus");

        Bus Puz = new Bus ("ПАЗ", "320405-04",2020, "Россия","белый",80);
        Puz.printBus();
        Bus HyundaiBus = new Bus ( "Hyundai", "Universe",2018,"Южная Корея", "Синий", 120 );
        HyundaiBus.printBus();
        Bus LiAZ = new Bus( "ЛиАЗ","529265", 2016,"Россия","Желтый",80);
        LiAZ.printBus();
        HyundaiBus.refill();

    }
}