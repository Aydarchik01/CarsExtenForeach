public class Bmw extends Car {
    private String name;

    public Bmw() {
    }

    public Bmw(double weight, String model, String maxSpeed, String designation, String color) {
        super(weight, model, maxSpeed, designation, color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bmw\n" +
                "Name: " + name + "\n" +
                super.toString();
    }
}
