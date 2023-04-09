package AnimalInterFace;

public class Main {
    public static void main(String[] args) {

    Human human = new Human("Борис");
    Cat cat = new Cat("Флаф");

    human.makeSound();
    cat.makeSound();
    human.action();
    cat.action();




    }
}

