package Lesson7_1;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety; // сытость по ТЗ


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        // кошки отказываются есть, если еды мало
        if (satiety == true) {
            System.out.println(name + " спит. Сытость: " + satiety);
            return;
        }
        if (plate.decreaseFood(appetite) == 1) {
            satiety = true;
            System.out.println(name + " Спасибо, поел. Сытость: " + satiety);
        } else {
            System.out.println(name + " Еды мало! Сытость: " + satiety);
        }
    }

    public void eatAll(Plate plate) {
        // кошки едят до полного наполнения живота
        System.out.println(name + " в столовой, имеет аппетит " + appetite );
        if (appetite == 0) {
            System.out.println(name + " аппетит отсутствует, т.к. нажрался ранее" );
            return;
        }
        if (plate.food == 0) {
            System.out.println(" К сожалению еда закончилась! ");
        }
        appetite -= plate.decreaseAllFood(appetite);
        System.out.println(name + " ел, на данный момент имеет аппетит " + appetite );
    }

}
