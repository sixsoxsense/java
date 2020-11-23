package collection;

import java.util.*;

public class collection {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<String>();
        animal.add("dog");
        animal.add("cat");
        animal.add("horse");
        String longest = "";
        for (int i = 0; i < animal.size(); i++) {
            if (longest.length() < animal.get(i).length()) {
                longest = animal.get(i);
            }
        }
        System.out.println(longest);
        //Iterable 아님
        Iterator<String> it = animal.iterator();
        String longest2 = "";
        while (it.hasNext()) {
            String value = it.next();
            if (longest2.length() < value.length()) {
                longest2 = value;
            }
        }
        System.out.println(longest2);

        Stack<String> numbers = new Stack<String>();
        numbers.push("1");
        numbers.push("2");
        numbers.push("3");
        while (!numbers.isEmpty()) {
            System.out.println(numbers.pop());
        }

        TreeSet<String> numberss = new TreeSet<>();
        numberss.add("1.");
        numberss.add("2.");
        numberss.add("3.");
        numberss.add("1.");
        numberss.add("2.");

        Iterator<String> ir= numberss.iterator();
        while (ir.hasNext()){
            System.out.println(ir.next());
        }
        System.out.println(numberss.first());
        System.out.println(numberss.last());
    }
}
