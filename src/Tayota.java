public class Tayota extends Car {
    private String name;

    public Tayota() {

    }

    public Tayota(double weight, String model, String maxSpeed, String designation, String color, String name) {
        super(weight, model, maxSpeed, designation, color);
        name = name;
    }

    public Tayota(String name) {
        name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    @Override
    public String toString() {
        return "Honda \n" +
                "Name: " + name + "\n" +
                super.toString();
    }
}
