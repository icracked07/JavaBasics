package Classes;
public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String  engine;
    private  String colour;

    // encapsulation - should not access directly , that's why I had put private.
    public void setModel(String model) {
        // how to distinguish b/w two model & model.
        //this.model=model;
        // this helps in referring to the field of class.
        String validModel=model.toLowerCase();
        if(validModel.equals("c7")) {
            this.model=model;
        } else {
            this.model = "unknown";
        }
    }
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
