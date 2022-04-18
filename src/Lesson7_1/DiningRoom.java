package Lesson7_1;

public class DiningRoom {
        public static void main(String[] args) {
            Cat cat1 = new Cat("Барсик", 50);
            Cat cat2 = new Cat("Соня", 5);
            Cat cat3 = new Cat("Пушка", 10);
            Cat cat4 = new Cat("Васька", 70);
            Cat cat5 = new Cat("Феликс", 100);

            Plate plate1 = new Plate(100);
            plate1.info();

//  Алгоритм ТЗ, в котором кошки отказываются от еды, если ее не достаточно
//        cat1.eat(plate1);
//        cat2.eat(plate1);
//        cat3.eat(plate1);
//        cat4.eat(plate1);
//        cat5.eat(plate1);

//   Следуя этому алгоритму кошки жрут все до полного наполнения желудка
            cat1.eatAll(plate1);
            cat2.eatAll(plate1);
            cat3.eatAll(plate1);
            cat4.eatAll(plate1);
            cat5.eatAll(plate1);

            plate1.info();
            plate1.addFood(100);
            plate1.info();

//  Алгоритм ТЗ, в котором кошки отказываются от еды, если ее не достаточно
//        cat1.eat(plate1);
//        cat2.eat(plate1);
//        cat3.eat(plate1);
//        cat4.eat(plate1);
//        cat5.eat(plate1);

//   Следуя этому алгоритму кошки жрут все до полного наполнения желудка
            cat1.eatAll(plate1);
            cat2.eatAll(plate1);
            cat3.eatAll(plate1);
            cat4.eatAll(plate1);
            cat5.eatAll(plate1);

            plate1.info();

        }

}
