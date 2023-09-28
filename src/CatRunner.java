public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Shiney", 3, 3.5, "fish");
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Lily", 9, 5.5, "cat treats");
        cat2.introduce();
        cat2.printCatInfo();
    }
}

