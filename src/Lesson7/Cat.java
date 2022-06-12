package Lesson7;

public class Cat<appetite> {
    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void eat(Plate plateIs) {
        boolean isHungry = plateIs.getFood() >= appetite;
        if (isHungry) {
            if (plateIs.getFood() >= appetite) {
                plateIs.decrisefood(appetite);
                System.out.println(name + " сытый, сожрал все");
            }
        } else {
            System.out.println(name + " еще голодный");
        }
    }

    public void info() {
        System.out.println(name + ", " + appetite);
    }

}
