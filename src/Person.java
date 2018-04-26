import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class Person {
    private String name;
    private Deque<Person> deque = new ArrayDeque<>();

    public Person() {
    }

    public boolean drinkCola() {
        if (deque==null) {
            return false;
        }
        deque.addLast(new Person(name, deque));
        deque.addLast(new Person(name, deque));
        return true;
    }

    public Person(String name, Deque<Person> deque) {
        this.name = name;
        this.deque = deque;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Deque<Person> getDeque() {
        return deque;
    }

    public void setDeque(Deque<Person> deque) {
        this.deque = deque;
        deque.addLast(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(deque, person.deque);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, deque);
    }

    @Override
    public String toString() {
        return name;
    }
}
