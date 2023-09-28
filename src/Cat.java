// Cat class definition
public class Cat {

    // instance variables
    private String name;
    private int age;
    private double weight;
    private String food;

    // constructor
    public Cat(String catName, int catAge, double catWeight, String favFood) {
        name = catName;
        age = catAge;
        weight = catWeight;
        food = favFood;
    }

    // method that introduces the Cat
    public void introduce() {
        if (age>7) {
            System.out.println("Hello my name is " + name + " and I am an older cat.");
        }
        else {
            System.out.println("Hello my name is " + name + "and I am a younger cat.");
        }
    }

    // method that prints Cat info
    public void printCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Fav Food: " + food);
    }
}

