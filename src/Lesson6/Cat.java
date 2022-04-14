package Lesson6;

public class Cat extends Animal {
    private static int catCount;

    Cat(String name) {
        super(name, 200, 0);
        catCount++;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Котики здесь не плавают!");
    }

    public void swim() {
        System.out.println("Котики здесь не плавают!");
    }

    public static void getCatCount() {
        System.out.println("Всего кошек " + catCount);
    }

}
