package HomeWork_6;

public class Dog extends Animals {
    public Dog(String name) {
        super(name);
        this.type = "Dog";
        this.maxRun = (int) (Math.random() * 100 + 400);
        this.maxSwim = (int) (Math.random() * 2 + 8);
        this.maxJump = Math.random() * 0.1 + 0.4;
    }

}
