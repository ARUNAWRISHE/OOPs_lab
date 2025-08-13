class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

class Electronics extends Product {
    Electronics(String name, double price) {
        super(name, price);
    }

    void warranty() {
        System.out.println(name + " has 1-year warranty.");
    }
}

class SmartPhone extends Electronics { // Multi-level Inheritance
    SmartPhone(String name, double price) {
        super(name, price);
    }

    void unlock() {
        System.out.println(name + " can be unlocked with fingerprint.");
    }
}

public class E_commerce {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("Pixel 6", 699);
        sp.display();
        sp.warranty();
        sp.unlock();
    }
}