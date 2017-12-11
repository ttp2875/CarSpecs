package carspecs;

public class CarSpecs {
    private String color;
    private int horsePower;
    private double engineSize;
    private String make;
    private static int count = 0;


    public CarSpecs() {
        this("Pitch Black", 500, 6.4, "Dodge");
    }

    public CarSpecs(String color, int hoursePower, double engineSize, String make) {
        this.color = color;
        this.horsePower = hoursePower;
        this.engineSize = engineSize;
        this.make = make;
        count++;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public String getMake() {
        return make;
    }

    public String toString() {
        return "Color " + color + " Horse Power " + horsePower + " Engine Size " + engineSize + " Make " + make;
    }
    public static int getCount() {
        return count;
    }
    public boolean equals(CarSpecs car) {
        return this.color.equals(car.color) && this.horsePower == car.horsePower && this.engineSize == car.engineSize && this.make.equals(car.make);
    }
}



