package Lesson6;

public class Dog extends Animal {
    private static int dogCount;

    Dog(String name) {
        super(name);
        this.maxRunDistance = 500;
        this.maxSwimDistance = 10;
        dogCount++;
    }

    public static void getDogCount() {
        System.out.println("Всего собак " + dogCount);
    }
}
