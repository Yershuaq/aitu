import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Employee("Janibek", "Buryndyquly", "Khan", 6640));
        persons.add(new Employee("Kerey", "Oryshanuly", "Sultan", 3500));
        persons.add(new Employee("Qasym ", "Kereyuly", "mini Khan", 894200));
        persons.add(new Employee("Cristiano", "Ronaldo", "Futbolist", 78456));
        persons.add(new Employee("Charlz", "Darwin", "Professor", 355660));
        persons.add(new Employee("Abylai", "Zhumash","Shegol", 570));
        persons.add(new Student("Ilyas", "Qabylda", 2.05));
        persons.add(new Student("Nickey", "Nose", 2.45));
        persons.add(new Student("Bat", "Man", 3.14));
        persons.add(new Student("Ben", "Ten", 3.96));

        Collections.sort(persons);
        printData(persons);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}
