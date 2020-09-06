package HomeWork_6;

public class Cat extends Animals {

    public Cat(String name) {
        super(name);
        this.maxJump = Math.random() + 1;
        this.maxRun = (int) (Math.random() * 50 + 150);
        this.type = "Cat";
    }

    @Override
    public void swim(int dist) {
        System.out.println("Cat's no swim!");
    }
}
