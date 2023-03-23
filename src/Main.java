public class Main {
    public static void main(String[] args) {
        Mersedes m = new Mersedes();
        m.setName("Mersedes");
        m.setColor("Black");
        m.setDesignation("Mehanick");
        m.setModel("e350");
        m.setMaxSpeed("260 km/h");
        m.setWeight(3.5);

        Bmw b = new Bmw();
        b.setName("BMW");
        b.setColor("Blue");
        b.setDesignation("Automat");
        b.setModel("x6");
        b.setMaxSpeed("250 km/h");
        b.setWeight(2.6);

        Honda h = new Honda();
        h.setName("Honda");
        h.setColor("White");
        h.setDesignation("Mehanick");
        h.setModel("Accort");
        h.setMaxSpeed("200 km/h");
        h.setWeight(3.8);

        Kia k = new Kia();
        k.setName("Kia");
        k.setColor("Elow");
        k.setDesignation("Universal");
        k.setModel("Sport");
        k.setMaxSpeed("280 km/h");
        k.setWeight(2.35);

        Tayota t = new Tayota();
        t.setName("Tayota");
        t.setColor("Black");
        t.setDesignation("Mehanick");
        t.setModel("Camry");
        t.setMaxSpeed("290 km/h");
        t.setWeight(3.66);

        System.out.println(m);
        System.out.println("=================");
        System.out.println(b);
        System.out.println("=================");
        System.out.println(h);
        System.out.println("=================");
        System.out.println(k);
        System.out.println("=================");
        System.out.println(t);
    }
}