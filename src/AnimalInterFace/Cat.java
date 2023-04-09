package AnimalInterFace;

public class Cat implements  AbleToMakeSound {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public void makeSound() {
        System.out.println(this.name  + " - Мяяяу!");
    }

    @Override
    public void action() {
        System.out.println(this.name  + "- мурррр!");

    }
}
