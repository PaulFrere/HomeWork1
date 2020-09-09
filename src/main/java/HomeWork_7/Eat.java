package HomeWork_7;

public class Eat {
    private static int TIME = 0;

    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Барсик>", 20, 3);
        cat[1] = new Cat("Мурзик", 40, 4);
        cat[2] = new Cat("Пушок", 10, 1);
        Plate plate = new Plate(100);

        do {
            for (Cat i : cat) {

                if (i.getSatiety() == 0) {

                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }

                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " граммов корма и проголодается через " + (i.getSatiety()) + " часа(ов)");
                }

                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("\nС момента начала кормежки прошел(ло) " + TIME + " час(а). В миске осталось " + plate.getFood() + " граммов корма.\n");
            TIME++;

        } while (TIME <= 5);
    }
}
