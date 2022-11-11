public class Train extends Transport {

    private double priceOfTheTrip;
    private String travelTime;
    private String nameOfDepartureStation;
    private String endingStation;
    private int numberOfWagons;

    public Train(String brand, String model, int year, String country, double maxMovementSpeed) {
        super(brand, model, year, country, maxMovementSpeed);
    }

    public Train(String brand, String model, int year, String country, double maxMovementSpeed,
                 double priceOfTheTrip, String travelTime, String nameOfDepartureStation, String endingStation,
                 int numberOfWagons) {
        super(brand, model, year, country, maxMovementSpeed);
        this.priceOfTheTrip = priceOfTheTrip;
        this.travelTime = travelTime;
        this.nameOfDepartureStation = nameOfDepartureStation;
        this.endingStation = endingStation;
        this.numberOfWagons = numberOfWagons;
    }

    public void printTrain() {
        System.out.println( "Поезд " + getBrand()+ ", модель " + getModel()+","+getYear()+" год выпуска в "+ getCountry()+
                 ", скорость передвижения - "+getMaxMovementSpeed()+" км/ч, отходит от " +nameOfDepartureStation+
                " вокзала и следует до станции "+endingStation+". Цена поездки — " +priceOfTheTrip+
                " рублей, в поезде "+numberOfWagons+ " вагонов.");

    }

    @Override
    public void refill() {
        System.out.println("Необходимо заправиться дизелем.");
    }

    public double getPriceOfTheTrip() {
        return priceOfTheTrip;
    }

    public void setPriceOfTheTrip(double priceOfTheTrip) {
        if (priceOfTheTrip <= 0) {
            this.priceOfTheTrip = priceOfTheTrip;
        }
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        if (travelTime == null || travelTime.isEmpty() || travelTime.isBlank())  {
            this.travelTime = travelTime;
        }
    }

    public String getNameOfDepartureStation() {
        return nameOfDepartureStation;
    }

    public void setNameOfDepartureStation(String nameOfDepartureStation) {
        if (nameOfDepartureStation == null || nameOfDepartureStation.isEmpty() || nameOfDepartureStation.isBlank()) {
            this.nameOfDepartureStation = nameOfDepartureStation;
        }
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        if (endingStation == null || endingStation.isEmpty() || endingStation.isBlank()) {
            this.endingStation = endingStation;
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons <= 0)
            this.numberOfWagons = numberOfWagons;
        }
    }


