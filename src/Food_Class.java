// Parent class
class Food {
    protected String name;
    protected int calories;

    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String describe() {
        return name + " has " + calories + " calories.";
    }
}

// Child class
class Fruit extends Food {
    private int sugarContent;

    public Fruit(String name, int calories, int sugarContent) {
        super(name, calories);
        this.sugarContent = sugarContent;
    }

    @Override
    public String describe() {
        return name + " is a fruit with " + calories + " calories and " + sugarContent + "g of sugar.";
    }
}

// Child class
class Vegetable extends Food {
    private double fiberContent;

    public Vegetable(String name, int calories, double fiberContent) {
        super(name, calories);
        this.fiberContent = fiberContent;
    }

    @Override
    public String describe() {
        return name + " is a vegetable with " + calories + " calories and " + fiberContent + "g of fiber.";
    }
}

public class Food_Class {
    public static void main(String[] args) {
        // Creating instances of the child classes
        Fruit apple = new Fruit("Apple", 95, 19);
        Vegetable carrot = new Vegetable("Carrot", 41, 2.8);

        // Accessing the describe method
        System.out.println(apple.describe());   // Output: Apple is a fruit with 95 calories and 19g of sugar.
        System.out.println(carrot.describe());  // Output: Carrot is a vegetable with 41 calories and 2.8g of fiber.
    }
}
