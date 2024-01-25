import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = createAndPopulatePersonsList();

        printPersonsData("Unsorted Persons:", persons);

        sortPersonsList(persons);

        printPersonsData("Sorted Persons:", persons);
    }

    private static List<Person> createAndPopulatePersonsList() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Employee("Janibek", "Buryndyquly", "Khan", 5420));
        persons.add(new Employee("Kerey", "Oryshanuly", "Sultan", 4200));
        persons.add(new Employee("Qasym ", "Kereyuly", "mini Khan", 1150000));
        persons.add(new Employee("Cristiano", "Ronaldo", "Futbolist", 163450));
        persons.add(new Employee("Charlz", "Darwin", "Professor", 360500));
        persons.add(new Student("Abylai", "Zhumash", 2.81));
        persons.add(new Student("Ilyas", "Qabylda", 2.17));
        persons.add(new Student("Nickey", "Nose", 2.02));
        persons.add(new Student("Bat", "Man", 3.14));
        persons.add(new Student("Ben", "Ten", 3.83));
        return persons;
    }

    private static void sortPersonsList(List<Person> persons) {
        Collections.sort(persons);
    }

    private static void printPersonsData(String header, Iterable<Person> persons) {
        System.out.println(header);
        persons.forEach(person -> System.out.println(person.printData()));
        System.out.println();
    }
}
