import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Person sheldon = new Person("Sheldon");
        Person leonard = new Person("Leonard");
        Person volovitc = new Person("Volovitc");
        Person kutrapalli = new Person("Kutrapalli");
        Person penny = new Person("Penny");

        Deque<Person> deque = new ArrayDeque<>();
        sheldon.setDeque(deque);
        leonard.setDeque(deque);
        volovitc.setDeque(deque);
        kutrapalli.setDeque(deque);
        penny.setDeque(deque);
        drinkCola(2, deque);
        System.out.println(deque);
    }

    public static void drinkCola(int glasses, Deque<Person> deque) {
        if (deque == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < glasses; i++) {
            deque.pollFirst().drinkCola();
        }
    }
}
