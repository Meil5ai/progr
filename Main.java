interface Bird {
    void fly();
    void sing();
}

abstract class AbstractBird implements Bird {
    @Override
    public void sing() {
        System.out.println("Птица поет.");
    }

    @Override
    public abstract void fly();
}

class Sparrow extends AbstractBird {
    @Override
    public void fly() {
        System.out.println("Воробей летит.");
    }
}

class Penguin extends AbstractBird {
    @Override
    public void fly() {
        System.out.println("Пингвины не умеют летать.");
    }
}
class Worm {
    public void crawl() {
        System.out.println("The worm is crawling slowly on the ground.");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractBird sparrow = new Sparrow();
        sparrow.fly(); 
        sparrow.sing();

        AbstractBird penguin = new Penguin();
        penguin.fly();  
        penguin.sing();

	Worm worm = new Worm();
        worm.crawl(); 	

    }
}

