package HomeWork_7;

public class Plate {
    private int food;

    int getFood() {
        return food;
    }

    Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int n) {
        food -= n;
    }

    void increaseFood() {
        this.food += 100;
        System.out.println("В миску добавили 100 грамм корма");
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }
}
