interface Bird {
    void eat();
    void sing();
}

abstract class AbstractBird implements Bird {
    public void sing() {
        System.out.println("Птички поют");
    }

    public abstract void eat();
}

class Sparrow extends AbstractBird {
    public void eat() {
        System.out.println("Воробьи едят");
    }
}

class Penguin extends AbstractBird {
    public void eat() {
        System.out.println("Пингвины не едят семена");
    }
}

class Worm implements Bird {
	public void eat() {
        	System.out.println("Червяк ест всё");
	}
	public void sing() {
        	System.out.println("Червяк не поет");
    }
}
class Main {
    public static void main(String[] args) {
        AbstractBird sparrow = new Sparrow();
        sparrow.eat();
        sparrow.sing();

        AbstractBird penguin = new Penguin();
        penguin.eat();
        penguin.sing();

        Worm worm = new Worm();
        worm.eat();
	worm.sing();
    }
}

