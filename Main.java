interface Flyable {
    void fly();
    void land();
}

interface Singable {
    void sing();
}

interface Nestable {
    void buildNest();
}

class Bird implements Flyable, Singable, Nestable {
    @Override
    public void fly() {
        System.out.println("The bird is flying.");
    }

    @Override
    public void land() {
        System.out.println("The bird has landed.");
    }

    @Override
    public void sing() {
        System.out.println("The bird is singing.");
    }

    @Override
    public void buildNest() {
        System.out.println("The bird is building a nest.");
    }
}

class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.land();
        bird.sing();
        bird.buildNest();
    }
}
