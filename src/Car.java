public class Car {
    private double weight;
    private String Model;
    private String maxSpeed;
    private String designation;
    private String color;

    public Car(double weight, String model, String maxSpeed, String designation, String color) {
        this.weight = weight;
        Model = model;
        this.maxSpeed = maxSpeed;
        this.designation = designation;
        this.color = color;
    }

    public Car() {

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "Weight: " + weight + "\n" +
                        "Model: " + Model + "\n" +
                        "Max speed: " + maxSpeed + "\n" +
                        "Designation: " + designation + "\n" +
                        "Color: " + color;
    }
}
