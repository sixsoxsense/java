package personal_private;

public class Interface {
    String name;

    public void feed(Predator predator) {
        System.out.println("feed" + predator.getFood());
    }

    public static void main(String[] args) {
        Interface zooKeeper = new Interface();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Interface implements Predator {
    public String getFood() {
        return "apple";
    }
}

class Lion extends Interface implements Predator {
    public String getFood() {
        return "banana";
    }
}

interface Predator {
    public String getFood();
}