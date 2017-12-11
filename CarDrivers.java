package carspecs;

import carspecs.CarSpecs;

public class CarDrivers {
    public static void main(String [] args) {
        CarSpecs myCar = new CarSpecs();
        CarSpecs hisCar = new CarSpecs("Gray", 250, 2.4, "Toyota");
        CarSpecs herCar = new CarSpecs("White", 300, 2.4, "Ford");

        System.out.println(myCar);
        System.out.println(hisCar);
        System.out.println(herCar);

        myCar.setColor("Pitch Black"); myCar.setHorsePower(500); myCar.setEngineSize(6.4);
        myCar.setMake("Dodge");

        hisCar.setColor("Gray"); hisCar.setHorsePower(250); hisCar.setEngineSize(2.4); hisCar.setMake("Toyota");

        herCar.setColor("White"); herCar.setEngineSize(300); herCar.setEngineSize(2.4); herCar.setMake("Ford");

        System.out.println(myCar.getColor() + " " +myCar.getHorsePower() + " " + myCar.getEngineSize() + " " + myCar.getMake());

        System.out.println(hisCar.getColor() + " " +hisCar.getHorsePower() + " " + hisCar.getEngineSize() + " " + hisCar.getMake());

        System.out.println(herCar.getColor() + " " +herCar.getHorsePower() + " " + herCar.getEngineSize() + " " + herCar.getMake());
    }

}
