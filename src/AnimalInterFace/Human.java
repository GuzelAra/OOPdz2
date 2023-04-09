package AnimalInterFace;

public class Human implements AbleToMakeSound {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " - Кис-кис");
    }

    @Override
    public void action() {
        System.out.println(this.name + " гладит котика");
    }
}
