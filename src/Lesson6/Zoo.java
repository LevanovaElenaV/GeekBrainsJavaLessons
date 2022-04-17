package Lesson6;

public class Zoo {
    public static void main(String[] args) {

        Cat myCat = new Cat("Барсик");
        myCat.run(150);
        myCat.run(550);
        myCat.run(-550);
        myCat.swim();
        myCat.swim(-1);
        myCat.swim(100);


        Dog myDog = new Dog("Шарик");
        Dog myDog2 = new Dog("Тузик");
        Dog myDog3 = new Dog("Белка");
        myDog.swim(5);
        myDog2.swim(-1);
        myDog3.swim(0);
        myDog2.swim(2000);
        // Значение статического счетчика сохраняется между выховами конструкторов, поэтому любой экземпляр животного знает, сколько животных своего вида и вообще животных создано.
        myDog2.getDogCount();
        myDog3.getAnimalCount();
        myCat.getAnimalCount();
        myCat.getCatCount();
    }
}
