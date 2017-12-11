package carspecs;
import carspecs.CarSpecs;

import javax.swing.*;



public class CarDrivers {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JLabel color1 = new JLabel("Enter the color");
        JLabel horsePower1 = new JLabel("Enter the horse power");
        JLabel engineSize1 = new JLabel("Enter the engine size");
        JLabel make1 = new JLabel("Enter the manufacturer");
        JTextField horsePower2 = new JTextField("The type of horse power");
        JTextField engineSize2 = new JTextField("The size of engine");
        JTextField color2 = new JTextField("The color of the car");
        JTextField make2 = new JTextField("The manufacturer");
        JButton button = new JButton("Submit");

        panel.add(color1);
        panel.add(color2);
        panel.add(horsePower1);
        panel.add(horsePower2);
        panel.add(engineSize1);
        panel.add(engineSize2);
        panel.add(make1);
        panel.add(make2);
        panel.add(button);

        JOptionPane.showMessageDialog(null, panel, "Car Specification", JOptionPane.INFORMATION_MESSAGE);

            System.out.println("Number of car(s): " + CarSpecs.getCount());
            String color = JOptionPane.showInputDialog(null, "Enter the color of the car");
            int horsePower = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter horse power of the car"));
            double engineSize = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the engine size of the car"));

            String make = JOptionPane.showInputDialog(null, "Enter the manufacturer of the car");
            CarSpecs myCar = new CarSpecs();
            CarSpecs hisCar = new CarSpecs("Gray", 250, 2.4, "Toyota");
            CarSpecs herCar = new CarSpecs("White", 300, 2.4, "Ford");

            System.out.println(myCar);
            System.out.println(hisCar);
            System.out.println(herCar);

            myCar.setColor("Pitch Black");
            myCar.setHorsePower(500);
            myCar.setEngineSize(6.4);
            myCar.setMake("Dodge");

            hisCar.setColor("Gray");
            hisCar.setHorsePower(250);
            hisCar.setEngineSize(2.4);
            hisCar.setMake("Toyota");

            herCar.setColor("White");
            herCar.setEngineSize(300);
            herCar.setEngineSize(2.4);
            herCar.setMake("Ford");

            System.out.println(myCar.getColor() + " " + myCar.getHorsePower() + " " + myCar.getEngineSize() + " " + myCar.getMake());

            System.out.println(hisCar.getColor() + " " + hisCar.getHorsePower() + " " + hisCar.getEngineSize() + " " + hisCar.getMake());

            System.out.println(herCar.getColor() + " " + herCar.getHorsePower() + " " + herCar.getEngineSize() + " " + herCar.getMake());
            System.out.println("Number of car(s): " + CarSpecs.getCount());
            System.out.println("Is my car is the same as his car? " + myCar.equals(hisCar));
            System.out.println("Is her car is the same as his car? " + herCar.equals(hisCar));
            System.out.println("Is my car is the same as her car? " + myCar.equals(herCar));

    }
}


