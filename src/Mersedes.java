public class Mersedes extends Car {
    private String name;

    public Mersedes() {
    }

    public Mersedes(double weight, String model, String maxSpeed, String designation, String color, String name) {
        super(weight, model, maxSpeed, designation, color);
        this.name = name;
    }

    public Mersedes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mersedes\n" +
                "Name: " + name + "\n" +
                super.toString();
    }
}
