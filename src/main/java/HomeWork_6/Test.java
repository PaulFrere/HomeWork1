package HomeWork_6;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Pushok");

        Dog dog1 = new Dog("Bobik");
        Dog dog2 = new Dog("Sharik");

        cat1.info();
        cat2.info();

        System.out.println();

        dog1.info();
        dog2.info();

        System.out.println();

        dog1.run(400);
        dog1.swim(5);
        dog1.jump(0.3);

        System.out.println();

        dog2.run(600);
        dog2.swim(9);
        dog2.jump(0.4);

        System.out.println();

        cat1.run(100);
        cat1.swim(5);
        cat1.jump(1.7);

        System.out.println();

        cat2.run(180);
        cat2.swim(0);
        cat2.jump(1.1);
    }
    }

