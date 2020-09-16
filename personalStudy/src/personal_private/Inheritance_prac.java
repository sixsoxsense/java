package personal_private;

public class Inheritance_prac {
    String name;

    public static void main(String[] args) {
        Inheritance_prac one = new Inheritance_prac();
        dog two = new dog();
        one.setName("asd");
        two.setName("dsa");
        System.out.println(one.getName());
        System.out.println(two.getName());
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class dog extends Inheritance_prac{

}