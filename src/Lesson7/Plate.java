package Lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int decreaseFood(int n) {
        // Тут котики не кушают, если еды не достаточно
        if (n <= food) {
            food -= n;
            return 1;
        } else {
            return 0;
        }
    }

    // код немного дублируем по сравнению с функцией выше - это потому, чтобы проверяющему было проще разделять алгоритм в ТЗ и мой
    public int decreaseAllFood(int n) {
        // Тут кошки жрут столько, сколько влезет.
        // По идее этот факт нормальное свойство кошек и к тарелкам никак не относится
        int ate;

        if (n <= food) {
            food -= n;
            return n;
        } else {
            ate = food;
            food -= food;
            return ate;
        }
    }


    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int n) {
        food += n;
    }

}
