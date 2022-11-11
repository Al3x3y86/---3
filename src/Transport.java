public abstract class Transport {

    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private double maxMovementSpeed;

    public Transport(String brand, String model, int year, String country, String color, double maxMovementSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.maxMovementSpeed = maxMovementSpeed;
    }

    public Transport(String brand, String model, int year, String country, double maxMovementSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.maxMovementSpeed = maxMovementSpeed;
    }

    public abstract void refill();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.model = model;
        }
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = color;
        }
    }

    public double getMaxMovementSpeed() {
        return maxMovementSpeed;
    }

    public void setMaxMovementSpeed(double maxMovementSpeed) {
        if (Double.compare(maxMovementSpeed, 0) <= 0) {
            this.maxMovementSpeed = maxMovementSpeed;
        }
    }
}