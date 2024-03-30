import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapToInt {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35));

        List<Person> personsFiltered = persons.stream().filter((Person person) -> {
            return person.getAge() > 25;
        }).collect(Collectors.toList());

        List<Person> personsWithIncreasedAge = persons.stream()
                .map(person -> {
                    Person updatedPerson = new Person(person.getName(), person.getAge() + 10);
                    // Optionally, you can copy other fields of Person to updatedPerson
                    return updatedPerson;
                })
                .collect(Collectors.toList());

        // Use mapToInt to extract ages as IntStream
        persons.stream()
                .mapToInt(Person::getAge)
                .forEach(System.out::println);

        persons.stream().map((Person a) -> {
            return a.getAge() * 2;
        });

        List<Integer> p = persons.stream()
                .map((Person a) -> {
                    return a.getAge() * 2;
                }).collect(Collectors.toList());

        persons.stream()
                .map(a -> a.getAge() * 2)
                .forEach(System.out::println);

        // persons.stream().filter(a -> a.getAge() >
        // 25).collect(Collectors.toList()).forEach(a -> {
        // System.out.println(a.getName());
        // });
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }
}