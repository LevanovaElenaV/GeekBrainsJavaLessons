package Lesson6;

public class Animal {
    String name;
    int maxRunDistance;
    int maxSwimDistance;
    private static int animalCount;

    Animal() {
        animalCount++;
    }

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCount++;
    }

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
        if (distance < 0) {
            System.out.println(name + " Ошибочка: Дистанция не может быть отрицательной");
            return;
        }
        if (distance <= this.maxRunDistance) System.out.println(name + " бежит " + distance + " м");
        else System.out.println(name + " может пробежать не больше " + this.maxRunDistance + " м");
    }

    public void swim(int distance) {
        if (distance < 0) {
            System.out.println(name + " Ошибочка: Дистанция не может быть отрицательной");
            return;
        }
        if (distance <= this.maxSwimDistance) System.out.println(name + " плывёт "+ distance + " м");
        else System.out.println(name + " может проплыть не больше " + this.maxSwimDistance + " м");
    }

    public static void getAnimalCount() {
        System.out.println("Всего животных " + animalCount);
    }

}
