public class Honda extends Car {
    private String name;

    public Honda() {
    }

    public Honda(String name, double weight, String model, String maxSpeed, String designation, String color) {
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
        return "Honda \n" +
                "Name: " + name + "\n" +
                super.toString();
    }
}
