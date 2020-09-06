package HomeWork_6;


public class Animals {
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    protected double maxJump;

    public Animals(String name){
        this.name = name;
    }

    public void run(int dist) {
        if (this.maxRun >= dist) System.out.println(this.type + " " + this.name + " run " + dist + " m.");
        else System.out.println(this.type + " " + this.name + " can't run so far.");
    }

    public void swim(int dist) {
        if (this.maxSwim >= dist) System.out.println(this.type + " " + this.name + " swim " + dist + " m.");
        else System.out.println(this.type + " " + this.name + " can't swim so far.");
    }

    public void jump(double height) {
        if (this.maxJump >= height)
            System.out.println(this.type + " " + this.name + " jump " + height + " m.");
        else System.out.println(this.type + " " + this.name + " can't jump so hi.");
    }

    public void info() {
        System.out.println(this.type + " " + this.name + " Run: " + this.maxRun + " m., Swim: " + this.maxSwim + " m., Jump: " + this.maxJump + " m.");
    }
}
