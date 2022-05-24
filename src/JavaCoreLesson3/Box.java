package JavaCoreLesson3;

public class Box<T> {
    private T obj;  // Тип коробки. Предполагается, что могут быть только 2 типа: для яблок и для апельсинов
    String name;
    private int volume; // максимально допустимое количество фруктов того типа, для которого предназначена коробка
    private int quantity; // количество фруктов в коробке

    public Box(T obj, String name, int volume) {
        this.obj = obj;
        this.name = name;
        this.volume = volume;
        this.quantity = 0;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public String  getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }

    public int getVolume() {
        return volume;
    }

    public String getSympleName() {
        return obj.getClass().getSimpleName();
    }

    public double getWeight() {
        String tmpStr = this.obj.getClass().getSimpleName();
        if (tmpStr.equals("Apple")) {
             return (double) quantity;
        } else if (tmpStr.equals("Orange")) {
            return 1.5 * quantity;
        } else {
            System.out.println("Недопустимый тип корзины");
            return (double) -1;
        }
    }

    public void takeFruit() {
        if (quantity > 0) --quantity;
        else return;
    }

    public void putFruit() {
        if (quantity < volume) ++quantity;
        else return;
    }

    public boolean compareType(Box box) {
        String tmpStr1 = this.obj.getClass().getSimpleName();
        String tmpStr2 = box.obj.getClass().getSimpleName();
        if (tmpStr1.equals(tmpStr2)) return true;
        return false;
    }

    public boolean compare (Box box) {
        if (this.getWeight() == box.getWeight()) return true;
        else return false;
    }

    public boolean shifting (Box boxDest) {
        // перекладываем фрукты из этой коробки в boxDest
        // возвращает true, если успешно переложены все фрукты
        if (this.compareType(boxDest) == false) {
            System.out.println("Корзины разных типов, невозможно переложить фрукты");
            return false;
        }
        while ((this.quantity > 0) && ((boxDest.volume - boxDest.quantity) > 0))  {
             this.takeFruit();
             boxDest.putFruit();
        }
        if (this.quantity == 0) return true;
        return false; // в текущей корзине остались фрукты, но корзина назначения уже заполнена.
    }

    public void printTotalInfo() {
        System.out.println("Это " + this.name);
        System.out.println("Вес " + this.getWeight());
        System.out.println("Объем " + this.getVolume());
        System.out.println("Количество фруктов " + this.getQuantity());
        System.out.println("Объект " + this.getObj());
        System.out.println("Тип " + this.getSympleName() + "\n");
    }
}
