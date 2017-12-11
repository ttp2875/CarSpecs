package carspecs;

public class CarSpecs {
    private String color;
    private int horsePower;
    private double engineSize;
    private String make;


public CarSpecs() {
    color = "Pitch Black";
    horsePower = 500;
    engineSize = 6.4;
    make = "Dodge";
}

    public CarSpecs(String color, int hoursePower, double engineSize, String make) {
        this.color = color;
        this.horsePower = hoursePower;
        this.engineSize = engineSize;
        this.make = make;
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
}

