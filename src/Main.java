import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class Product {
    private double price;
    private String name;
    private String description;
    private int quantity;

    public Product(double price, String name, String description, int quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    // Getters and setters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Cosmetics extends Product {
    private String color;
    private double weight;

    public Cosmetics(double price, String name, String description, int quantity, String color, double weight) {
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }

    // Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Electronics extends Product {
    private String type;
    private double length;
    private double width;
    private double height;
    private double weight;

    public Electronics(double price, String name, String description, int quantity, String type,
                       double length, double width, double height, double weight) {
        super(price, name, description, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    // Getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Fridge extends Electronics {
    private int temperature;

    public Fridge(double price, String name, String description, int quantity, String type,
                  double length, double width, double height, double weight, int temperature) {
        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature = temperature;
    }

    // Getters and setters
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}

class Person {
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;

    public Person(String firstName, String lastName, LocalDateTime birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }
}

class PersonInfo {
    private Person person;

    public PersonInfo(Person person) {
        this.person = person;
    }

    // Method to get full name
    public String getFullName() {
        return person.getFirstName() + " " + person.getLastName();
    }

    // Method to calculate age
    public long getAge() {
        LocalDateTime now = LocalDateTime.now();
        return ChronoUnit.YEARS.between(person.getBirthDate(), now);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of the classes and use them
        Cosmetics lipstick = new Cosmetics(10.99, "Lipstick", "Red lipstick", 5, "Red", 0.1);
        Electronics phone = new Electronics(699.99, "Smartphone", "Latest smartphone model", 10,
                "Smartphone", 5.8, 2.7, 0.3, 0.2);
        Fridge fridge = new Fridge(999.99, "Fridge", "Smart fridge with touchscreen", 3,
                "Fridge", 70, 80, 180, 80, 4);

        // Access properties of the objects
        System.out.println("Product: " + lipstick.getName() + ", Price: $" + lipstick.getPrice() + ", Color: " + lipstick.getColor());
        System.out.println("Product: " + phone.getName() + ", Price: $" + phone.getPrice() + ", Type: " + phone.getType());
        System.out.println("Product: " + fridge.getName() + ", Price: $" + fridge.getPrice() + ", Temperature: " + fridge.getTemperature() + "°C");

        // Create a person
        LocalDateTime birthDate = LocalDateTime.of(1990, 5, 15, 0, 0);
        Person person = new Person("John", "Doe", birthDate);

        // Create a PersonInfo object
        PersonInfo personInfo = new PersonInfo(person);

        // Accessing person-related data
        System.out.println("Full Name: " + personInfo.getFullName());
        System.out.println("Age: " + personInfo.getAge());
    }
}
